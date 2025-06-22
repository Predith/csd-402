// Kristopher Kuenning
// 06/22/2025
// CSD 402
// Module 6

//Write test code that creates two instances of the Fan class, one using the default constructor and the other using the argument constructor.
public class FanTest {
    public static void main(String[] args) {
        // Create Fan using no-argument constructor
        Fan fan1 = new Fan();

        // Create Fan using parameterized constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10.5, "blue");

        // Display both fans
        System.out.println("Fan 1 (Default Constructor):");
        System.out.println(fan1);

        System.out.println("\nFan 2 (Parameterized Constructor):");
        System.out.println(fan2);

        // Modify fan1 and display it again
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(7.5);
        fan1.setColor("red");

        System.out.println("\nFan 1 (After Modifications):");
        System.out.println(fan1);
    }
}