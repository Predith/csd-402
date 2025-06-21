// Kristopher Kuenning
// 06/21/2025
// CSD 402
// Module 5

//Write methods using the following headers that returns the location of the largest elements in the array passed to the method returning a one-dimensional array that contains two location elements.

public class Kuenning_Mod5 {

    // Locate largest double 2D array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = new int[2];
        double max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate largest int 2D array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = new int[2];
        int max = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > max) {
                    max = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

//Write methods using the following headers that returns the location of the smallest element in the array passed to the method returning a one-dimensional array that contains two location elements.

    // Locate smallest double 2D array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = new int[2];
        double min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Locate smallest int 2D array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = new int[2];
        int min = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < min) {
                    min = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }

    // Main test method
    public static void main(String[] args) {
        double[][] doubleArray = {
                {1.2, 3.4, 5.6},
                {7.8, 9.0, 0.1}
        };

        int[][] intArray = {
                {4, 5, 6},
                {7, 2, 1}
        };

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);
        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        System.out.printf("Largest (double): [%d][%d]%n", largestDouble[0], largestDouble[1]);
        System.out.printf("Smallest (double): [%d][%d]%n", smallestDouble[0], smallestDouble[1]);
        System.out.printf("Largest (int): [%d][%d]%n", largestInt[0], largestInt[1]);
        System.out.printf("Smallest (int): [%d][%d]%n", smallestInt[0], smallestInt[1]);
    }
}
