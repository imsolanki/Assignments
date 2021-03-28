import java.math.BigInteger;
import java.util.Scanner;

//Big Integer

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        //BigInteger x = new BigInteger("")
        Scanner sc =new Scanner(System.in);
        BigInteger X =new BigInteger(sc.next());
        BigInteger Y =new BigInteger(sc.next());
        BigInteger Z = X.add(Y);
        System.out.println(Z);
        BigInteger P = X.multiply(Y);
        System.out.println(P);
    }
}
/*
import java.util.Scanner;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long countA=0;
        char []str =s.toCharArray();
        //finding a freq
        for(int i=0; i<str.length;i++){
            if(str[i]=='a'){
                countA++;
            }
        }
        countA = (n/s.length())*countA;
        for(int i=0;i<n%s.length();i++){
            if(str[i]=='a'){
                countA++;
            }
        }
        return countA;
    }


    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String str = s.next();
        int n =s.nextInt();
        repeatedString(str,10);
    }
}
 */



/*
To find median.

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the findMedian function below.
    static int findMedian(int[] arr) {

        Arrays.sort(arr);
        int totalLength = arr.length;
        int evenCountHalf = (totalLength-1)/2;
        int median=0;
        for(int i=0;i<=evenCountHalf;i++){
            median =arr[i];
        }
        return median;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = findMedian(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
*/



/*
strong password
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the minimumNumber function below.
    static int minimumNumber(int n, String password) {
        //int count =0;
        // Return the minimum number of characters to make the password strong
        *//*char[] charPass = password.toCharArray();
        if(charPass.length!=6){
            return (6-charPass.length);
        }
        //!@#$%^&*()-+
        else{

            }*//*
        int count = 0;
        if(!password.matches(".*[a-z].*")) {
            count++;
        }

        if(!password.matches(".*[A-Z].*")) {
            count++;
        }

        if(!password.matches(".*[0-9].*")) {
            count++;
        }

        if(password.matches("[a-zA-Z0-9]*")) {
            count++;
        }
        int passLengthDifference = 6 - password.length();

        if(passLengthDifference > 0 && count <= passLengthDifference) {
            return passLengthDifference;
        }
        return count;
        }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}*/

/*

data type prob

import java.util.Scanner;
class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                //Complete the code
                if(x >= -Math.pow(2, 15) && x <= Math.pow(2, 15) - 1)
                    System.out.println("* short");
                if(x >= -Math.pow(2, 31) && x <= Math.pow(2, 31) - 1)
                    System.out.println("* int");
                if(x >= -Math.pow(2, 63) && x <= Math.pow(2, 63) - 1)
                    System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}
*/






/*
https://www.hackerrank.com/challenges/java-int-to-string/
import java.util.*;
import java.security.*;
public class Solution {
    public static void main(String[] args) {

        DoNotTerminate.forbidExit();

        try {
            Scanner in = new Scanner(System.in);
            int n = in .nextInt();
            in.close();
            //String s=???; Complete this line below
            String s=String.valueOf(n);

            //Write your code here


            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}

import java.security.Permission;

//The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}



*/



/*

https://www.hackerrank.com/challenges/camelcase/problem
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution{

    // Complete the camelcase function below.
    static int camelcase(String s) {

        String []str = s.split("(?=[A-Z])");
        int count=0;
        for(int i=0;i<str.length;i++){
            count=count+1;
        }
        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = camelcase(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
*/

