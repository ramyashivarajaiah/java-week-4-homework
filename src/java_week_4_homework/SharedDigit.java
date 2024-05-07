package java_week_4_homework;

import java.util.Scanner;

/**
 * Shared Digit
 * Write a method named hasSharedDigit with two parameters of type int.
 * Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 * within the range, the method should return false.
 * The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 * otherwise, the method should return false.
 * EXAMPLE INPUT/OUTPUT:
 * * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 * NOTE: The method hasSharedDigit should be defined as public static
 */

public class SharedDigit {

    //method with two parameters
    public static boolean hasSharedDigit(int a, int b) {
        if (a < 10 || b > 99)
            return false;
        int x = a % 10;
        int y = b % 10;
        a /= 10;
        b /= 10;
        return (a == b || a == y || x == b || x == y);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int p = scan.nextInt();
        System.out.print("Input the second number: ");
        int q = scan.nextInt();
        System.out.println("Result: " + hasSharedDigit(p, q));
        scan.close();
    }
}
