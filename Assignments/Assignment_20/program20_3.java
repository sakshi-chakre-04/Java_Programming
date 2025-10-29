package Assignment_20;

// 3. Write a program to check whether a number is a perfect number or not.
class Logic {
    void checkPerfect(int num) {
        // A perfect number is a positive integer that is equal to the sum
        // of its proper positive divisors (divisors excluding the number itself).
        
        if (num <= 0) {
            System.out.println(num + " is not a positive integer.");
            return;
        }

        int sum = 0;
        // Loop up to num/2. No number greater than num/2 can be a proper divisor.
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a perfect number.");
        } else {
            System.out.println(num + " is not a perfect number.");
        }
    }
}

class program20_3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkPerfect(6);  // Example from your image (1+2+3 = 6)
        obj.checkPerfect(28); // Another perfect number (1+2+4+7+14 = 28)
        obj.checkPerfect(12); // Not a perfect number (1+2+3+4+6 = 16)
    }
}
