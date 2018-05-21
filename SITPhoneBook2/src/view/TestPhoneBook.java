package view;

import controller.PhoneBookController;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.PhoneBook;

public class TestPhoneBook {

    public static void main(String[] args) {
        try {
            PhoneBookController pb1 = new PhoneBookController("sit", "sit");
//            ArrayList<PhoneBook> allContact = pb1.SeeAllContact();
//            
//            for (PhoneBook phoneBook : allContact) {
//                System.out.println(phoneBook);
//            }

            pb1.ExcuteSQLFromUser("SELECT * FROM PhoneBook2");
            

            pb1.CloseConnection();
        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
