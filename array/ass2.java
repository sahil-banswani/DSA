public class ass2 {
    public static void main(String[] arg) {
        int numbers[] = {-1,0,1,8,9,4}; 
        triplet(numbers);
    }

    public static void triplet(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                for (int k = 0; k < numbers.length; k++) {
                    if (i != j && i != k && j != k && (numbers[i] + numbers[j] + numbers[k] == 0)) {
                        System.out.println('['+ numbers[i] + ","+ numbers[j] +","+ numbers[k]+']');
                    }
                }
            }
        }
    }
}
