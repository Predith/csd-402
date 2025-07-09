// Kristopher Kuenning
// 07/09/2025
// CSD 402
// Module 10

/*Write an application named UseDivision that creates two instances of each of these concrete classes (4 total instances).
 */

public class UseDivision {
    public static void main(String[] args) {
        // Create two international divisions
        InternationalDivision intl1 = new InternationalDivision("Europe Branch", 101, "Germany", "German");
        InternationalDivision intl2 = new InternationalDivision("Asia Branch", 102, "Japan", "Japanese");

        // Create two domestic divisions
        DomesticDivision dom1 = new DomesticDivision("East Coast Division", 201, "New York");
        DomesticDivision dom2 = new DomesticDivision("West Coast Division", 202, "Seattle");

        // Display all divisions
        intl1.display();
        intl2.display();
        dom1.display();
        dom2.display();
    }
}
