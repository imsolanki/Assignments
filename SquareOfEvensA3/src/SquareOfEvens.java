import java.util.Arrays;
import java.util.Scanner;

public class SquareOfEvens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs you want to give: ");
        int input =sc.nextInt();
        if(input>10||input<1){
            System.out.println("Input Must be between 1 to 10...");
        }
        else{
            int []inputValues=new int[input];
            for(int i=0;i<input;i++){
                System.out.print("Enter the Input: ");
                int values =sc.nextInt();
                inputValues[i]=values;
                if(i%2!=0){
                    inputValues[i]=inputValues[i]*inputValues[i];
                }
                    /*evens=inputValues[i]%10;
                    System.out.print(evens);
                   // evens =evens*evens;*/
                //System.out.println((evens));
            }
            System.out.println(Arrays.toString(inputValues));

        }
    }
}
