public class ThrowExample {
    public static void main(String[] args) {
        int num = -5;
        try {
            checkNumber(num);  
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an exception: " + e.getMessage());  
        }
    }

    // Method to check the number
    public static void checkNumber(int num) {
        if (num < 0) {
            // Throw an exception manually if the number is negative
            throw new IllegalArgumentException("Number cannot be negative!");  // Using 'throw' here
        }
        System.out.println("The number is valid: " + num);
    }
}
