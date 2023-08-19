public class FunctionOverloading {
    public static void main(String arg[]){
        System.out.println(primeNumber(0));
        // System.out.println(sum(3.5f, 2.4f));
    }
    //func to cal float sum
    public static float sum(float a,float b) {
        return a+b;
    }
    public static int sum(int a,int b) {
        return a+b;
    }
    //checck if a number is prime or not
    public static int primeNumber(int n) {
        int sys = 0;
        for(int i = 0;i <n;i++){
            sys = n / (n-i);
            System.out.println("Number is not prime");
        }
        return sys;
    }

    public static int BinaryToDecimal() {
        

        return 0;
    }
}
