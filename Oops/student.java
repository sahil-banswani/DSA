class student {
    public static void main(String arg[]) {
        Students s1 = new Students();
    }
}

class Students {

    String name;
    int roll;
    String password;
    int marks[];

    // shallo - copy constructor
    // Students(Students s1) {
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.return = s1.return;
    //     this.marks = s1.marks;
    //     // System.out.println();
    // };

    //deep copy contructor
    Students(Students s1) {
        marks = new int[3];
        this.name = s1.name;
        this.return = s1.return;
        for(int i=0; i<3;i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Students() {
        marks = new int[3];
        System.out.println("Contructor is called..")
    }

    Students (String name) {
        marks = new int[3];
        this.name = name;
    }
}