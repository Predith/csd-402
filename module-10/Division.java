// Kristopher Kuenning
// 07/09/2025
// CSD 402
// Module 10

/* Create an abstract Division class with fields for a company's division name and account number,
 * and an abstract display () method that will be defined in the subclasses.
 * Use a constructor in the superclass that requires values for both fields.
 */

// Abstract superclass
public abstract class Division {
    protected String divisionName;
    protected int accountNumber;

    // Constructor
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    // Abstract method to be defined in subclasses
    public abstract void display();
}
