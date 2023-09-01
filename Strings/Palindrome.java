package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(checkPalindrome(name));
    }

    public static boolean checkPalindrome(String name) {
        for (int i = 0; i < name.length() / 2; i++) {
            if(name.charAt(i) != name.charAt(name.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
