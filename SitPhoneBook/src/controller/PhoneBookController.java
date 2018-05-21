/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.PhoneBook;

/**
 *
 * @author SARUNSUMETPANICH
 */
public class PhoneBookController {
    private Connection con;
    
    //create connection
    public PhoneBookController(String user,String psw) throws SQLException {
        String url = "jdbc:derby://localhost:1527/PhoneBook";
        con = ConnectionManager.createConnection(url,user,psw);
    }
    
    //close connection
    public void CloseController() throws SQLException {
        ConnectionManager.closeConnection(con);
        System.out.println("Close Connection Succesfully");
    }
    
    //Insert menu
    public int AddContact(PhoneBook pb) throws SQLException {
        String sql = "INSERT INTO PhoneBook"+
                "(PHONENUM,NICKNAME,GEN)"+
                "VALUES ('"+pb.getPhoneNum()+"','"+pb.getNickname()+"','"+pb.getGen()+"')";
        Statement stmt = con.createStatement();
        int numOfEffected = stmt.executeUpdate(sql);
        System.out.println("Working...");
        System.out.println(numOfEffected +" contact has been added! : "+pb.getNickname());
        return numOfEffected;
    }
    
    //Search phone number by name
    public ArrayList<PhoneBook> SearchPhonenumByName(String name) throws SQLException{
        ArrayList<PhoneBook> contact = new ArrayList<PhoneBook>(); 
        
        String sql = "SELECT * from PhoneBook where NICKNAME LIKE '%"+
                name+"%'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        
        while(rs.next()) {
            String phoneNum = rs.getString("PHONENUM");
            String nickname = rs.getString("NICKNAME");
            int gen = rs.getInt("GEN");
            
            PhoneBook pb1 = new PhoneBook(phoneNum, nickname, gen);
            
            contact.add(pb1);
        }
        return contact;
    }
    
    //Delete Contact
    public int DeleteContact(String name) throws SQLException{
        String sql = "DELETE FROM PhoneBook "
                + "WHERE NICKNAME = '"+name+"'";
        Statement stmt = con.createStatement();
        int numOfEffected = stmt.executeUpdate(sql);
        System.out.println("Working...");
        System.out.println(numOfEffected + " contact has been removed! : "+name);
        
        return numOfEffected;
    }
    
}
