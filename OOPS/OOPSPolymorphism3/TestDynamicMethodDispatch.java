package CoreJava.OOPS.OOPSPolymorphism3;

public class TestDynamicMethodDispatch {
    public static void main(String[] args) {
        System.out.println("Dynamic Method  Dispatch ");
        S s3 =new S();
        s3.show();
   S s=new I();
   s.show();
   S s1=new D();
   s1.show();
   S s2=new D1();
   s2.show();
    }
}

class S{
    //Method()
    public void show(){
        System.out.println("Inside show S");
    }
}


class I extends S{
    //Method()
    public void show(){
        System.out.println("Inside show I");
    }
}



class D extends I{
    //Method()
    public void show(){
        System.out.println("Inside show D");
    }
}




class D1 extends D{
    //Method()
    public void show(){
        System.out.println("Inside show D1");
    }
}