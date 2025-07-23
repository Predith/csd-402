// Kristopher Kuenning
// 07/23/2025
// CSD 402
// Module 12

/**
 * A program with four methods for calculating the cost of a yearly auto service visit.
 * Prices are based on average cost (https://www.sofi.com/learn/content/average-cost-oil-change)
 */
public class KuenningAutoService {

    // Method 1: No parameters - Returns standard service charge
    public static double yearlyService() {
        double standardCharge = 199.99;
        return standardCharge;
    }

    // Method 2: One parameter - Oil change added
    public static double yearlyService(double oilChangeFee) {
        double standardCharge = 199.99;
        return standardCharge + oilChangeFee;
    }

    // Method 3: Two parameters - Oil change and tire rotation
    public static double yearlyService(double oilChangeFee, double tireRotationFee) {
        double standardCharge = 199.99;
        return standardCharge + oilChangeFee + tireRotationFee;
    }

    // Method 4: Three parameters - Oil change, tire rotation, and a coupon discount
    public static double yearlyService(double oilChangeFee, double tireRotationFee, double couponDiscount) {
        double standardCharge = 199.99;
        return (standardCharge + oilChangeFee + tireRotationFee) - couponDiscount;
    }

    // Main method to test each method twice
    public static void main(String[] args) {
        // Test 1: No parameters
        System.out.println("Test 1a - Standard service only: $" + yearlyService());
        System.out.println("Test 1b - Standard service only: $" + yearlyService());

        // Test 2: One parameter (oil change)
        System.out.println("Test 2a - Service + Oil Change: $" + yearlyService(29.99));
        System.out.println("Test 2b - Service + Oil Change: $" + yearlyService(34.99));

        // Test 3: Two parameters (oil change + tire rotation)
        System.out.println("Test 3a - Service + Oil Change + Tire Rotation: $" + yearlyService(29.99, 19.99));
        System.out.println("Test 3b - Service + Oil Change + Tire Rotation: $" + yearlyService(34.99, 24.99));

        // Test 4: Three parameters (oil change + tire rotation + coupon)
        System.out.println("Test 4a - Full service with $20 coupon: $" + yearlyService(29.99, 19.99, 20.00));
        System.out.println("Test 4b - Full service with $25 coupon: $" + yearlyService(34.99, 24.99, 25.00));
    }
}
