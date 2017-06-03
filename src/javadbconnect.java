
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class javadbconnect {
    Connection conn = null;
    public static Connection connectionDb(){
    try{
        Class.forName("org.sqlite.JDBC");
        Connection conn = DriverManager.getConnection("jdbc:sqlite:G:\\static - java\\Library Management System\\Library Management.sqlite");
        return conn;
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, e);
    }
        return null;
    }

}
