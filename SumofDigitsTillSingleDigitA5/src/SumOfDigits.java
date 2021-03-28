import java.util.Scanner;

public class SumOfDigits{

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number: ");
        int num=sc.nextInt();
        int sum=0;
        int add=0;
        int tSum=0;
        for(int i=0; i<num; i++){

            int number = num%10;
            sum = sum+number;
            num = num/10;
            for(int j =0;j<sum/2;j++){
                add=sum%10;
                tSum =tSum+add;
                sum =sum/10;
            }
        }
        System.out.println(tSum);
    }
}

