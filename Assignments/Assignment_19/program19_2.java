package Assignment_19;

// 2. Write a program to display the grade of a student based on marks.
class Logic {
    void displayGrade(int marks) {
        if (marks < 0 || marks > 100) {
            System.out.println(marks + ": Invalid marks. Please enter a value between 0 and 100.");
        } else if (marks < 35) {
            System.out.println(marks + ": Grade: Fail");
        } else if (marks < 50) {
            System.out.println(marks + ": Grade: Pass Class");
        } else if (marks < 60) {
            System.out.println(marks + ": Grade: Second Class");
        } else if (marks < 75) {
            System.out.println(marks + ": Grade: First Class");
        } else {
            System.out.println(marks + ": Grade: First Class with Distinction");
        }
    }
}

class program19_2
 {
    public static void main(String args[]) {
        Logic obj = new Logic();
        obj.displayGrade(82); // Example from your image
        obj.displayGrade(65);
        obj.displayGrade(45);
        obj.displayGrade(30);
    }
}