
class Parent {
    int x = 10;

    Parent() {
        System.out.println("Parent constructor called");
    }
}


class Child extends Parent {
    int x = 20;

    Child() {
        super();  
        System.out.println("Child constructor called");
    }

    void show() {
        System.out.println("Value of x in Child class: " + x);       // child variable
        System.out.println("Value of x in Parent class: " + super.x); // parent variable
    }
}

// Main class
public class B{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}