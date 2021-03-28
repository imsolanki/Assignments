import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    /*
     * Complete the maximumDraws function below.
     */
    static int maximumDraws(int n) {

        return (n-n/2)+1;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(scanner.nextLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(scanner.nextLine().trim());

            int result = maximumDraws(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}

/*
static int lowestTriangle(int base, int area){
        // Complete this function
        for(int i=0;i<10;i++){
            if(area%base==0){
                break;
            }
            else{
                area=area+1;
            }
        }
        int h = (2*area)/base;

        return h;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int area = in.nextInt();
        int height = lowestTriangle(base, area);
        System.out.println(height);
    }





    int evenN=0;
        int oddN=0;
        for(int i =0;i<n;i++){
            if(i%2==0){
                if(i==2){
                     evenN=2;
                     break;
                }
                else{
                    for(int j=0;j<n;j++){
                        i=i-2;
                        evenN=evenN+1;
                        if(j==2){
                            evenN=evenN+2;
                            break;
                        }
                    }
                }
            }

            if(i%2!=0){
                if(i==3){
                    oddN=3;
                    break;
                }
                else{
                    for(int j=0;j<n;j++){
                        i=i-2;
                        oddN=oddN+1;
                        if(j==3){
                            oddN=oddN+3;
                            break;
                        }
                    }
                }
            }

        }
        if(n%2!=0){
            return oddN;
        }else{
            return evenN;
        }
 */