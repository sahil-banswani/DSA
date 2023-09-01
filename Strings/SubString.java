package Strings;

public class SubString {
    public static void main(String[] srg) {
        String str= "Hello World";
        // System.out.println(subString(str, 2, 5));
        System.out.println(str.substring(2, 5));
    }
    public static String subString(String str, int si, int ei) {
        String substr="";
        for(int i=si;i<ei;i++){
            substr += str.charAt(i);
        }
        return substr;
    }
}
