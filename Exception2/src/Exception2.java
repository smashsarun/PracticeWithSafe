
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Exception2 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        try{
            System.out.println("Input number:");
            int userInput = input.nextInt();
            
            if (userInput % 2 == 1) {
                throw new OddNumException("Invalid Input");
            }
            else {
                System.out.println("This number is even");
            }
        } catch (OddNumException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("--End Program--");
        }
    }
}
