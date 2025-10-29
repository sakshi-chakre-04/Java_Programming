package Assignment_20;

// 2. Write a program to print numbers from N down to 1 in reverse order.
class Logic {
    void printReverse(int N) {
        System.out.println("Numbers from " + N + " down to 1:");
        for (int i = N; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

class program20_2 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.printReverse(10); // Example from your image
    }
}