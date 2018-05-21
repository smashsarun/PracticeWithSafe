
import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Input!");
            String userInput = input.next();        
            HandleException(userInput);
        }
        catch (NotANumberException ex) {
            System.out.println(ex);
        }
        finally{
            System.out.println("--End Program--");
        }
    }
    
    public static void HandleException (String message) throws NotANumberException {
        int zero = (int)'0';
        int nine = (int) '9';
        for (int i = 0; i < message.length(); i++) {
            if ( message.charAt(i) < zero || message.charAt(i) > nine) {
                throw new NotANumberException("Error not a number!");
            }
        }
        
    }

}
