package Assignment_19;

// 5. Write a program to calculate the power of a number using loops.
class Logic {
    void calculatePower(int base, int exp) {
        // Use 'long' for the result to prevent overflow (e.g., 2^32 is large)
        long result = 1;

        if (exp < 0) {
            System.out.println("Exponent must be a non-negative integer.");
            return;
        }

        // Multiply 'base' by itself 'exp' times
        for (int i = 1; i <= exp; i++) {
            result = result * base;
        }

        System.out.println(base + " raised to the power " + exp + " is: " + result);
    }
}

class program19_5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.calculatePower(2, 5); // Example from your image
        obj.calculatePower(3, 4);
        obj.calculatePower(5, 0);
    }
}