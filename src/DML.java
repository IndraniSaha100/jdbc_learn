import java.sql.*;

public class DML{
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            String url="jdbc:mysql://localhost:3306/student";
            String user="root";
            String password="#Indrani20";

//1.            String query = "insert into stud values (42,'Annanya')";

                int roll=179;
                String name="Ishita";
//2.           String query="insert into stud values ("+ roll +",'"+name+"')";
//3.           String query = "insert into stud values (?,?)";


            Connection con= DriverManager.getConnection(url,user,password);
//1.2.
//            Statement st = con.createStatement();
//            int count = st.executeUpdate(query);

//3.
//            PreparedStatement pst = con.prepareStatement(query);
//            pst.setInt(1,181);
//            pst.setString(2,"P.Sumit");
//            int count = pst.executeUpdate();


            //System.out.println(count + " row affected");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}