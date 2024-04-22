class bitManupulation {
    public static void main(Strig arg[]) {
        evenOddNumber(3);
        evenOddNumber(15);
        evenOddNumber(6);
    } 
    
    static void evenOddNumber(int n) {
        int bitMask = 0;
        if((n & bitMask) == 0) {
            System.out.print('Even Number');
        } else {
            System.out.print('Odd Number');
        }
    }
}