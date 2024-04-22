class bitManupulation {
    public static void main(String[] arg) {
        evenOddNumber(3);
        evenOddNumber(15);
        evenOddNumber(6);
    } 
    
    static void evenOddNumber(int n) {
        int bitMask = 1;
        if((n & bitMask) == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }
    }
}