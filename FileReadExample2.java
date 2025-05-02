import java.io.*;
import java.util.Scanner;

public class FileReadExample2 {
    public static void readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }
        }
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter file name: ");
            String fileName = inputScanner.nextLine();

            if (fileName.trim().isEmpty()) {
                System.out.println("Error: File name cannot be empty.");
                continue;
            }

            try {
                readFile(fileName);
                break;
            } catch (FileNotFoundException e) {
                System.out.println("Error: File '" + fileName + "' not found.");
            } finally {
                inputScanner.close();
            }
        }
    }
}
