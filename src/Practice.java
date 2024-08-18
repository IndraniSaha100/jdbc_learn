import java.sql.*;
import java.util.Scanner;

public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String url="jdbc:mysql://localhost:3306/student";
        String userName="root";
        String password="#Indrani20";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{

//            String query="delete from stud where roll=50";
//            String query="update stud set name='Ishita' where roll=179";

//            String query = "select * from stud";

//            String query="drop table stud";




            Connection con = DriverManager.getConnection(url,userName,password);
            Statement st = con.createStatement();

//            int count = st.executeUpdate(query);
//            System.out.println(count+" is affected");
//
//            ResultSet rs = st.executeQuery(query);
//            while(rs.next()){
//                System.out.println(rs.getInt(1)+" : "+rs.getString(2));
//            }


            System.out.print("Enter database name:");

            String db=sc.nextLine();
            String query="create database "+db;
            st.executeUpdate(query);


            sc.close();
            con.close();
            st.close();
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

    }
}