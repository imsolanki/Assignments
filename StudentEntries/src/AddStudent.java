import java.util.ArrayList;

public class AddStudent {

    ArrayList<Student> studentObjects = new ArrayList<>();

    void addStudent(Student s){
    studentObjects.add(s);
    }

    void printDetail(){
        for(int i=0;i<studentObjects.size();i++){
            Student s =studentObjects.get(i);
            s.printDetails();
        }
    }
}
