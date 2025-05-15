package CoreJava.OOPS.EqualsHashcode;

public class TestingStudent {
    public static void main(String[] args) {
        Student student= new Student(24,"Radha","Delhi");
        Student student1= new Student(24,"Radha","Delhi");

        boolean result= student.equals(student1);
        boolean res=student==student1;
        System.out.println("Result: "+result);
        System.out.println(res);
    }
}
