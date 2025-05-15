package CoreJava.ExceptionHandling;

public class TestTryWithMultipleCatch {
    public static void main(String[] args) {
        int i=2;
        int j=0;
        int[]a=new int[10];
        String name=null;
        try {
            j=18/i;
            System.out.println(a[1]);
            System.out.println(name.length());
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e1){
            System.out.println(e1.getMessage());
        }catch (Exception eee){
            System.out.println(eee.getMessage());
        }
        System.out.println(j);
        System.out.println("Radhe Radhe");
    }
}
