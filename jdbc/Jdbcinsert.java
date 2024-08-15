package jdbc;
import java.sql.*;

public class Jdbcinsert {
    public static void main(String[] args) throws Exception{
        String name="charan";
        String age="19";
        String url="jdbc:mysql://localhost:3306/table_name";
        String user="charan";
        String pass="reddy";
        Class.forName("Driver"); 

        Connection con =DriverManager.getConnection(url,user,pass);

        if(con!=null){
            System.out.println("connected");
        
        }
        else{
            System.out.println("not connected");
        }
        Statement st= con.createStatement();

        String ins= "insert into userid values('" +name+ "', '" +age+ 
        "', '" +user+ "', '" +pass+ "')";

        int x= st.executeUpdate(ins);
        if(x>1){
            System.out.println("instered sucessfull");
        }
        else{
            System.out.println("not inserted'");
        }

        String upd= "UPDATE userid set pwd = '" + pass + 
        "' WHERE id = '" +user+ "' AND pwd = '" + pass + "'";

        int y= st.executeUpdate(upd);
        if(y>1){
            System.out.println("updated sucessfull");
        }
        else{
            System.out.println("not updated'");
        }


        String  del= "DELETE from userid WHERE id = '" + user + 
        "' AND pwd = '" + pass + "'";

        int z= st.executeUpdate(del);
        if(z>1){
            System.out.println("deleted sucessfull");
        }
        else{
            System.out.println("not deleted'");
        }

        String q1="select * from userid WHERE id = '" + user + 
        "' AND pwd = '" + pass + "'";
        ResultSet rs= st.executeQuery(q1);
        if(rs.next()){
            System.out.println("name="+rs.getString(1));
            System.out.println("age"+rs.getString(2));
            System.out.println("user"+rs.getString(3));

        }else{
            System.out.println("not selected");
        }

        st.close();
        con.close();
        
    }
   

    
}
