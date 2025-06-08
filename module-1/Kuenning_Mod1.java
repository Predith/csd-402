// Kristopher Kuenning
// 06/01/2025
// CSD-402
// M1: Programming Assignment

// Program to calculate the energy needed to heat water from an initial temperature to a final temperature.

import java.util.Scanner;

public class Kuenning_Mod1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature of the water (in Celsius): ");
        double initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature of the water (in Celsius): ");
        double finalTemperature = input.nextDouble();

        // Define the specific heat capacity of water in joules per kilogram per degree Celsius
        final double SPECIFIC_HEAT_CAPACITY = 4184;

        // Calculate the energy required
        double energyNeeded = waterMass * (finalTemperature - initialTemperature) * SPECIFIC_HEAT_CAPACITY;

        // Output the result
        System.out.printf("The energy needed to heat the water is %.2f Joules.%n", energyNeeded);

        input.close();
    }
}