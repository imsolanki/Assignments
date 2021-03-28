/*

//Inheritance 1st ques of block 7th

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
    void sing(){
        System.out.println("I am singing");
    }
}

public class Solution{

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}

//Inheritance 2nd ques of block 7th

//Write your code here
class Arithmetic{

     int add(int a, int b){
         return a+b;
     }
}

class Adder extends Arithmetic{
    @Override
    int add(int a, int b) {
        return super.add(a, b);
    }
}

public class Solution{
    public static void main(String []args){
        // Create a new Adder object
        Adder a = new Adder();

        // Print the name of the superclass on a new line
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());

        // Print the result of 3 calls to Adder's `add(int,int)` method as 3 space-separated integers:
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}


//ques of abstract class block 7

import java.util.*;
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

//Write MyBook class here
class MyBook extends Book{

    @Override
    void setTitle(String s) {
        super.title=s;
    }

}

public class Main{

    public static void main(String []args){
        //Book new_novel=new Book(); This line prHMain.java:25: error: Book is abstract; cannot be instantiated
        Scanner sc=new Scanner(System.in);
        String title=sc.nextLine();
        MyBook new_novel=new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: "+new_novel.getTitle());
        sc.close();

    }
}


//Method Over riding  1st qus of hacker rank
 */
/*
class Sports{

    String getName(){
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }

    // Write your overridden getNumberOfTeamMembers method here
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has "+11+ " players in " + getName() );
    }
  //  Each team has 11 players in Soccer Class

}

public class Main{

    public static void main(String []args){
        Sports c1 = new Sports();
        Soccer c2 = new Soccer();
        System.out.println(c1.getName());
        c1.getNumberOfTeamMembers();
        System.out.println(c2.getName());
        c2.getNumberOfTeamMembers();
    }
}
*/

class BiCycle{
    String define_me(){
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle{
    String define_me(){
        return "a cycle with an engine.";
    }

    MotorCycle(){
        System.out.println("Hello I am a motorcycle, I am "+ define_me());

        String temp=super.define_me(); //Fix this line

        System.out.println("My ancestor is a cycle who is "+ temp );
    }

}
class Solution{
    public static void main(String []args){
        MotorCycle M=new MotorCycle();
    }
}
