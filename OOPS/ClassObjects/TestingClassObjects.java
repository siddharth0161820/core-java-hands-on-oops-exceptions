package CoreJava.OOPS.ClassObjects;

public class TestingClassObjects {
    int age;
    String name;

    //2>Methods()
    public void info(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

class FinalChecker{
    public static void main(String[] args) {
        TestingClassObjects t=new TestingClassObjects();
        t.age=27;
        t.name="Siddharth";
        t.info();
    }
}