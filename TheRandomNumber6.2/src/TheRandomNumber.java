import java.util.Random;
import java.util.Scanner;

public class TheRandomNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r = new Random();
        System.out.print("Enter the no. of otp's user want: ");
        int input =sc.nextInt();
        for(int i=0;i<input;i++)//for getting total no. of otp as equal to inputs
        {
            for(int j = 0;j<input;j++)//for getting length of inputs to be eqaul to inputs
            {
                System.out.print(r.nextInt(input+1));//range will be to the input no.
                //ex input 3 so otp will be 0,1,2,3.
            }
            System.out.println();
        }
    }
}
