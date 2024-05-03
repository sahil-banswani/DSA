
class Abstraction {
    public static void main(String arg[] ) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.color();
    }
}

abstract class Animal {
    String color;
    // non-abstract function
    Animal() {
        color = "brown";
    }
    void eat(){ 
        System.out.println("animals eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void changeColor() {
        color = "white";
    }

    void walk() {
        System.out.println("Horse's walk on 4 legs");

    }
}

class Chickens extends Animal {
    void changeColor() {
        color = "white";
    }
    void walk() {
        System.out.println("chicken's walk on 2 legs");

    }
}

