package raspisanie;

import java.sql.*;

public class Student {
   private int id;
   private String grouppa;
   private String faculty;
   
   
   private Student(int id, String grouppa, String Faculty) {
       this.id = id;
       this.grouppa = grouppa;
       this.faculty = Faculty;
   }
   
    public static void main(String[] args) {
        
    }
    
    static void ConnectionStudents() {
        try {  
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/sonoo","root","root");  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from Student");  
            while(rs.next())  
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
            con.close();
        }
        catch(ClassNotFoundException | SQLException e)
        {  
            System.out.println(e);
        }  
    }
}
