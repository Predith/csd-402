// Kristopher Kuenning
// 06/08/2025
// CSD 402
// Module 3

public class Kuenning_Mod3 {
    public static void main(String[] args) {
        int rows = 7;

        for (int i = 0; i < rows; i++) {
            // Print leading spaces for triangle centering
            for (int s = 0; s < rows - i - 1; s++) {
                System.out.print("  ");
            }

            // Print increasing powers of 2
            int val = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(val + " ");
                val *= 2;
            }

            // Adjust val for decreasing side
            val /= 4;
            for (int j = 0; j < i; j++) {
                System.out.print(val + " ");
                val /= 2;
            }

            // Calculate remaining spaces to align the @ symbol
            int numCharsPrinted = (rows - i - 1) * 2;
            numCharsPrinted += (i * 2 + 1) * 2 - 1;
            while (numCharsPrinted < 35) {
                System.out.print(" ");
                numCharsPrinted++;
            }

            System.out.println("@");
        }
    }
}
