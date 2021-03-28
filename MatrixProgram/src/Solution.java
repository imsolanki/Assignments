import java.util.Scanner;

public class Solution {

    int [][]arr;
    int valueToFind;

    Solution(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        arr = new int[n][n];
        System.out.println("Enter value to Find its occurrences: ");
        valueToFind = sc.nextInt();
    }
    void printingValues(){
        for(int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=((i+1)*(j+1))+100;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void findingOccurrences(){
        int total =0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                if (anInt == valueToFind) {
                    total = total + 1;
                }
            }
        }
        //System.out.println();
        System.out.print("There are "+total+" occurrences of the element "+valueToFind+" in the generated array");
    }

    public static void main(String[] args) {

        Solution s = new Solution();
        s.printingValues();
        s.findingOccurrences();

    }
}

        /*
        long power=1;
        for(int i =1;i<11;i++){
            power= power*n ;

            System.out.println(power);

            Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr =new int[n];

        for(int i=0;i<arr.length;i++){
            //arr[i]=-i*(100) +500;
           // arr[i]=500*(i)
            arr[i]=200*i+100;

        }
        for(int i =0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        char[][] arr = new char[4][4];
        arr[0][0]='A';
        arr[0][1]='B';
        arr[0][2]='C';
        arr[0][3]='D';
        arr[1][0]='E';
        arr[1][1]='F';
        arr[1][2]='I';
        arr[1][3]='J';
        arr[2][0]='K';
        arr[2][1]='L';
        arr[2][2]='M';
        arr[2][3]='N';
        arr[3][0]='O';
        arr[3][1]='P';
        arr[3][2]='Q';
        arr[3][3]='R';

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

            */


