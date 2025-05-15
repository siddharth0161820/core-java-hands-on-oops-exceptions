package CoreJava.OOPS.OOPSPolymorphism3;

public class TestUpcastingDowncasting {
    public static void main(String[] args) {
        L l1=new M();//upcasting
        l1.Show();
        L l2=new N();//upcasting
        l2.Show();

        M m= (M)l1;//downcasting ]=33r
        m.Show();

    }
}
class L{
    public void Show(){
        System.out.println("Show inside L");
    }
}


class M extends L{
    public void Show(){
        System.out.println("Show inside M");
    }
}



class N extends M{
    public void Show(){
        System.out.println("Show inside N");
    }
}