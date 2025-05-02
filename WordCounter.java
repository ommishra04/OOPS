import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the text file: ");
        String fileName = scanner.nextLine();

        try (FileReader reader = new FileReader(fileName)) {
            int charCount = 0;
            int wordCount = 0;
            boolean inWord = false;
            int currentChar;

            while ((currentChar = reader.read()) != -1) {
                char c = (char) currentChar;

                if (!Character.isWhitespace(c)) {
                    charCount++;
                }

                if (Character.isWhitespace(c)) {
                    if (inWord) {
                        wordCount++;
                        inWord = false;
                    }
                } else {
                    inWord = true;
                }
            }

            if (inWord) {
                wordCount++;
            }

            System.out.println("\nFile Analysis Results:");
            System.out.println("Total words: " + wordCount);
            System.out.println("Total characters (excluding whitespace): " + charCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

