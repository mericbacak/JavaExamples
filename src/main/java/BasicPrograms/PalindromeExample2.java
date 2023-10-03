package BasicPrograms;

import java.util.Scanner;

public class PalindromeExample2 {
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string/number to check if it is a palindrome from 1 to 10000000");
        original = in.nextLine();
        int length = original.length();
        System.out.println("Sayı "+length+" basamaklı");
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");
    }
}
