public class Solution {

    // Complete the gameOfThrones function below.
    static void gameOfThrones(String s) {
//abcdf
        if(s.length()%2!=0){
            char lastChar=s.charAt(s.length()-1);
             s= s.substring(0,s.length()-1);
            System.out.println(lastChar);//f
            System.out.println(s);//abcd
            String firstHalf =s.substring(0,((s.length()/2)));//ab
            String secondHalf= s.substring(s.length()/2);//cd
            System.out.println(firstHalf);
            System.out.println(secondHalf);

            char[]arr1 =firstHalf.toCharArray();
            char[]arr2=secondHalf.toCharArray();
            
        }else{
            System.out.println(s);//abcd
            String firstHalf =s.substring(0,((s.length()/2)));//ab
            String secondHalf= s.substring(s.length()/2);//cd
            System.out.println(firstHalf);
            System.out.println(secondHalf);

            char[]arr1 =firstHalf.toCharArray();
            char[]arr2=secondHalf.toCharArray();
        }


    }

    public static void main(String[] args) {
        gameOfThrones("abcdf");
        gameOfThrones("abcd");
    }

}
