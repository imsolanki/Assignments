import java.util.Scanner;

public class HideAndSeek {

    static boolean digitInculded(int num1,int digitTocheck){

        //num1 is basically a no. where we presently are
        //digitToCheck is digit we are checking for
        while(num1!=0){
            int n = num1%10;
            if(n==digitTocheck){
                return true;
            }
            num1 =num1/10;
        }
        return  false;
    }

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the starting range: ");
        int start =sc.nextInt();
        System.out.println("Enter the ending range: ");
        int end = sc.nextInt();
        while(true){
            System.out.println("Enter the choice 1 or 2: ");
            int choice  = sc.nextInt();
            if(choice==1){
                System.out.println("Enter number: ");
                int digitInclude = sc.nextInt();
                if(digitInclude<0 ||digitInclude>9){

                    System.out.println("Digit must be in the range ");
                }
                for(int i =start;i<=end;i++){
                    boolean ifYes= digitInculded(i,digitInclude);
                    // for every iteration of i, method is called.
                    if (ifYes) {
                        System.out.print(i+" ");
                    }
                }
                break;
            }
            else if(choice==2){
                System.out.println("Enter number: ");
                int digitExclude = sc.nextInt();
                if(digitExclude<0||digitExclude>9){
                    System.out.println("Digit must be in the range: ");
                }
                for(int i =start;i<=end;i++){
                    boolean ifYes= digitInculded(i,digitExclude);
                    if (!ifYes) {
                        System.out.print(i+" ");
                    }
                }

                break;
            }

        }

    }
}


