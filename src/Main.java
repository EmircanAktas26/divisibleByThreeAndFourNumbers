import java.sql.SQLOutput;
import java.util.Scanner;

/*
* @Author Emircan Aktaş - 23.Dec.2022
 */
public class Main {
    public static void main(String[] args) {
        int userNumber, average = 0, total= 0;

        Scanner inp = new Scanner(System.in);

        System.out.println("Enter a number");
        userNumber = inp.nextInt();

        int counter = 0;
        for (int i = 1; i <= userNumber; i++){
            if (i % 3 == 0 && i % 4 == 0){
                average = average + i;
                counter++;
                average = average / counter;
            }
        }
        System.out.println(average);
    }
}