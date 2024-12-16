import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try {
            Class.forName("Com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql///airlinemanagementsystem", "root","raihaan@786");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
