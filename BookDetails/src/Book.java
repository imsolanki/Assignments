import java.util.Scanner;

public class Book {

    int isbn;
    int pages;
    String author;
    String topic;
    String publisher;
    float price;

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        Book b1 =new Book();
        Book b2 =new Book();
        Book b3 =new Book();

        //------book 1 details ---------//
        System.out.print("Enter the isbn of book 1: ");
        b1.isbn = sc.nextInt();
        System.out.print("Enter the number of pages in book 1: ");
        b1.pages=sc.nextInt();
        System.out.print("Author: ");
        b1.author =sc.nextLine();
        sc.nextLine();
        System.out.print("Topic: ");
        b1.topic=sc.nextLine();
        //sc.nextLine();
        System.out.print("Publisher: ");
        b1.publisher=sc.nextLine();
       // sc.nextLine();
        System.out.print("Price: ");
        b1.price = sc.nextFloat();

        //------book 2 details ---------//

        System.out.print("Enter the isbn of book 2: ");
        b2.isbn = sc.nextInt();
        System.out.print("Enter the number of pages in book 2: ");
        b2.pages=sc.nextInt();
        System.out.print("Author: ");
        b2.author =sc.nextLine();
        sc.nextLine();
        System.out.print("Topic: ");
        b2.topic=sc.nextLine();
        //sc.nextLine();
        System.out.print("Publisher: ");
        b2.publisher=sc.nextLine();
        //sc.nextLine();
        System.out.print("Price: ");
        b2.price = sc.nextFloat();

        //--------book 3 details---------//

        System.out.print("Enter the isbn of book 3: ");
        b3.isbn = sc.nextInt();
        System.out.print("Enter the number of pages in book 3: ");
        b3.pages=sc.nextInt();
        System.out.print("Author: ");
        b3.author =sc.nextLine();
        sc.nextLine();
        System.out.print("Topic: ");
        b3.topic=sc.nextLine();
        //sc.nextLine();
        System.out.print("Publisher: ");
        b3.publisher=sc.nextLine();
        //sc.nextLine();
        System.out.print("Price: ");
        b3.price = sc.nextFloat();

        System.out.println("Press 1 to compare on price OR press 2 to compare on no. of pages and " +
                "press 3 to get the total cost of all three books.");
        int input = sc.nextInt();

        if(input==1){
            if(b1.price>b2.price&& b1.price>b3.price){

                System.out.print("The isbn of book 1: "+b1.isbn);
                System.out.print("The number of pages in book 1: "+b1.pages);
                System.out.print("Author: "+b1.author);
                System.out.print("Topic: "+b1.topic);
                System.out.print("Publisher: "+b1.publisher);
                System.out.print("Price: "+ b1.price);

            }
            else if(b2.price>b1.price&&b2.price>b3.price){
                System.out.print("The isbn of book 2: "+b2.isbn);
                System.out.print("The number of pages in book 2: "+b2.pages);
                System.out.print("Author: "+b2.author);
                System.out.print("Topic: "+b2.topic);
                System.out.print("Publisher: "+b2.publisher);
                System.out.print("Price: "+ b2.price);
            }
            else{
                System.out.print("The isbn of book 3: "+b3.isbn);
                System.out.print("The number of pages in book 3: "+b3.pages);
                System.out.print("Author: "+b3.author);
                System.out.print("Topic: "+b3.topic);
                System.out.print("Publisher: "+b3.publisher);
                System.out.print("Price: "+ b3.price);
            }
        }
        else if(input==2){

            if(b1.pages>b2.pages&& b1.pages>b3.pages){

                System.out.print("The isbn of book 1: "+b1.isbn);
                System.out.print("The number of pages in book 1: "+b1.pages);
                System.out.print("Author: "+b1.author);
                System.out.print("Topic: "+b1.topic);
                System.out.print("Publisher: "+b1.publisher);
                System.out.print("Price: "+ b1.price);

            }
            else if(b2.pages>b1.pages&&b2.pages>b3.pages){
                System.out.print("The isbn of book 2: "+b2.isbn);
                System.out.print("The number of pages in book 2: "+b2.pages);
                System.out.print("Author: "+b2.author);
                System.out.print("Topic: "+b2.topic);
                System.out.print("Publisher: "+b2.publisher);
                System.out.print("Price: "+ b2.price);
            }
            else{
                System.out.print("The isbn of book 3: "+b3.isbn);
                System.out.print("The number of pages in book 3: "+b3.pages);
                System.out.print("Author: "+b3.author);
                System.out.print("Topic: "+b3.topic);
                System.out.print("Publisher: "+b3.publisher);
                System.out.print("Price: "+ b3.price);
            }
        }
        else if(input==3){
            int totalPrice = (int) (b1.price+b2.price+b3.price);
            System.out.println("Total Price of all books: "+totalPrice);
        }
        else{
            System.out.println("Please give correct input. ");
        }

    }
}
