package Experiment3;

public class Ques3_ass3 {
    public static void main(String[] args) {
        int[] arr = {12, 32, 22, 54, 39, 53, 19, 89, 73};

        if (arr.length < 2) {
            System.out.println("-1");
            return;
        }

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("-1");
        } else {
            System.out.println("Second largest element: " + secondMax);
        }
    }
}

