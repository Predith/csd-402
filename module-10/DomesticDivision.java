// Kristopher Kuenning
// 07/09/2025
// CSD 402
// Module 10

/* The DomesticDivision class includes a field for the state in which the division is located
 * and a constructor that requires all fields when created.
 */

public class DomesticDivision extends Division {
    private String state;

    // Constructor
    public DomesticDivision(String divisionName, int accountNumber, String state) {
        super(divisionName, accountNumber);
        this.state = state;
    }

    // Overridden display method
    @Override
    public void display() {
        System.out.println("Domestic Division");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
