import java.util.Scanner;

public class Solution{

    // Complete the stringConstruction function below.
    static void stringConstruction(String s) {

        StringBuilder buildUniq = new StringBuilder();
        boolean[] uniqCheck = new boolean[128];

        for (int i = 0; i < s.length(); i++) {
            if (!uniqCheck[s.charAt(i)]) {
                uniqCheck[s.charAt(i)] = true;
                if (uniqCheck[s.charAt(i)]){
                    buildUniq.append(s.charAt(i));
                }
            }
        }
        String unique=buildUniq.toString();
        int n = unique.length();
        System.out.println(n);
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


//------------------SUPER REDUCED STRING-------------------///
/*for(int i=0;i<s.length();i++){
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





import java.io.*;
import java.util.Stack;

public class Solution {

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }


        if (stack.isEmpty()) {
            sb.append("Empty String");
        } else {
            for (char ch : stack) {
                sb.append(ch);
            }
        }
        String sbReturn=sb.toString();
        return sbReturn;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


/* char[]charSize = s.toCharArray();

    char[]arr =new char[26];

    for(int i =0;i<charSize.length;i++){
        int alphabetNumber =charSize[i]-'a';
        arr[alphabetNumber]=arr[alphabetNumber]+1;
        if(charSize[i]=='a'){
            arr[0]=arr[0]+1;
        }
        else if(charSize[i]=='b'){
            arr[1]=arr[1]+1;
        }
        else if(charSize[i]=='c'){
            arr[2]=arr[2]+1;
        }
        else if(charSize[i]=='d'){
            arr[3]=arr[3]+1;
        }
        else if(charSize[i]=='e'){
            arr[4]=arr[4]+1;
        }
        else if(charSize[i]=='f'){
            arr[5]=arr[5]+1;
        }
        else if(charSize[i]=='g'){
            arr[6]=arr[6]+1;
        }else if(charSize[i]=='h'){
            arr[7]=arr[7]+1;
        }
        else if(charSize[i]=='i'){
            arr[8]=arr[8]+1;
        }else if(charSize[i]=='j'){
            arr[9]=arr[9]+1;
        }
        else if(charSize[i]=='k'){
            arr[10]=arr[10]+1;
        }else if(charSize[i]=='l'){
            arr[11]=arr[11]+1;
        }else if(charSize[i]=='m'){
            arr[12]=arr[12]+1;
        }
        else if(charSize[i]=='n'){
            arr[13]=arr[13]+1;
        }
        else if(charSize[i]=='o'){
            arr[14]=arr[14]+1;
        }
        else if(charSize[i]=='p'){
            arr[15]=arr[15]+1;
        }
        else if(charSize[i]=='q'){
            arr[16]=arr[16]+1;
        }
        else if(charSize[i]=='r'){
            arr[17]=arr[17]+1;
        }
        else if(charSize[i]=='s'){
            arr[18]=arr[18]+1;
        }
        else if(charSize[i]=='t'){
            arr[19]=arr[19]+1;
        }
        else if(charSize[i]=='u'){
            arr[20]=arr[20]+1;
        }
        else if(charSize[i]=='v'){
            arr[21]=arr[21]+1;
        }
        else if(charSize[i]=='w'){
            arr[22]=arr[22]+1;
        }
        else if(charSize[i]=='x'){
            arr[23]=arr[23]+1;
        }else if(charSize[i]=='y'){
            arr[24]=arr[24]+1;
        }else{
            arr[25]=arr[25]+1;
        }
    }*/