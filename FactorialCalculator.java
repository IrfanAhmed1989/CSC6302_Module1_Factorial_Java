/*
 * Author: Irfan Ahmed
 * Language: Java
 * IDE/Environment: macOS Terminal using OpenJDK 25.0.1 (javac/java)
 * Course: CSC6302 – Module 1: Project #1
 * Description: Converted Python factorial program to Java, matching Python behavior:
 * - Non-integer input causes program to crash (NumberFormatException), like Python's ValueError.
 * - Negative integers trigger re-prompt until a non-negative integer is entered.
 * - Whitespace around numeric input is tolerated (trim), matching Python's int().
 */

import java.util.Scanner;

public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an positive Integer: ");

        int n = Integer.parseInt(input.nextLine().trim());

        while (n < 0) {
            System.out.print("Sorry, only positive numbers, enter again: ");
            n = Integer.parseInt(input.nextLine().trim());
        }

        if (n == 0) {
            System.out.println("The factorial of 0 is 1");
        } else {
            long f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println("The factorial of " + n + " is " + f);
        }

        input.close();
    }
}
