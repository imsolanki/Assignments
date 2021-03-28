import java.util.Scanner;

public class Employee {

    String f_Name,l_Name,designation,email;
    int id;
    float basicSalary,hra,ta,da,pf,grossSalaryMonth,grossSalaryAnnually;

    void inputEmployeeDetails(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter id of the Employee: ");
        id=sc.nextInt();
        System.out.print("Enter first name: ");
        f_Name=sc.next();
        System.out.print("Enter Last name: ");
        l_Name=sc.next();
        System.out.print("Designation: ");
        designation=sc.nextLine();
        sc.nextLine();
        System.out.print("Email address: ");
        email=sc.next();
        System.out.print("Enter the basic salary: ");
        basicSalary=sc.nextFloat();
    }
    void calculateSalary(){

        if(basicSalary<1800){
            System.out.println("Basic Salary must be more than 1800 Rupees.");
        }
        else if(basicSalary>1800 && basicSalary<=10000){
            hra= (float) 0.12;
            ta= (float) 0.08;
            da = (float) 0.1;
            pf= (float) 0.11;

            grossSalaryMonth = basicSalary+(hra*basicSalary)+(basicSalary*ta)+(basicSalary*da)+(basicSalary*pf);
            //System.out.print("Monthly salary: "+grossSalaryMonth);
        }
        else if(basicSalary>10000 && basicSalary<=20000){
            hra= (float) 0.20;
            ta= (float) 0.1;
            da = (float) 0.12;
            pf= (float) 0.13;

            grossSalaryMonth = basicSalary+(hra*basicSalary)+(basicSalary*ta)+(basicSalary*da)+(basicSalary*pf);
           // System.out.print("Monthly salary: "+grossSalaryMonth);
        }
        else if(basicSalary>20000 && basicSalary<=30000){
            hra= (float) 0.3;
            ta= (float) 0.12;
            da = (float) 0.14;
            pf= (float) 0.15;

            grossSalaryMonth = basicSalary+(hra*basicSalary)+(basicSalary*ta)+(basicSalary*da)+(basicSalary*pf);
            //System.out.print("Monthly salary: "+grossSalaryMonth);
        }
        else{
            hra= (float) 0.35;
            ta= (float) 0.14;
            da = (float) 0.16;
            pf= (float) 0.17;

            grossSalaryMonth = basicSalary+(hra*basicSalary)+(basicSalary*ta)+(basicSalary*da)+(basicSalary*pf);
            //System.out.print("Monthly salary: "+grossSalaryMonth);
        }
        grossSalaryAnnually=grossSalaryMonth*12;
        //System.out.println(" salary: "+grossSalaryAnnually);

    }
    void showEmployeeDetails(){

        System.out.println("Employee Name: "+f_Name+" "+l_Name);
        System.out.println("Monthly Salary "+grossSalaryMonth);
        System.out.println("Annual Salary "+grossSalaryAnnually);
    }
}
