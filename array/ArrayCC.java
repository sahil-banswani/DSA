
class ArrayCC {
    public static void main(String arg[]) {
        int marks[] = {11,15,17,18,19,25,35,65,47,20,58};
        String key = "Appe";
        String menu[] = {"dosa", "chole Bhature", "Samosa", "Appe", " Fried Rice"};

        int index = linear_search(menu, key);

        if(index == -1) {
            System.out.println("Not Found");
        }else {
            System.out.println("Fount at index :" + index+1);
        }
    } 
    public static void update(int marks[]) {
        for(int i= 0; i< marks.length; i++) {
            marks[i] = marks[i] + 1;
            System.out.println(marks[i]);
        }
    }
    public static int linear_search(String marks[], String key) {

        for(int i =0;i<marks.length; i++) {
            if(marks[i] == key) {
                return i;
            }
        }
        return -1;
    }
}