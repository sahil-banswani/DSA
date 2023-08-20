public class FunctionOverloading {
    public static void main(String arg[]){
        System.out.println(SumOfDigits(123));
        // System.out.println(EvenorNot(3));
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

    public static void BinaryToDecimal(int binNum) {
        //(101)10 = (5)2
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0) {
            int lastDigit = binNum %10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            binNum = binNum /10;
            pow++;
        }
        System.out.println("decimal of Binary number " + myNum + " is : "+decNum);

    }

    public static void DecimalToBianary(int decNum) {
        int pow = 0;
        int binNum = 0;
        while(decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem*(int)Math.pow(10, pow));

            pow++;
            decNum /= 2;
            
        }
        System.out.println("Binary to Decimal is: " + binNum);
    }

    public static double Avg3Num ( int a, int b, int c) {
        return (a+b+c)/3;
    } 

    public static boolean EvenorNot(int n) {
        int isEven = n%2;
        if(isEven  == 0) {
            return true;
        }else {
            return false;
        }
    }

    public static int SumOfDigits(int n) {
        int rem = 0;
        int sum = 0;
        while(n>0) {
            rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        return sum;
    }
}
