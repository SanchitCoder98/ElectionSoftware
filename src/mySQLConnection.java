import java.sql.*;
class mySQLConnection {
    Connection con=null;
    public static Connection connectDB()
    {
        try{
            System.out.println("hmm");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("OK");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/students","root","Sanchit123");
            System.out.println("Connect");
            return con;
        }
        catch(Exception e)
        {
            System.out.println("NOPE");
            return null;
        }
    }
}
