import java.util.Scanner;

public class Solution {

    void calculationFactorial(int value){

        int factorial=value;
        for(int i =1;i<value;i++){
            factorial = factorial*i;
            //System.out.println(factorial);
        }
        System.out.println("The Factorial of given number is: "+factorial);

    }
    int sumOfNumbers(int[]arr,int value){

        int sum = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]%value==0){
                sum=arr[i]+sum;
            }
        }
        return sum;
    }
    int sumOfEven(int[]arr){

        int sum=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]%2==0){
                sum=arr[i]+sum;
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        Solution s =new Solution();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int value =sc.nextInt();
        System.out.println("Enter size of the list: ");
        int size =sc.nextInt();
        int[]array = new int[size];
        for(int i = 0;i< array.length;i++){
            System.out.println("Enter the value at index "+i+" of the list: ");
            array[i]=sc.nextInt();
        }

        s.calculationFactorial(value);
        System.out.println("The sum of numbers divisible by value in the list is: "+s.sumOfNumbers(array,value));
        System.out.println("The sum of even numbers in the list is: "+s.sumOfEven(array));
    }
}

/*Fundamentals
 Use a function to calculate factorial of a number
 Create a function which takes an int list as an argument and returns sum of even numbers in the list.
 Create a function which takes an int list and number X as an argument and returns a sum of numbers
 which are divisible by X in the list.
 */