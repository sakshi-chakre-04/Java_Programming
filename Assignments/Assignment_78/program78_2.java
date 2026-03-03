/*
 * Assignment 2:
 * An online election system stores votes by voter ID. Every voter can vote only once. 
 * If the same ID appears again, the vote must be rejected and counted as duplicate.
 * Input: Number of votes N, N voter IDs
 * Validations: N >= 0, IDs must be non-negative integers
 */

import java.util.Scanner;
import java.util.HashSet;

public class program78_2 {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of votes (N):");
        int n = sobj.nextInt();

        if (n < 0) {
            System.out.println("Invalid input. N must be >= 0.");
            return;
        }

        HashSet<Integer> uniqueVotes = new HashSet<>();
        int validCount = 0;
        int duplicateCount = 0;

        System.out.println("Enter " + n + " voter IDs:");
        for (int i = 0; i < n; i++) {
            int id = sobj.nextInt();
            if (id < 0) {
                System.out.println("Invalid ID ignored: " + id);
                continue;
            }

            if (uniqueVotes.contains(id)) {
                duplicateCount++;
            } else {
                uniqueVotes.add(id);
                validCount++;
            }
        }

        System.out.println("Valid Votes: " + validCount);
        System.out.println("Rejected Duplicate Votes: " + duplicateCount);
    }
}