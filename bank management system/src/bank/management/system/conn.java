package bank.management.system;

import java.sql.*;  

public class conn{
    Connection c1;
    Statement s;
    public conn(){  
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            c1 =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","pblproject9827");    
            s =c1.createStatement(); 
           
          
            
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  