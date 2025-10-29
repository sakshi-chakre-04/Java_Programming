package Assignment_20;

// 1. Write a program to find the sum of all even numbers up to N.
class Logic {
    void sumEvenNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) { // Check if the number is even
                sum = sum + i;
            }
        }
        System.out.println("Sum of even numbers from 1 to " + N + " is: " + sum);
    }
}

class program20_1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10); // Example from your image
    }
}