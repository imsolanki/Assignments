import java.util.Scanner;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {

        for(int i = 1; i<=n ;i++){
            System.out.print(" ");
            for(int j =n;j>i;j--){
                System.out.print(" ");
            }
            for(int k =1;k<=i;k++){
                System.out.print("#");
            }
            System.out.println();
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}


//---------------------------------------------------//
/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        // Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.

        Scanner sc =new Scanner(System.in);

        try{
            int inputQuotient = sc.nextInt();
            int inputDivisor =sc.nextInt();
            int result;
            result = inputQuotient/inputDivisor;
            System.out.println(result);

        }catch (InputMismatchException  | ArithmeticException e){
            System.out.println(e);
        }
    }
}

 */

/*
public class Solution {

// Complete the plusMinus function below.
    static void plusMinus(int[] arr) {

        int zeroCount =0;
        int positiveCount=0;
        int negativeCount=0;

        for (int value : arr) {

            if (value < 0) {
                negativeCount = negativeCount + 1;
            } else if (value == 0) {
                zeroCount = zeroCount + 1;
            } else {
                positiveCount = positiveCount + 1;
            }
        }
        // int length= arr.length;
        double positiveResult =(float)positiveCount/arr.length;
        System.out.printf("%.6f",positiveResult);
        System.out.println();
        double negativeResult =(float)negativeCount/arr.length;
        System.out.printf("%.6f",negativeResult);
        System.out.println();
        double zeroResult =(float)zeroCount/arr.length;
        System.out.printf("%.6f",zeroResult);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        // scanner.nextLine();
        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }
        plusMinus(arr);

        scanner.close();
    }
    }
 */


//-------------------------------------------------//

/*
import java.util.Scanner;
class MyCalculator {

     // Create the method long power(int, int) here.

     import java.util.Scanner;long power(int n, int p) throws Exception{

            if(n<0||p<0){
        throw new Exception("n or p should not be negative.");
        }
        else if(n==0&&p==0){
        throw new Exception("n and p should not be zero.");
        }
        else{
        return (long) Math.pow(n,p);
        }
        }

        }

public class Solution {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
 */
