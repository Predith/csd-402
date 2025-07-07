// Kristopher Kuenning
// 07/06/2025
// CSD 402
// Module 8

 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.InputMismatchException;
 import java.util.Scanner;

 // Create a class [yourName]ArrayListTest.
public class KuenningArrayListTest {

    // The method signature is to be public static Integer max (ArrayList list)
    public static Integer max(ArrayList list) {

        // If the ArrayList is sent in empty, the method will then return 0.
        if (list == null || list.isEmpty()) {
            return 0;
        }

        Integer max = (Integer) list.get(0);
        for (Object obj : list) {
            Integer value = (Integer) obj;
            if (value > max) {
                max = value;
            }
        }

        //The method is then to return the largest value in the ArrayList.
        return max;
    }

     //A method that receives an ArrayList populated with an Integer data type holding the integers received by user input.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // The user input is to accept Integers that are then assigned to the ArrayList until a value of 0 is entered, which is also assigned to the ArrayList.
        System.out.println("Enter integers one per line (enter 0 to finish; 0 will be included in the list):");
        while (true) {
            try {
                int value = scanner.nextInt();
                numbers.add(value);
                if (value == 0) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter an integer value.");
                scanner.next();
            }
        }

        // The method will return the largest value that is displayed to the user.
        Integer maxFromInput = max(numbers);
        System.out.println("The largest value you entered is: " + maxFromInput);

        // Write additional code for testing your method.
        ArrayList<Integer> emptyList = new ArrayList<>();
        System.out.println("Test with empty list (expected 0): " + max(emptyList));

        ArrayList<Integer> predefinedList = new ArrayList<>(Arrays.asList(1, 5, 3, 7, 2, 0));
        System.out.println("Test with predefined list (expected 7): " + max(predefinedList));

        scanner.close();
    }
}
