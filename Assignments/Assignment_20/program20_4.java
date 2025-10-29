package Assignment_20;

// 4. Write a program to find the largest digit in a given number.
class Logic {
    void findLargestDigit(int num) {
        int largest = 0; // Initialize with the smallest possible digit

        if (num < 0) { // Make the number positive
            num = -num;
        }

        if (num == 0) {
            largest = 0;
        }

        while (num != 0) {
            int digit = num % 10;
            if (digit > largest) {
                largest = digit;
            }
            num = num / 10;
        }
        System.out.println("The largest digit is: " + largest);
    }
}

class program20_4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.findLargestDigit(65479); // Example from your image
    }
}