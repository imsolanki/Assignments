import java.util.Scanner;

public class StringAssignment {


    int[] a;

    StringAssignment(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        System.out.println();
        int size = sc.nextInt();
        a =new int[size];
        for(int i =0;i<a.length;i++){
            System.out.print("Enter value at index "+i+" of an array: ");
            a[i]=sc.nextInt();
            System.out.println();
        }
    }
    void checkFrequency(int[]arr){
        arr=a;
        int freq=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    freq=freq+1;
                }
            }
            System.out.println("Total frequency of "+arr[i]+" is "+freq);
            freq=0;
        }
    }

    public static void main(String[] args) {
        StringAssignment sa =new StringAssignment();
        sa.checkFrequency(sa.a);
    }
}
