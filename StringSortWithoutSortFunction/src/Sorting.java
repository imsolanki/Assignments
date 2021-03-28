import java.util.Arrays;
import java.util.Scanner;

public class Sorting {

    String s;

    Sorting(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        if(s.length()<8){
            System.out.println("String should be more than that of 8 alphabets");
            System.exit(0);
        }

    }
    void sorting(int a){
        char []ch =s.toCharArray();
        if(a==1){
            char []asc = new char[ch.length];
            for(int i=0;i< ch.length;i++){
                for(int j=0;j<ch.length;j++){
                    if(ch[i]<ch[j]){
                        asc[i]=ch[i];
                    }
                }
            }
            System.out.println(Arrays.toString(asc));
        }
        else if(a==2){
            char []dsc = new char[ch.length];
            for(int i=0;i<dsc.length;i++){
                for(int j=0;j<dsc.length;j++){
                    if(ch[i]>ch[j]){
                        dsc[i]=ch[i];
                    }
                }
            }
            System.out.println(Arrays.toString(dsc));
        }

    }

    public static void main(String[] args) {
        Sorting s=new Sorting();
        s.sorting(1);
        s.sorting(2);
    }
}
