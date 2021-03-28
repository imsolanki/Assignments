import java.util.Scanner;

public class Characters {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 65 && ch <= 122) {
            if(ch <= 90){
                System.out.println("It is the Uppercase Alphabet...");
            }else{
                System.out.println("It is the Lowercase Alphabet...");
            }

        }else if(ch>=48 && ch<=57){
            System.out.println("Character is Numeric value of "+ ch);
        }else if(ch==32){
            System.out.println("It is the Space.");
        }else{
            System.out.println("Input is special character of "+ ch);
        }
    }
}
