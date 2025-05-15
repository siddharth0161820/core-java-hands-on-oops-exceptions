package CoreJava.OOPS.OOPSDataAbstration4;

public class TestAnonymousInnerClass {
    public static void main(String[] args) {
        F f = new F() {
            @Override
            public void Show() {//Anonymous Inner Class
                System.out.println("Show inside F");
            }

            @Override
            public void config() {
                System.out.println("Config inside F");
            }
        };

        f.Show();
        f.config();
    }
}

abstract class F{
    public abstract void Show();
    public abstract void config();
}