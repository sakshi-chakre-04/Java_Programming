package Assignment_20;

// 5. Write a program to find the smallest digit in a given number.
class Logic {
    void findSmallestDigit(int num) {
        int smallest = 9; // Initialize with the largest possible digit

        if (num < 0) { // Make the number positive
            num = -num;
        }

        if (num == 0) {
            smallest = 0;
        }

        while (num != 0) {
            int digit = num % 10;
            if (digit < smallest) {
                smallest = digit;
            }
            num = num / 10;
        }
        System.out.println("The smallest digit is: " + smallest);
    }
}

class program20_5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findSmallestDigit(65872); // Example from your image
    }
}