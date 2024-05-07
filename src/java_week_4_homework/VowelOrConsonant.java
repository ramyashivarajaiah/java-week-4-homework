package java_week_4_homework;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        //scanner declaration
        Scanner scan = new Scanner(System.in);

        System.out.print("Input an alphabet: ");
        String input = scan.next().toLowerCase();

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");

        if (input.length() > 1) {
            System.out.println("Error. Not a single Character.");
        } else if (!(uppercase || lowercase)) {
            System.out.println("Error. Not  letter. Enter uppercse or lowercase letter.");
        } else if (vowels) {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is consonant");
        }
        scan.close();
    }
}
