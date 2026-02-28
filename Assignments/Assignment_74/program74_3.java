/*
3. A university wants to generate student results automatically.
Rules:
- If marks in ANY subject < 35 -> student is Fail
- If student passes all subjects, calculate average and classify:
  * Average >= 75 -> Distinction
  * Average >= 60 -> First Class
  * Average >= 50 -> Second Class
  * Average < 50 -> Pass
Validations: Each mark must be between 0 and 100
*/

import java.util.Scanner;

public class program74_3 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);
        int[] marks = new int[5];
        boolean isFail = false;
        int totalMarks = 0;

        System.out.println("Enter marks for five subjects:");
        for (int i = 0; i < 5; i++) {
            marks[i] = sobj.nextInt();
            if (marks[i] < 0 || marks[i] > 100) {
                System.out.println("Invalid marks entered.");
                return;
            }
            if (marks[i] < 35) {
                isFail = true;
            }
            totalMarks += marks[i];
        }

        if (isFail) {
            System.out.println("Result: Fail");
        } else {
            double avg = totalMarks / 5.0;
            String classification = "";

            if (avg >= 75) classification = "Distinction";
            else if (avg >= 60) classification = "First Class";
            else if (avg >= 50) classification = "Second Class";
            else classification = "Pass";

            System.out.println("Average Marks: " + avg);
            System.out.println("Final Result: " + classification);
        }
        sobj.close();
    }
}