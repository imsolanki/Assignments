import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the input: ");
        int input = sc.nextInt();

        for(int i =0; i<input;i++){
            {
                for(int j = 0;j<=i;j++){
                    System.out.print("X");
                }
                System.out.println("");
            }
        }
    }
}
