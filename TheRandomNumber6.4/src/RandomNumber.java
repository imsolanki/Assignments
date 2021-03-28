import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Random r =new Random();
        System.out.println("Enter the input: ");
        int input = sc.nextInt();

        for(int i =0; i<input;i++){
            for(int j =0;j<input;j++){
                System.out.print(r.nextInt(6));
            }
            System.out.println();
        }
    }
}
