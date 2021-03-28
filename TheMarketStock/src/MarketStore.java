import java.util.Scanner;

public class MarketStore {

    int[] id ={101,102,103,105,106,107};
    String []productName ={"Oreo","Tiger","Monaco","Bourbon","Parle-G","Britania"};
    String[]expiry={"10/Aug/2022","12/Dec/2023","17/Oct/2021","22/Mar/2021","31/Jan/2023","16/Jun/2021"};
    int []price={17,25,30,30,5,10};
    boolean []availability={true,false,true,true,false,true};

    void id (){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the id of the product: ");
        int input = sc.nextInt();
        if(input!=101&&input!=102&&input!=103&&input!=104&&input!=105&&input!=106&&input!=107){
            System.out.println("You have entered the wrong product id.");
            System.exit(0);
        }
        int limit =0;
        for(int i=0;i<id.length;i++){
            if(input==id[i]){
                limit=i;
            }

        }
        if(availability[limit]){
            System.out.println("The Expiry of the "+productName[limit]+" biscuits are: "+ expiry[limit]);
            System.out.print("How many you wanted to take today? ");
            input = sc.nextInt();
            System.out.println();
            System.out.println("Total price to pay: "+price[limit]*input);
        }
    }




    public static void main(String[] args) {
        MarketStore ms = new MarketStore();
        ms.id();
    }
}
