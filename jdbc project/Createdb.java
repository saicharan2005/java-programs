import java.io.*;
import java.sql.*;

public class Createdb{
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        String url="jdbc:mysql://localhost:3306/college";
        String user="root";
        String pass="Charan@123";

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(url, user, pass);

        Statement st= con.createStatement();

        //if retrive the data
        String query ="select *from  students" ;

        ResultSet rs=st.executeQuery(query);  //execute and kept in resultset
        rs.next();
        String name=rs.getString("full_name");//keep data from db in string
        System.out.println(name);


        st.close();
        con.close();

    System.out.println("successfully executed");

    }
}



