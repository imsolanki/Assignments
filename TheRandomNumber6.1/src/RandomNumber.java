import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Otp: ");
        int input = sc.nextInt();
        Random r = new Random();
        for (int j = 0; j < input; j++) {

            for (int i = 0; i < input; i++) {
                System.out.print(r.nextInt(9));
            }
            System.out.println();
        }

    }
}
