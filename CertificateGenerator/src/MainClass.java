import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name of the Employee: ");
        String name = sc.nextLine();
        System.out.println();
        System.out.print("Enter the Address of the Employee: ");
        String address = sc.nextLine();
        System.out.println();
        System.out.print("Designation: ");
        String designation = sc.nextLine();
        System.out.println();
        System.out.println("Date of Joining: ");
        String dateOfJoining = sc.nextLine();

        Certificate c = new Certificate(name,address,designation,dateOfJoining);
        c.certificateWriter();
    }
}
