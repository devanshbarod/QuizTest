/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuizMS;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author devan
 */
public class ConnectionCode {
    private static Connection con;
    public static Connection getcon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/quizms", "root", "devansh@64");
        }catch(Exception e)
        {
            System.out.println("Exception "+e);
        }
        return con;
    }
}
