package CoreJava.ExceptionHandling.Keywords;
class SiddhathException extends Exception{
    public SiddhathException() {
        super();
    }
}
public class TestCustomException {
    public static void main(String[] args) {
        System.out.println("Custom Exception");
        int i=20;
        int j=0;
        try {
            j=19/i;
            if(j==0) throw  new SiddhathException();
        }catch (SiddhathException e){
            System.out.println(e);
        }catch (Exception e1){
            System.out.println(e1);
        }finally {
            System.out.println("This Will wirk for-sure");
        }
        System.out.println(j);
        System.out.println("Radhe Radhe");
    }
}
