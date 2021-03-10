import java.util.Scanner;

public class Solution {

    int[]array;
    int value;

    Solution(int[]array,int value){
        this.array=array;
        this.value=value;
    }

    void findLimits() {
        int index = 0;
        try {

            for (int i = 0; i < array.length; i++) {
                if (array[i] == value) {
                    index = i;
                }
            }
            if(array.length==1){
                System.out.println("Upper Limit & Lower Limit is not present");
            }
            else{
                int lowerLimit = array[index]-1;
                int upperLimit = array[index]+1;
                System.out.println("Lower Limit is: "+lowerLimit);
                System.out.println("Upper Limit is: "+upperLimit);

            }

        }
        catch(ArrayIndexOutOfBoundsException e){
            if(array.length==1){
                System.out.println("Upper Limit & Lower Limit is not present");
            }
            else{
                System.out.println("Value is not present in the array.");
                }
            }
           /* else{
                for(int i=0;i<array.length;i++){
                    int lowerLimit = array[index]-1;
                    int upperLimit = array[index]+1;
                    System.out.println("Lower Limit is: "+lowerLimit);
                    System.out.println("Lower Limit is: "+upperLimit);
                }
            }*/
        }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int size =sc.nextInt();
        int[]array=new int[size];
        System.out.println("Enter value to find: ");
        int value=sc.nextInt();
        for(int i=0;i<array.length;i++){
            System.out.println("Enter value at index "+ i +" :");
            array[i]=sc.nextInt();
        }
        Solution s = new Solution(array,value);
        s.findLimits();
    }
}
