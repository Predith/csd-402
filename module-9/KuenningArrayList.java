// Kristopher Kuenning
// 07/06/2025
// CSD 402
// Module 9

import java.util.ArrayList;
import java.util.Scanner;

public class KuenningArrayList {

    public static void main(String[] args) {

        // Write a program that uses an ArrayList filled with a minimum of 10 Strings.
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Elephant");
        animals.add("Giraffe");
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Bear");
        animals.add("Gorilla");
        animals.add("Red Panda");
        animals.add("Zebra");

        // Use a 'for-each' loop to print the ArrayList collection.
        System.out.println("Current ArrayList contents:");
        for (String a : animals) {
            System.out.println(a);
        }

        //Ask a user which element they would like to see again.
        Scanner scanner = new Scanner(System.in);

        //Attempt printing the element in a try/catch format which will result in the element being displayed
        System.out.print("\nEnter an index (0‑" + (animals.size() - 1) +
                ") of the element you’d like to see again: ");

        //Include the use of Autoboxing/Auto-Unboxing, working with a user String input.
        String input = scanner.nextLine();
        Integer index = Integer.parseInt(input);
        try {
            String element = animals.get(index);
            System.out.println("Element at index " + index + " is: " + element);

            //If the element value received is invalid, display a message that an Exception has been thrown displaying "Out of Bounds".
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }

        scanner.close();
    }
}
