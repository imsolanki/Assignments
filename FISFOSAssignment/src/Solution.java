import java.io.*;
import java.util.Scanner;

public class Solution {

    String path;
    String fileName1;
    String fileName2;

    Solution(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the path: ");
        path =sc.nextLine();
        System.out.println("Enter file 1 name: ");
        fileName1 = sc.nextLine();
        System.out.println("Enter file 2 name: ");
        fileName2 = sc.nextLine();
    }

    void creatingFiles() throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter data you wanted to store: ");
        String s =sc.nextLine();
        FileOutputStream fo1 = new FileOutputStream(path+"\\"+fileName1,false);
        byte[]array = s.getBytes();
        fo1.write(array);
        checkingFiles();
    }
    void checkingFiles() throws IOException {
        File f =new File(path+"\\"+fileName1);
        if(f.exists()){
            if(f.isFile())
            {
                copyingData();
            }
        }
    }
    void copyingData() throws IOException {

        FileInputStream fis1 = new FileInputStream(path+"\\"+fileName1);
        int size=fis1.available();
        byte[]arr = new byte[size];
        fis1.read(arr);
        String s =new String(arr,0,arr.length);
        System.out.println(s);
        FileOutputStream fo2 =new FileOutputStream(path+"\\"+fileName2,false);
        byte[]array = s.getBytes();
        fo2.write(array);
    }


    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        s.creatingFiles();
        
    }
}
