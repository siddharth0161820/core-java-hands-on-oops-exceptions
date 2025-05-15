package CoreJava.ExceptionHandling.Keywords;

public class TestThrowKeyword {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try {
            j=19/i;
            if (j==0)new  ArithmeticException();
        }catch (ArithmeticException e){
            j=19/1;
            System.out.println("That's the default output"+e);
        }catch (Exception e1){
            System.out.println(e1.getMessage());
        }finally {
            System.out.println("This block will run for-sure");
        }
        System.out.println(j);
        System.out.println("Radhe Radhe");
    }
}
