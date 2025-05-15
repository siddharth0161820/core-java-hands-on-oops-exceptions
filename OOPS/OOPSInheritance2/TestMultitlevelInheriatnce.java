package CoreJava.OOPS.OOPSInheritance2;

import java.util.Scanner;

public class TestMultitlevelInheriatnce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("MultiLevel Inheritance");
        System.out.print("Please,Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Please,Enter the second number: ");
        int b = sc.nextInt();
       UltraCalculator ultraCalculator=new UltraCalculator();
        ultraCalculator.Sum(a,b);
        ultraCalculator.Difference(a,b);
        ultraCalculator.Multiplication(a,b);
        ultraCalculator.Division(a,b);
        System.out.println("Radhe Radhe");


    }


    }


class Calculator{
    //1>Methods()
    public void Sum(int a,int b){
        System.out.println("Sum: "+(a+b));

    }
}


class AdvCalculator extends Calculator {
    //1>Methods()
    public void Difference(int a, int b) {
        System.out.println("Difference: "+(a - b));

    }

    //1>Methods()
    public void Division(int a, int b) {

        if(b!=0){
            System.out.println("Division: "+(a / b));
        }else {
            System.out.println("Division by 0 not allowed");
        }


    }

}
    class UltraCalculator extends AdvCalculator {
        //1>Methods()
        public void Multiplication(int a, int b) {
            System.out.println("Multiplication: "+(a * b));

        }
    }

