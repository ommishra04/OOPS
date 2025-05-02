package Experiment3;

import java.util.Scanner;

public class Ques1_ass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {2, 3, 2, 5, 2, 6};

        System.out.print("Enter the number to count: ");
        int target = scanner.nextInt();

        int count = 0;
        for (int num : arr) {
            if (num == target) count++;
        }

        System.out.println("The number " + target + " appears " + count + " times.");
        scanner.close();
    }
}

