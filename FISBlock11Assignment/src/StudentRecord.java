import java.io.*;

public class StudentRecord {

    String name;
    int roll;
    String dob;

    public void getInfo(){
        File f =new File("D:\\sample.txt");
        if(f.exists()){
            try{
                if(f.isFile()){
                    FileInputStream fis = new FileInputStream(f);
                    BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                    String line;
                    int count =0;

                    while ((line = br.readLine()) != null) {
                        count=count+1;
                        if(line.startsWith("N")){
                            name=line.substring(6);
                        }
                        else if(line.startsWith("R")){
                            roll=Integer.parseInt(line.substring(6));
                        }
                        else{
                            dob=line.substring(5);
                        }
                        System.out.println("Line "+count+" "+line);
                    }
                    System.out.println();
                    System.out.println(name +" was born on "+dob+" and has Roll number: "+roll);

                    br.close();

                }
            }catch(IOException e){
                System.out.println("File not found.");
            }

        }

    }

}
