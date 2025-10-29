package Assignment_21;

// 3. Write a program to display all factors of a given number.
class Logic {
    void displayFactors(int num) {
        System.out.print("Factors of " + num + " are: ");
        
        if (num <= 0) {
             System.out.println("N/A (Please enter a positive number)");
             return;
        }

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // To move to the next line
    }
}

class program21_3 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.displayFactors(12); // Example from your image
        obj.displayFactors(100);
    }
}