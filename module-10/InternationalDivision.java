// Kristopher Kuenning
// 07/09/2025
// CSD 402
// Module 10

/* The InternationalDivision class includes a field for the country in which the division is located,
 * a field for the language spoken,
 * and a constructor that requires all fields when created.
 */

public class InternationalDivision extends Division {
    private String country;
    private String language;

    // Constructor
    public InternationalDivision(String divisionName, int accountNumber, String country, String language) {
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }

    // Overridden display method
    @Override
    public void display() {
        System.out.println("International Division");
        System.out.println("Name: " + divisionName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
}
