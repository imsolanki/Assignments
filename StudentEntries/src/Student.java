public class Student {

    String name;
    String dob;
    int age;

    Student(String name,String dob,int age){
        this.name =name;
        this.dob=dob;
        this.age=age;
    }

    void printDetails(){
        System.out.println("Name: "+name);
        System.out.println("DOB: "+dob);
        System.out.println("Age: "+age);
    }
}
