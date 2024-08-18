import java.sql.*;
public class Main {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/student";
        String user_name="root";
        String password="#Indrani20";
        String query= "select * from stud";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        try {
            Connection con = DriverManager.getConnection(url, user_name, password);

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            while(rs.next()){
                int roll = rs.getInt(1);
                String name = rs.getString(2);
                System.out.println(roll+" : "+name);
            }

        }
        catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}


