package Assignment_21;

// 2. Write a program to count how many even and odd numbers are present between 1 and N.
class Logic {
    void countEvenOddRange(int N) {
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Numbers from 1 to " + N + ":");
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}

class program21_2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.countEvenOddRange(50); // Example from your image
    }
}