import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number= sc.nextInt();
        int count=0;
        int evenValue=0;
        int oddValue=0;
        int totalSum=0;
        while(number!=0){
            int remainder =number%10;
            System.out.print(remainder);
            number = number/10;
            count=count+1;
            totalSum =totalSum+remainder;
            if(remainder%2==0) {

                evenValue=evenValue+1;
            }else{
                oddValue=oddValue+1;
            }

        }
        System.out.println();
        System.out.println("Total digit are "+count);
        System.out.println("Total even digits "+evenValue);
        System.out.println("Total odd digits "+oddValue);
        System.out.println("Total sum of digits are " +totalSum);
    }
}
