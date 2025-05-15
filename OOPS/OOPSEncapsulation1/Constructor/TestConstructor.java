package CoreJava.OOPS.OOPSEncapsulation1.Constructor;
class A {
    //constructor
    A(){
        System.out.println("Inside default constructor A");
    }
}



class B extends A {
    //constructor
    B(){

        System.out.println("Inside default constructor B");
    }
}


class C extends A {
    //constructor
    C(){

        System.out.println("Inside default constructor c");
    }

    C(int a){
        this();
        System.out.println("Inside parameterized constructor c");
    }
}


public class TestConstructor {
    public static void main(String[] args) {
        //when an object is created it calls the constructor
        C c=new C();
        System.out.println(" ");
        C c1=new C(5);
        A a=new A();
    }
}
