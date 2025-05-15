package CoreJava.OOPS.OOPSPolymorphism3;

import java.util.Scanner;

public class TestMethodOverLoading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Method Overloading");
        System.out.print("Please, enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Please, enter the second number: ");
        int b = sc.nextInt();
        System.out.print("Please, enter the third number: ");
        int c = sc.nextInt();
        System.out.print("Please, enter the fourth number: ");
        int d = sc.nextInt();
        Q q=new Q();
        q.sum(a,b);
        q.sum(a,b,c);
        q.sum(a,b,c,d);
        System.out.println("Radhe Radhe");

    }
}


class Q{
    //1>Methods()
    public void sum(int a, int b){
        System.out.println("Sum: "+(a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("Sum: "+(a+b+c));
    }


    public void sum(int a, int b,int c,int d){
        System.out.println("Sum: "+(a+b+c+d+11));
    }
}