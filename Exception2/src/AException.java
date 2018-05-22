
import java.util.Scanner;

public class AException {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            String check = input.next();
            CheckA(check);
        } catch (ItsAException ex) {
            System.out.println(ex);
        }
    }

    public static void CheckA(String message) throws ItsAException{
        for (int i = 0; i < message.length(); i++) {
            if (message.substring(i, i+1).equals("a")) {
                throw new ItsAException("Its A");
            }
        }
    }
}
