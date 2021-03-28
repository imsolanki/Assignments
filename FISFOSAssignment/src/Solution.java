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

    void creatingFiles() throws FileNotFoundException {
        FileOutputStream fo1 = new FileOutputStream(path+"\\"+fileName1,false);
        FileOutputStream fo2 =new FileOutputStream(path+"\\"+fileName2,false);
    }
    void checkingFiles() throws IOException {
        File f =new File(path+" "+fileName1);
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


    }


    public static void main(String[] args) throws IOException {
        Solution s = new Solution();
        s.creatingFiles();
        s.checkingFiles();
    }
}
/* if (f2.isFile()) {
                FileOutputStream fos1 = new FileOutputStream("D:\\a.txt", false);
                System.out.println("Enter the data want to get write: ");
                String data = sc.nextLine();
                byte[] fosArray = data.getBytes();
                fos1.write(fosArray);
                System.out.println("Press 1 for copy a.txt in b.txt OR Press 2 for append a.txt in b.txt");
                int input = sc.nextInt();
                if (input == 1) {//write mode
                    FileOutputStream fos2 = new FileOutputStream("D:\\b.txt", false);
                    fos2.write(fosArray);
                    Runtime r =Runtime.getRuntime();
                    String s= "D:\\b.txt";
                    r.exec("cmd /c start "+s);

                } else if (input == 2) {//append mode
                    FileOutputStream fos2 = new FileOutputStream("D:\\b.txt", true);
                    fos2.write(fosArray);
                    Runtime r =Runtime.getRuntime();
                    String s= "D:\\b.txt";
                    r.exec("cmd /c start "+s);*/