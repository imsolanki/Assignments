import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Certificate {

    String name;
    String address;
    String jobRole;
    String dateOfJoin;


    Certificate(String name,String address,String designation,String dateOfJoin){
        this.name=name;
        this.address =address;
        this.jobRole=designation;
        this.dateOfJoin = dateOfJoin;
    }
    void certificateWriter() {
        Date d =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d/MM/yyyy, EEEE");
        System.out.println();

        try {
            File f = new File("D:\\certificate.txt");

            FileOutputStream fos = new FileOutputStream(f,false);
            //FileWriter fileWrite = new FileWriter();
            String data="\n" +
                    "\n" +
                    name+"\n" +
                    "\n" +
                    address+"\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "This letter is to certify that "+ name+" worked as a "+jobRole+" at XYZ company for the period from "+dateOfJoin+" to "+sdf.format(d)+".\n" +
                    " \n" +
                    "\n" +
                    "While at our company, his responsibilities were to design and implement pricing controls in relation to our line of mathematical measuring devices.\n" +
                    "\n" +
                    " \n" +
                    "Through our working relationship, I came to appreciate the attention to detail that James showed for his work and was deeply saddened when he departed our company.\n" +
                    "\n" +
                    "I know that he will do a great job wherever you put him in your organization.\n" +
                    "\n" +
                    " \n" +
                    "\n" +
                    "Sincerely,\n" +
                    "\n" +
                    "Bob\n" +
                    "\n";
            byte []arr = data.getBytes();
            fos.write(arr);
        }
        catch(IOException e){
            System.out.println("File not created");
        }
    }

}
