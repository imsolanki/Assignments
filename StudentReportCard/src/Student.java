import java.util.Scanner;

public class Student {

    int rollno,standard,hindi,english,physics,chemistry,math,total_marks;
    String first_name,last_name,remarks;
    char grade;
    int percentage;
    static Student s1 = new Student();

    void calculation(){
        //Student s1 = new Student();
        Student.s1.total_marks = Student.s1.hindi+Student.s1.english+Student.s1.physics+Student.s1.chemistry+
                Student.s1.math;
        Student.s1.percentage=(Student.s1.total_marks/5);
        //=marks/500;
        if(Student.s1.percentage<50){
            Student.s1.grade='F';
            System.out.println(Student.s1.grade);
            Student.s1.remarks="Do Better Next Time.";
            System.out.println(Student.s1.remarks);
        }else if(Student.s1.percentage < 60){
            Student.s1.grade='D';
            System.out.println(Student.s1.grade);
            Student.s1.remarks="Try Hard.";
            System.out.println(Student.s1.remarks);
        }
        else if(Student.s1.percentage < 70){
            Student.s1.grade='C';
            System.out.println(Student.s1.grade);
            Student.s1.remarks="Average.";
            System.out.println(Student.s1.remarks);
        }else if(Student.s1.percentage < 80){
            Student.s1.grade='B';
            System.out.println(Student.s1.grade);
            Student.s1.remarks="Good.";
            System.out.println(Student.s1.remarks);
        }
        else if(Student.s1.percentage < 90){
            Student.s1.grade='A';
            System.out.println(Student.s1.grade);
            Student.s1.remarks="Very Good.";
            System.out.println(Student.s1.remarks);
        }
        else{
            Student.s1.grade='A';
            System.out.println(Student.s1.grade);
            Student.s1.remarks="Excellent A+.";
            System.out.println(Student.s1.remarks);
        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);


        System.out.print("Enter Roll No. of the student: ");
        Student.s1.rollno =sc.nextInt();
        System.out.print("First Name: ");
        Student. s1.first_name=sc.next();
        System.out.print("Last Name: ");
        Student.s1.last_name=sc.next();
        System.out.print("Standard: ");
        Student.s1.standard=sc.nextInt();
        if(Student.s1.standard<11||Student.s1.standard>12){
            System.out.println("Standard must be 11th or 12th");
            System.exit(0);
        }
        System.out.print("Marks in Hindi: ");
        Student.s1.hindi=sc.nextInt();
        if(Student.s1.hindi<0||Student.s1.hindi>100){
            Student.s1.hindi=0;
        }
        System.out.print("Marks in English: ");
        Student.s1.english=sc.nextInt();
        if(Student.s1.english<0||Student.s1.english>100){
            Student.s1.english=0;
        }
        System.out.print("Marks in Physics: ");
        Student.s1.physics=sc.nextInt();
        if(Student.s1.physics<0||Student.s1.physics>100){
            Student.s1.physics=0;
        }
        System.out.print("Marks in Chemistry: ");
        Student.s1.chemistry=sc.nextInt();
        if(Student.s1.chemistry<0||Student.s1.chemistry>100){
            Student.s1.chemistry=0;
        }
        System.out.print("Marks in Maths: ");
        Student.s1.math=sc.nextInt();
        if(Student.s1.math<0||Student.s1.math>100){
            Student.s1.math=0;
        }

        Student.s1.calculation();

    }
}
