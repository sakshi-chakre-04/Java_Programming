package Assignment_19;

// 4. Write a program to print each digit of a number separately.
class Logic {
    void displayDigits(int num) {
        System.out.println("Digits of " + num + ":");
        
        // Handle negative numbers by making it positive
        if (num < 0) {
            num = -num;
        }
        
        // Handle 0 as a special case
        if (num == 0) {
            System.out.println(0);
            return;
        }

        // We can use a string to print them in the correct order easily
        String numStr = Integer.toString(num);
        for (int i = 0; i < numStr.length(); i++) {
            System.out.println(numStr.charAt(i));
        }

        /* // Alternative: Mathematical way (prints in reverse)
        while (num != 0) {
            int digit = num % 10; // Get the last digit
            System.out.println(digit);
            num = num / 10;       // Remove the last digit
        }
        */
    }
}

class program19_4
 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.displayDigits(123); // Example from your image
        obj.displayDigits(9876);
    }
}