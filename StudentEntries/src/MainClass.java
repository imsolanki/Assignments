import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the name of the student: ");
        String name = sc.nextLine();
        System.out.println("Enter DOB: ");
        String dob= sc.nextLine();
        System.out.println("Enter age: ");
        int age =sc.nextInt();

        Student s =new Student(name,dob,age);

        AddStudent as =new AddStudent();
        as.addStudent(s);

        as.printDetail();
    }


}
