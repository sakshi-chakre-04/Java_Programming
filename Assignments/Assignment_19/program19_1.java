package Assignment_19;

// 1. Write a program to check whether a given year is a leap year or not.
class Logic {
    void checkLeapYear(int year) {
        // A year is a leap year if it's divisible by 4
        // but not by 100, UNLESS it's also divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}

class program19_1 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.checkLeapYear(2024); // Example from your image
        obj.checkLeapYear(2023); // Another test
        obj.checkLeapYear(1900); // Test non-leap century
        obj.checkLeapYear(2000); // Test leap century
    }
}