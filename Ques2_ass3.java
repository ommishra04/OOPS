package Experiment3;

public class Ques2_ass3 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2, 4, 10, 8, 9, 3};
        int n = arr.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) actualSum += num;

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}

