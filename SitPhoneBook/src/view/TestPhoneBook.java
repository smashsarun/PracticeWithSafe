
package view;

import controller.PhoneBookController;
import java.sql.SQLException;
import java.util.ArrayList;
import model.PhoneBook;

public class TestPhoneBook {
    public static void main(String[] args) {
//        try {
//        PhoneBookController ctrl = new PhoneBookController("sit","sit");
//        PhoneBook p1 = new PhoneBook("0441442244", "A", 23);
//        ctrl.AddContact(p1);
//        }
//        catch (SQLException ex) {
//            System.out.println(ex);
//        }
        
//        try {
//            PhoneBookController ctrl = new PhoneBookController("sit", "sit");
//            ArrayList<PhoneBook> contact = ctrl.SearchPhonenumByName("Babe");
//            for (int i = 0; i < contact.size(); i++) {
//                System.out.println(contact.get(i).toString());
//            }
//            if (contact.isEmpty()) {
//                System.out.println("Couldn't find any match");
//            }
//        }
//        catch (SQLException ex){
//            System.out.println(ex);
//        }

        try {
            PhoneBookController ctrl = new PhoneBookController("sit", "sit");
            ctrl.DeleteContact("Ram");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}
