import java.util.HashSet;
import java.util.Arrays;

public class UniqueNames {
    public static void main(String[] args) {
        String[] names = {"Aman", "Varchasv", "Sourabh", "Varchasv", "Aman"};

        HashSet<String> uniqueNames = new HashSet<>(Arrays.asList(names));

        System.out.println("Unique names in the set:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        String nameToCheck = "Aman";
        System.out.println("\n" + nameToCheck + 
            (uniqueNames.contains(nameToCheck) ? " exists" : " does not exist") + " in the set.");

        nameToCheck = "Apratim";
        System.out.println(nameToCheck + 
            (uniqueNames.contains(nameToCheck) ? " exists" : " does not exist") + " in the set.");
    }
}
