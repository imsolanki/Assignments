import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class AssignmentFosFis {

    String path;
    String fileName;
    AssignmentFosFis(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter path: ");
        path=sc.nextLine();
        System.out.println("Enter file name: ");
        fileName=sc.nextLine();

    }
    void creatingFile() throws Exception {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the data you wanted to store: ");
        String data = sc.nextLine();
        FileOutputStream fio =new FileOutputStream(path+"\\"+fileName,false);
        byte[]array = data.getBytes();
        fio.write(array);
    }
    void isValid() throws Exception {
        File f =new File(path);
        if(f.exists()){
                File fname =new File(path+"\\"+fileName);
                if(fname.isFile()){
                    String nameOfFile = fname.getName();
                    int extension=nameOfFile.lastIndexOf('.')+1;
                    String fileType =nameOfFile.substring(extension);
                    //System.out.println(fileType);
                    if(fileType.equals("txt")||fileType.equals("html")||fileType.equals("c")||
                            fileType.equals("xml")||fileType.equals("java")||fileType.equals("pdf")){
                        creatingReport(path+"\\"+fileName);
                    }
                    else{
                        System.out.println("File is not text file.");
                    }
                }
        }
    }
    void creatingReport(String nameOfFile) throws Exception {
        nameOfFile =path+"\\"+fileName;
        FileInputStream fs = new FileInputStream(nameOfFile);
        byte[]array = new byte[fs.available()];
        System.out.print("The size of "+nameOfFile+" is: "+fs.available()+" bytes");
        System.out.println();
        fs.read(array);
        String read = new String(array,0,array.length);
        //System.out.println(read);
        char []ch =read.toCharArray();
        int totalAlphabets=0;
        int lCase=0;
        int uCase=0;
        int totalWords=0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i]>='a'||ch[i]<='Z'){
                totalAlphabets=totalAlphabets+1;
            }
            if(ch[i]>='a'&&ch[i]<='z'){
                lCase=lCase+1;
            }
            else if(ch[i]>='A'&&ch[i]<='Z'){
                uCase=uCase+1;
            }
        }
        System.out.println();
        System.out.println("Total no. of alphabets present in the file "+nameOfFile+" is: "+totalAlphabets);
        System.out.println("Total no. of lowercase alphabets present in the file "+nameOfFile+" is: "+lCase);
        System.out.println("Total no. of uppercase alphabets present in the file "+nameOfFile+" is: "+uCase);
        String[]parts =read.split(" ");
        for(int i  =0;i<parts.length;i++){
            totalWords=totalWords+1;
        }
        System.out.println("Total no. of words present in the file "+nameOfFile+" is: "+totalWords);
    }

    public static void main(String[] args) throws Exception{
        AssignmentFosFis a =new AssignmentFosFis();
        a.creatingFile();
        a.isValid();
    }
}
