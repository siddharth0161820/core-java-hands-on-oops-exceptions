package CoreJava.OOPS.OOPSDataAbstration4;

public class TestAbstration {
    public static void main(String[] args) {
        Me m=new I();
        m.seen();
        m.show();
        System.out.println("Radhe Radhe");
    }
}

abstract class Me{
    public  abstract void show();
    public void seen(){
        System.out.println("seen inside Me");
    }
}


abstract class  Mein extends Me{
    public abstract void show();
}


class I extends Mein{
    public void show(){
        System.out.println("Show inside I");
    }
}