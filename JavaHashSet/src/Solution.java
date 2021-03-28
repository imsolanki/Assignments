import java.util.HashSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
            //Write your code here
        HashSet <String> hs = new HashSet<>(); //duplicates are not allowed in hashset
        for(int i =0;i<t;i++){
            hs.add(pair_left[i]+" "+pair_right[i]);//wont add duplicates
            int size = hs.size();//size changes if added but remain same if duplicate found because
            //duplicate wont be added
            System.out.println(size);
        }


    }
}