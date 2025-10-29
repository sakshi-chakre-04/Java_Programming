package Assignment_21;

// 1. Write a program to calculate the product of digits of a number.
class Logic {
    void productOfDigits(int num) {
        if (num < 0) { // Make the number positive
            num = -num;
        }
        
        if (num == 0) {
            System.out.println("Product of digits is: 0");
            return;
        }

        int product = 1; // Initialize to 1 for multiplication
        
        while (num != 0) {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }
        System.out.println("Product of digits is: " + product);
    }
}

class program21_1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.productOfDigits(123); // Example from your image (1*2*3 = 6)
        obj.productOfDigits(456); // (4*5*6 = 120)
    }
}