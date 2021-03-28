import java.util.Scanner;

public class ArrayAssignment {
    int value;
    int[]arr;

    ArrayAssignment(int value,int[]arr){
        this.value=value;
        this.arr=arr;
    }

    void findIndexes() {
        int count=0;
        //int firstIndex;
        //boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                //flag = true;
                count =count+1;
              //  System.out.println(count);
                System.out.println("Value "+value+" find at index: "+i);

            }

        }
        System.out.println("total freq: "+count);
        //System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value to find in array: ");
        int value =sc.nextInt();
        System.out.println("Enter size of array: ");
        int arrSize = sc.nextInt();
        int []arr =new int[arrSize];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the value on index "+i+" of array:");
            arr[i]=sc.nextInt();
        }
        ArrayAssignment as =new ArrayAssignment(value,arr);
        as.findIndexes();
       // System.out.println(as.findIndexes());
        //System.out.println("The total");
    }
}

