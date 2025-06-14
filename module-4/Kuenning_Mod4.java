// Kristopher Kuenning
// 06/08/2025
// CSD 402
// Module 3

public class Kuenning_Mod4 {

    // Method for short[]
    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) {
            sum += num;
        }
        return (short) (sum / array.length);
    }

    // Method for int[]
    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for long[]
    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method for double[]
    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Display arrays
    public static void displayArray(String label, Object array) {
        System.out.print(label + ": ");
        if (array instanceof short[]) {
            for (short n : (short[]) array) {
                System.out.print(n + " ");
            }
        } else if (array instanceof int[]) {
            for (int n : (int[]) array) {
                System.out.print(n + " ");
            }
        } else if (array instanceof long[]) {
            for (long n : (long[]) array) {
                System.out.print(n + " ");
            }
        } else if (array instanceof double[]) {
            for (double n : (double[]) array) {
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
    // Display Average
    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {5, 15, 25, 35};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5};

        displayArray("Short Array", shortArray);
        System.out.println("Average: " + average(shortArray));
        System.out.println();

        displayArray("Int Array", intArray);
        System.out.println("Average: " + average(intArray));
        System.out.println();

        displayArray("Long Array", longArray);
        System.out.println("Average: " + average(longArray));
        System.out.println();

        displayArray("Double Array", doubleArray);
        System.out.println("Average: " + average(doubleArray));
        System.out.println();
    }
}
