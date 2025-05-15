package CoreJava.OOPS.OOPSPolymorphism3;

public class TestMethodOverriding {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        A a = new A();
        a.info();

        A a1=new B(); //Upcasting
        a1.info();
        System.out.println("Radhe Radhe");

    }
}

class A{
    //1>Methods()
    public void info(){
        System.out.println("Inside A");
    }
}


class B extends A{
    //1>Methods()
    public void info(){
        System.out.println("Inside B");
    }
}