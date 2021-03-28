import java.util.*;
class Solution {

    char findingOpposite(char a) {
        if (a == '}') {
            return '{';
        } else if (a == ']') {
            return '[';
        } else if (a == ')') {
            return '(';
        }
        return a;
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        while (sc.hasNext()) {
            boolean flag =true;
            String input = sc.next();
            //System.out.println(input);
            //Complete the code
            char[] ch = input.toCharArray();
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
                    stack.push(ch[i]);

                    // System.out.println("pushing"+ch[i]+" in stack");
                } else if (ch[i] == '}' || ch[i] == ')' || ch[i] == ']') {
                    // System.out.println("found this char trying to match it "+ ch[i]);
                    if(stack.empty()){
                        flag =false;
                        break;
                    }else{
                        char top = stack.peek();
                        stack.pop();
                        // System.out.println(top+ "found top at the peek and poped it");
                        char c = s.findingOpposite(ch[i]);
                        //      System.out.println(top({()}));
                        //System.out.println(c);
                        if (top == c) {
                            // System.out.println();
                        }
                        else {
                            flag = false;
                        }
                    }




                }


            }
            if(!stack.empty()){
                //System.out.println(flag);
                flag=false;
            }

            System.out.println(flag);


        }
    }
}




