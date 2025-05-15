package CoreJava.OOPS.OOPSPolymorphism3;


public class TestFinalKeyword {
    public static void main(String[] args) {
        final int age=4;
     //  age=33;

    }
}

 class Calculator{
    public void sum(int a, int b){
        System.out.println("Sum "+(a+b));
    }
}

final class AdvCalculator extends Calculator{
    public void diff(int a, int b){
        System.out.println("Diff "+(a-b));
    }
}


//class UltraCalculator extends AdvCalculator{
//    public void mul(int a, int b){
//        System.out.println("Mul "+(a*b));
//    }
//
//    public void div(int a, int b){
//        System.out.println("Div "+(a/b));
//   }
//}
