public class Oops {
    public static void main(String arg[]) {
        Pen p1 = new Pen(); // creatde a object of Pen p1
        p1.setColor("blue");
        System.out.println(p1.color);
    }
}

class Pen {
    // prop + functions
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    
}