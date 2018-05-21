
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput = input.next();
        try {
            notA2ZException(userInput);
        } catch (NotA2ZException ex) {
            System.out.println(ex);
        } finally {
            System.out.println("End of program!");
        }
    }

    public static void notA2ZException(String message) throws NotA2ZException {

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) < (int) 'Z' && message.charAt(i) > (int) 'A') {
                System.out.println("OK");
            } else if (message.charAt(i) < (int) 'z' && message.charAt(i) > (int) 'a') {
                System.out.println("OK");
            }
            else {
                notA2ZException("Not A to Z");
            }

        }
    }
}
