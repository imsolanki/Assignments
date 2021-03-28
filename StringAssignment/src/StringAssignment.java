import java.util.Scanner;
import java.util.Stack;

public class StringAssignment{

    // Complete the stringConstruction function below.
    static void stringConstruction(String s) {
        int count = 0;
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 =new Stack<>();
        for (int i = 0; i < s.length() ; i++) {
            stack1.push(s.charAt(i));
        }
        for(int i=0;i<s.length()*10;i++){
            if(stack2.empty()){
                stack2.push(stack1.pop());

            }
            else{
                if(stack2.peek()!=stack1.peek()){
                    count =count+1;
                    stack2.pop();

                }
            }

        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            stringConstruction(s);
        }
    }
}

/*
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class StringAssignment {

    static void funnyString(String s) {
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        String sReverse=sb.reverse().toString();

        boolean flag=false;
        int[]arr=new int[s.length()-1];
        int[]arrReverse=new int[s.length()-1];

        for(int i=0;i<s.length()-1;i++){

            arr[i]=(s.charAt(i+1)-s.charAt(i));
            if(arr[i]<0){
                arr[i]=arr[i]*-1;
            }
            arrReverse[i]=(sReverse.charAt(i)-sReverse.charAt(i+1));
            if(arrReverse[i]<0){
                arrReverse[i]=arrReverse[i]*-1;
            }

        }
        String a= Arrays.toString(arr);
        String b=Arrays.toString(arrReverse);
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i< arrReverse.length;i++){
            if(arr[i]==arrReverse[i]){
                flag=true;
            }
            else{
                flag=false;
                break;
            }
        }

        if(flag){
            System.out.println("Funny");
        }else{
            System.out.println("Not Funny");
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            funnyString(s);
        }
    }
}



char[] charSize = s.toCharArray();

        int[] arr = new int[26];

        for (int i = 0; i < charSize.length; i++) {

        }
        StringBuilder sb =new StringBuilder();
        for(int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
            if(arr[i]%2!=0&&arr[i]>1){
                sb.append(charSize[i]);
            }
        }
        System.out.println(sb);


import java.util.Scanner;

public class StringAssignment {

    String str;
    int number;

    StringAssignment(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter String: ");
        str= sc.nextLine();
        str=str.trim().toLowerCase();
        System.out.println();
        System.out.println("Enter Number: ");
        number=sc.nextInt();
    }

    void stringReverse(int a){
        if(a==1){
            String []parts=str.split(" ");
            for(int i = parts.length-1;i>=0;i--){
                System.out.print(parts[i].toString()+" ");
            }
        }
        else if(a==2){

            char []ch = str.toCharArray();

            for(int i=ch.length-1;i>=0;i--){
                System.out.print(ch[i]);
            }
        }
        else{
            System.out.println("Enter 1 or 2 only");
            System.exit(0);
        }

    }
    void convertNumber(int input){
        if(input==1){
            String binary= Integer.toBinaryString(number);
            System.out.println("Binary Conversion of "+number+" is: "+binary);
        }
        else if(input==2){
            String octal= Integer.toOctalString(number);
            System.out.println("Octal Conversion of "+number+" is: "+octal);
        }
        else if(input==3){
            String hex= Integer.toHexString(number);
            System.out.println("Octal Conversion of "+number+" is: "+hex);
        }
        else{

            System.out.println("Enter 1,2 or 3 only");
            System.exit(0);

        }

    }
    public static void main(String[] args) {
        StringAssignment sa = new StringAssignment();
        sa.stringReverse(1);
        System.out.println();
        sa.stringReverse(2);
        System.out.println();
        sa.convertNumber(1);
        sa.convertNumber(2);
        sa.convertNumber(3);
    }
}

*/
/*
Assignment to calculate length of string.

 public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s = sc.nextLine().toLowerCase().trim();
        //sc.nextLine();
        int index =0;
        char[]ch =s.toCharArray();
        for(int i = 0; i<ch.length;i++){
            index =index+1;
        }

        System.out.println("Length of string is: "+index);
int alphabetNumber = charSize[i] - 'a';
            arr[alphabetNumber] = (arr[alphabetNumber] +1);
   }*/

