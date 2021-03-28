import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;

public class Frame extends JFrame implements ActionListener {

    JLabel name,email,mobile,address,designation;
    JTextField nameEnter,emailEnter,mobileEnter,profession;
    JTextArea addressEnter;
    JButton btnSave,btnReset;

    public void showMyGUI(){

        super.setBounds(475,100,350,425);
        super.setResizable(false);
        super.setTitle("Enter Your Information...");

        name= new JLabel("Name: ");
        name.setBounds(20,20,60,25);
        super.add(name);
        nameEnter =new JTextField();
        nameEnter.setBounds(130,20,150,25);
        super.add(nameEnter);

        email= new JLabel("Email: ");
        email.setBounds(20,70,60,25);
        super.add(email);
        emailEnter =new JTextField();
        emailEnter.setBounds(130,70,150,25);
        super.add(emailEnter);

        mobile= new JLabel("Mobile no.: ");
        mobile.setBounds(20,120,90,25);
        super.add(mobile);
        mobileEnter =new JTextField();
        mobileEnter.setBounds(130,120,150,25);
        super.add(mobileEnter);

        address= new JLabel("Address: ");
        address.setBounds(20,190,60,25);
        super.add(address);
        addressEnter=new JTextArea();
        JScrollPane pane =new JScrollPane(addressEnter);
        pane.setBounds(130,190,150,60);
        super.add(pane);


        designation= new JLabel("Profession: ");
        designation.setBounds(20,260,80,25);
        super.add(designation);
        profession =new JTextField();
        profession.setBounds(130,260,150,25);
        super.add(profession);

        btnSave =new JButton("Save");
        btnSave.setBounds(60,330,90,25);
        super.add(btnSave);

        btnReset =new JButton("Reset");
        btnReset.setBounds(180,330,90,25);
        super.add(btnReset);

        super.setLayout(null);
        super.setVisible(true);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnSave){
                if(nameEnter.getText().trim().isBlank()||emailEnter.getText().trim().isBlank()||
                        mobileEnter.getText().trim().isBlank()||addressEnter.getText().trim().isBlank()||
                        profession.getText().trim().isBlank())
                {
                    nameEnter.setText("All field are Mandatory");
                    nameEnter.setBackground(Color.GRAY);
                    nameEnter.setForeground(Color.white);

                    emailEnter.setText("All field are Mandatory");
                    emailEnter.setBackground(Color.GRAY);
                    emailEnter.setForeground(Color.white);

                    mobileEnter.setText("All field are Mandatory");
                    mobileEnter.setBackground(Color.GRAY);
                    mobileEnter.setForeground(Color.white);

                    addressEnter.setText("All field are Mandatory");
                    addressEnter.setBackground(Color.GRAY);
                    addressEnter.setForeground(Color.white);

                    profession.setText("All field are Mandatory");
                    profession.setBackground(Color.GRAY);
                    profession.setForeground(Color.white);
                }
            else if(nameEnter.getText().trim().isBlank()&&emailEnter.getText().trim().isBlank()&&
                    mobileEnter.getText().trim().isBlank()&&addressEnter.getText().trim().isBlank()&&
                    profession.getText().trim().isBlank())
            {
                nameEnter.setText("All field are Mandatory");
                nameEnter.setBackground(Color.GRAY);
                nameEnter.setForeground(Color.white);

                emailEnter.setText("All field are Mandatory");
                emailEnter.setBackground(Color.GRAY);
                emailEnter.setForeground(Color.white);

                mobileEnter.setText("All field are Mandatory");
                mobileEnter.setBackground(Color.GRAY);
                mobileEnter.setForeground(Color.white);

                addressEnter.setText("All field are Mandatory");
                addressEnter.setBackground(Color.GRAY);
                addressEnter.setForeground(Color.white);

                profession.setText("All field are Mandatory");
                profession.setBackground(Color.GRAY);
                profession.setForeground(Color.white);
            }
            else{
                    try {
                        FileOutputStream fos = new FileOutputStream("D:\\fos.txt",false);
                        String str =nameEnter.getText().trim()+"\n"+emailEnter.getText().trim()+"\n"+
                                mobileEnter.getText().trim()+"\n"+addressEnter.getText().trim()+"\n"+
                                profession.getText().trim()+"\n";

                        byte []arr = str.getBytes();
                        fos.write(arr);
                    } catch (IOException exception) {
                        exception.printStackTrace();
                    }
                }
        }
    }
}
