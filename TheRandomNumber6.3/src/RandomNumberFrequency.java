import java.util.Scanner;

public class RandomNumberFrequency {

    public static void main(String[] args) {

        int nCount =0;
        int pCount =0;
        Scanner sc = new Scanner(System.in);
        //Random r =new Random();
        System.out.println("Enter the input: ");
        int input= sc.nextInt();
        for (int i =0;i<input;i++){
            for(int j = 0;j<input;j++){
                int rNumber =-9 + (int) (Math.random() * ((9 - (-9)) + 1));
                if(rNumber<0){
                    nCount=nCount+1;
                }
                else if(rNumber>0){
                    pCount=pCount+1;
                }
                System.out.print(rNumber);
            }
            System.out.println();
        }
        System.out.println("Total positive Random no. generated "+pCount);
        System.out.println("Total negative Random no. generated "+nCount);
    }
}
