package Assignment_21;

// 5. Write a program to print all numbers from 1 to N that are divisible by both 2 and 3.
class Logic {
    void printDivisibleBy2and3(int N) {
        System.out.println("Numbers from 1 to " + N + " divisible by both 2 and 3:");
        
        for (int i = 1; i <= N; i++) {
            // A number divisible by 2 AND 3 is also divisible by 6.
            if (i % 6 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // To move to the next line
    }
}

class program21_5 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printDivisibleBy2and3(30); // Example from your image
    }
}