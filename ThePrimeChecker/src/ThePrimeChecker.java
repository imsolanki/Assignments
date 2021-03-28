import java.util.Scanner;

public class ThePrimeChecker {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while(true){

            System.out.print("enter number: ");
            int number =sc.nextInt();

            if(number==1||number==2||number==3||number==5||number==7){
                System.out.println("The "+number+" is prime number.");
            }else if(number%2==0||number%3==0||number%5==0||number%7==0||number%11==0||number%17==0){
                System.out.println("The "+number+" is not prime");
            }else{
                System.out.println("The "+number+" is prime number.");
            }
            System.out.println("Press 1 to check more numbers & 2 to exit: ");
            int input =sc.nextInt();
            if(input==1){
                continue;
            }
            else if(input ==2){
                break;
            }
            else{
                System.out.println("Wrong Input, Exiting...");
                break;
            }
        }

    }
}
