package CoreJava.OOPS.OOPSEncapsulation1;

public class TestEncapsulation {
   //1>Attributes
    private int age;
    private String name;
    private String place;

    //2>Getter&Setter

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}


class Tester{
    public static void main(String[] args) {
        //3>Object for the class
        TestEncapsulation testEncapsulation=new TestEncapsulation();
        testEncapsulation.setName("Siddharth Kumar");
        testEncapsulation.setAge(27);
        System.out.println("Name: "+testEncapsulation.getName()+" ::"+" Age: "+testEncapsulation.getAge());
        System.out.println("Radhe Radhe");
    }
}