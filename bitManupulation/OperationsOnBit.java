class OperationsOnBit {
    public static void main(String[] arg) {
        System.out.println(setIthBit(10,2));
    }

    static int getIthBit (int n, int i) {
        int bitmask = 1 << i;
        if((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    static int setIthBit (int n, int i) {
        int bitMask = n << i;
        return n | bitMask;
    }
}