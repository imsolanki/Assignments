import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    Scanner sc =new Scanner(System.in);
    int n = sc.nextInt();
    int []arr =new int[n];


    void inputArray(){
        for(int i=0; i<arr.length;i++){
            System.out.print("Input value of array: ");
            arr[i]=sc.nextInt();
        }
    }

    void minMax(){
        int max=0;
        int min;
        for (int j : arr) {
            if (j > max) {
                max = j;
            }

        }
        String leftToRight=Arrays.toString(arr);
        System.out.println("Left to Right array: "+leftToRight);
        System.out.print("Right to Left: ");
        for(int i =arr.length-1;i>=0;i--){
            System.out.print(arr[i]+",");
        }
        System.out.println();
        Arrays.sort(arr);
        min=arr[0];
        System.out.println("Largest: "+max);
        System.out.println("Minimum: "+min);
        int secondMinimum = arr[1];
        System.out.println("Second Minimum: "+secondMinimum);

        for(int i=0;i<arr.length-1;i++){
            max=arr[i];
        }

        System.out.println("Second Largest: "+max);
    }

    public static void main(String[] args) {
        Solution s =new Solution();
        s.inputArray();
        s.minMax();
    }
}


