import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSum {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(0);
        numbers.add(12);
        numbers.add(14);
        numbers.add(10);
        numbers.add(0);

        HashSet<Integer> uniqueNumbers = new HashSet<>(numbers);

        int sum = 0;
        for (int num : uniqueNumbers) {
            sum += num;
        }

        System.out.println("Input: " + numbers);
        System.out.println("Unique values: " + uniqueNumbers);
        System.out.println("Sum: " + sum);
    }
}
