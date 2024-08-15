package jdbc;


import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class Rowsetu {
    public static void main(String[] args) throws Exception{
        JdbcRowSet r=RowSetProvider.newFactory().createJdbcRowSet();
      r.setUrl(null);
      r.setUsername(null);
      r.setPassword(null);

      r.setCommand("select *studentd");

      r.execute();
      while(r.next()){
        System.out.println(r.getString(1));
      }
      
    }
    
}
