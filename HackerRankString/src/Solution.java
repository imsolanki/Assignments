import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()!=b.length()){
            return false;
        }else{
            char []arrayA1 =a.toLowerCase().toCharArray();
            char []arrayA2 =b.toLowerCase().toCharArray();
            java.util.Arrays.sort(arrayA1);
            java.util.Arrays.sort(arrayA2);
            return java.util.Arrays.equals(arrayA1, arrayA2);

        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

/*
        block 3 iiird ques
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        *//* Enter your code here. Print output to STDOUT. *//*
        int totalStringSize= A.length()+B.length();
        System.out.println(totalStringSize);
        if(A.compareTo(B)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        //System.out.println(A.compareTo(B)>0?"Yes":"No");
        String c =A.substring(0,1).toUpperCase()+A.substring(1);
        String d =B.substring(0,1).toUpperCase()+B.substring(1);
        String cap = c+" "+d;
        System.out.println(cap);*/

        /*

        block 3rd 4th ques
        hacker rank substring method to extract particular are of string

        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        String str = S.substring(start,end);
        System.out.println(str);*/

       /*
        block 3 plaindrome qus 4
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev ="";
        int lengthOfString = A.length();

        for(int i = lengthOfString-1;i>=0;i--){
            rev = rev+A.charAt(i);
        }
        if(A.equals(rev)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }*/

       /*// Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] arr = new int[5];
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }*/
