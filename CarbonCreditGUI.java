package carboncrecdit2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarbonCreditGUI extends JFrame implements ActionListener {
    JTextField companyNameField, emailField, locationField, projectSizeField, workersField;
    JComboBox<String> projectTypeDropdown;
    JTextArea outputArea;
    JButton calculateButton, resetButton;
    JRadioButton yesButton, noButton;
    ButtonGroup verifiedGroup;

    CardLayout cardLayout;
    JPanel cardPanel;

    public CarbonCreditGUI() {
        setTitle("Carbon Credit Estimator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 700);
        setLocationRelativeTo(null);

        setContentPane(new BackgroundPane());

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);
        cardPanel.setOpaque(false);

        Font labelFont = new Font("Serif", Font.ITALIC, 16);

        // PAGE 1: Company Details
        JPanel companyPanel = new JPanel();
        companyPanel.setLayout(new BoxLayout(companyPanel, BoxLayout.Y_AXIS));
        companyPanel.setOpaque(true);
        companyPanel.setBackground(new Color(255, 255, 255, 200));
        companyPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        companyPanel.add(createFormRow("Company Name:", companyNameField = new JTextField(), labelFont));
        companyPanel.add(createFormRow("Email:", emailField = new JTextField(), labelFont));

        // Government Verified?
        JPanel verifiedPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        verifiedPanel.setOpaque(false);
        JLabel verifiedLabel = new JLabel("Government Verified:");
        verifiedLabel.setFont(labelFont);
        yesButton = new JRadioButton("Yes");
        noButton = new JRadioButton("No");
        yesButton.setOpaque(false);
        noButton.setOpaque(false);
        verifiedGroup = new ButtonGroup();
        verifiedGroup.add(yesButton);
        verifiedGroup.add(noButton);
        verifiedPanel.add(verifiedLabel);
        verifiedPanel.add(yesButton);
        verifiedPanel.add(noButton);
        companyPanel.add(verifiedPanel);

        JButton nextButton = new JButton("Next");
        nextButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        nextButton.addActionListener(e -> {
            if (yesButton.isSelected()) {
                cardLayout.show(cardPanel, "ProjectDetails");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Only government-verified companies can proceed.",
                        "Verification Required",
                        JOptionPane.WARNING_MESSAGE);
            }
        });
        companyPanel.add(Box.createVerticalStrut(10));
        companyPanel.add(nextButton);

        // PAGE 2: Project Details
        JPanel projectPanel = new JPanel();
        projectPanel.setLayout(new BoxLayout(projectPanel, BoxLayout.Y_AXIS));
        projectPanel.setOpaque(true);
        projectPanel.setBackground(new Color(255, 255, 255, 200));
        projectPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        projectPanel.add(createFormRow("Project Location:", locationField = new JTextField(), labelFont));
        projectPanel.add(createFormRow("Project Type:", projectTypeDropdown = new JComboBox<>(
                new String[]{"Reforestation", "Renewable Energy", "Afforestation", "Soil Management", "Bioenergy"}), labelFont));
        projectPanel.add(createFormRow("Project Size (hectares/MW):", projectSizeField = new JTextField(), labelFont));
        projectPanel.add(createFormRow("Number of Workers Required:", workersField = new JTextField(), labelFont));

        JPanel buttonRow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonRow.setOpaque(false);
        JButton backButton = new JButton("Back");
        backButton.addActionListener(e -> cardLayout.show(cardPanel, "CompanyDetails"));
        calculateButton = new JButton("Estimate");
        calculateButton.addActionListener(this);
        resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> resetFields());
        buttonRow.add(backButton);
        buttonRow.add(calculateButton);
        buttonRow.add(resetButton);

        projectPanel.add(Box.createVerticalStrut(10));
        projectPanel.add(buttonRow);

        // Output Area
        outputArea = new JTextArea(8, 30);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 13));
        JScrollPane scrollPane = new JScrollPane(outputArea);
        scrollPane.setAlignmentX(Component.CENTER_ALIGNMENT);

        projectPanel.add(Box.createVerticalStrut(10));
        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        projectPanel.add(resultLabel);
        projectPanel.add(scrollPane);

        // Add to Card Layout
        cardPanel.add(companyPanel, "CompanyDetails");
        cardPanel.add(projectPanel, "ProjectDetails");

        // Wrapper for center alignment
        JPanel wrapper = new JPanel();
        wrapper.setOpaque(false);
        wrapper.setLayout(new BoxLayout(wrapper, BoxLayout.Y_AXIS));
        wrapper.add(Box.createVerticalGlue());

        JPanel horizontalWrapper = new JPanel();
        horizontalWrapper.setOpaque(false);
        horizontalWrapper.setLayout(new BoxLayout(horizontalWrapper, BoxLayout.X_AXIS));
        horizontalWrapper.add(Box.createHorizontalGlue());
        horizontalWrapper.add(cardPanel);
        horizontalWrapper.add(Box.createHorizontalGlue());

        wrapper.add(horizontalWrapper);
        wrapper.add(Box.createVerticalGlue());

        setLayout(new BorderLayout());
        add(wrapper, BorderLayout.CENTER);

        setVisible(true);
    }

    private JPanel createFormRow(String labelText, JComponent inputField, Font font) {
        JPanel row = new JPanel(new BorderLayout(10, 5));
        row.setOpaque(false);
        JLabel label = new JLabel(labelText);
        label.setFont(font);
        label.setPreferredSize(new Dimension(200, 25));
        inputField.setPreferredSize(new Dimension(200, 25));
        row.add(label, BorderLayout.WEST);
        row.add(inputField, BorderLayout.CENTER);
        row.setMaximumSize(new Dimension(600, 40));
        return row;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String companyName = companyNameField.getText();
            String email = emailField.getText();
            String location = locationField.getText();
            String projectType = (String) projectTypeDropdown.getSelectedItem();
            int projectSize = Integer.parseInt(projectSizeField.getText());

            int workers;
            if (workersField.getText().trim().isEmpty()) {
                workers = projectSize * 5;
            } else {
                workers = Integer.parseInt(workersField.getText());
            }

            int credits = projectSize * 10;
            double cost = projectSize * 50000.0;

            outputArea.setText("Company: " + companyName + "\n"
                    + "Email: " + email + "\n"
                    + "Location: " + location + "\n"
                    + "Project Type: " + projectType + "\n"
                    + "Project Size: " + projectSize + "\n"
                    + "Workers Required: " + workers + "\n\n"
                    + "Estimated Carbon Credits: " + credits + "\n"
                    + "Estimated Labour Required: " + workers + " workers\n"
                    + "Estimated Cost: ₹" + cost);
        } catch (NumberFormatException ex) {
            outputArea.setText("Please enter valid numbers for project size and workers.");
        }
    }

    private void resetFields() {
        companyNameField.setText("");
        emailField.setText("");
        locationField.setText("");
        projectSizeField.setText("");
        workersField.setText("");
        projectTypeDropdown.setSelectedIndex(0);
        verifiedGroup.clearSelection();
        outputArea.setText("");
    }

    public static void main(String[] args) {
        new CarbonCreditGUI();
    }

    // Background image panel
    class BackgroundPane extends JPanel {
        private Image backgroundImage;

        public BackgroundPane() {
            try {
                backgroundImage = new ImageIcon(getClass().getResource("/carboncredit2/background.png")).getImage();
            } catch (Exception e) {
                System.err.println("Background image not found.");
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (backgroundImage != null) {
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        }
    }
}