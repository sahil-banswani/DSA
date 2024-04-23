class OperationsOnBit {
    public static void main(String[] arg) {
        System.out.println(clearIthBit(10,1));
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

    static int clearIthBit (int n, int i) {
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    static int updateIthBit (int n, int i, int newBit) {
        // if(newBit == 0) {
        //     return clearIthBit(n,i);
        // } else {
        //     return setIthBit(n, i);
        // }

        
    }
}