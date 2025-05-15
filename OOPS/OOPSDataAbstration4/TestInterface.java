package CoreJava.OOPS.OOPSDataAbstration4;

public class TestInterface {
    public static void main(String[] args) {
        A a= new Test();
        a.show();
        a.cnfig();
        a.cnfig();
        System.out.println("Age: "+A.age);
        System.out.println("Name: "+A.name);
    }
}
interface A{
    int age=32; //static and final
    String name="Siddharth"; //static and final
    void show();
    void cnfig();
}
interface Checker {
    void Show1();

}

class Test implements A,Checker{

    @Override
    public void show() {
        System.out.println("Show in A");
    }

    @Override
    public void cnfig() {
        System.out.println("cnfig in A");
    }

    @Override
    public void Show1() {
        System.out.println("Show1 in checker");
    }
}