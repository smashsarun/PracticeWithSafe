
package controller;

import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.PhoneBook;

public class PhoneBookController {
    Connection con;
    
    //CreateConnection
    public PhoneBookController(String username,String psw) throws ClassNotFoundException, SQLException{
        String url = "jdbc:derby://localhost:1527/PhoneBook2";
        con = ConnectionManager.createConnection(url, username, psw);
        System.out.println("Creating connection...");
    }
    
    //CloseConnection
    public void CloseConnection() throws SQLException{
        ConnectionManager.closeConnection(con);
        System.out.println("Finishing connection...");
    }
    
    //AddContact
    public int AddContact(PhoneBook pb) throws SQLException{
        String sql = "INSERT INTO PhoneBook2 (PhoneNumber,Name,GEN)"
                + "VALUES ('"+pb.getPhoneNumber()+"','"+pb.getName()+"',"+pb.getGen()+")";
        Statement stmt = con.createStatement();
        int updated = stmt.executeUpdate(sql);
        return updated;
    }
    
    //SeeAll
    public ArrayList<PhoneBook> SeeAllContact () throws SQLException{
        ArrayList<PhoneBook> pb1 = new ArrayList<PhoneBook>();
        String sql = "SELECT * FROM PhoneBook2";        
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()){
            String phoneNum = rs.getString("phoneNumber");
            String name = rs.getString("name");
            int gen = rs.getInt("gen");
            
            PhoneBook contact = new PhoneBook(phoneNum, name, gen);
            pb1.add(contact);
        }
        return pb1;
    } 
    
    //ExcuteSQLFromUser
    public void ExcuteSQLFromUser(String sql) throws SQLException{
        Statement stmt = con.createStatement();
        boolean hasResultSet = stmt.execute(sql);
        
        if (hasResultSet) { //true
            ResultSet rs = stmt.getResultSet();
            while (rs.next()) {
                String phoneNum = rs.getString("phoneNumber");
                String name = rs.getString("Name");
                int gen = rs.getInt("gen");
                PhoneBook pb1 = new PhoneBook(phoneNum, name, gen);
                
                System.out.println(pb1);
                
            }
        }
        else {
            int updated = stmt.getUpdateCount();
            System.out.println(updated + " has been updated!");
        }
    }
}
