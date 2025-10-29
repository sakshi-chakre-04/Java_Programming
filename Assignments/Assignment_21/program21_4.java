package Assignment_21;

// 4. Write a program to count the total number of factors of a given number.
class Logic {
    void countFactors(int num) {
        int count = 0;

        if (num <= 0) {
             System.out.println("Total factors for " + num + ": N/A (Please enter a positive number)");
             return;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        System.out.println("Total number of factors for " + num + " is: " + count);
    }
}

class program21_4 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countFactors(20); // Example from your image (1, 2, 4, 5, 10, 20 -> 6 factors)
    }
}