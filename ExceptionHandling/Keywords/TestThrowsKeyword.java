package CoreJava.ExceptionHandling.Keywords;




class A{
    public void show() throws ClassNotFoundException {

            Class.forName("Demooo");

    }
}
class Test{
    public static void main(String[] args)  {
            A a=new A();
        try {
            a.show();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}