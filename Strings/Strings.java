package Strings;

public class Strings {

    public static void main(String arg[]) {
        char arr[] = { 'a', 'b', 'c', 'd', 'e' };
        String str = "Abcd";
        String str2 = new String("Sahil");

        // String are IMMUTABLE
        String firstName = "Sahil";
        String lastName = "Banswani";
        String fullName = firstName + " " + lastName;
        printElement(fullName);

        
    }public static void printElement(String str) {
        for(int i=0;i<str.length();i++) {
            System.out.print(str.charAt(i)+" ");
        }

    }
    //concatination -> means to combine two string 
}
