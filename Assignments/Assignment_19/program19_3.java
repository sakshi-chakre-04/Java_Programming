package Assignment_19;

// 3. Write a program to check whether a number is divisible by 5 and 11 or not.
class Logic {
    void checkDivisible(int num) {
        if (num % 5 == 0 && num % 11 == 0) {
            System.out.println(num + " is divisible by both 5 and 11.");
        } else {
            System.out.println(num + " is NOT divisible by both 5 and 11.");
        }
    }
}

class program19_3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkDivisible(55); // Example from your image
        obj.checkDivisible(110);
        obj.checkDivisible(20);
    }
}
