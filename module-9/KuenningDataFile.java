// Kristopher Kuenning
// 07/06/2025
// CSD 402
// Module 9

import java.io.*;
import java.util.Random;
import java.util.Scanner;

//Write a program to create a new file titled data.file, if the file does not exist.
public class KuenningDataFile {

    private static final String FILE_NAME = "data.file";

    public static void main(String[] args) {

        File file = new File(FILE_NAME);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            // Add 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. Each integer is to be separated by a space.
            Random rand = new Random();
            try (FileWriter fw = new FileWriter(file, true);
                 BufferedWriter bw = new BufferedWriter(fw);
                 PrintWriter out = new PrintWriter(bw)) {

                for (int i = 0; i < 10; i++) {
                    int number = rand.nextInt(100);
                    out.print(number + " ");
                }
                out.println();
            }

            // Close the file, then reopen the file and read the data from the file and display it.
            System.out.println("Contents of " + FILE_NAME + ":");
            try (Scanner reader = new Scanner(file)) {
                while (reader.hasNextLine()) {
                    System.out.println(reader.nextLine());
                }
            }

        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        }
    }
}
