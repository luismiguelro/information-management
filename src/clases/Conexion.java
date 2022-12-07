package clases;
import java.sql.*;
/**
 *
 * @author Luis Miguel
 */
public class Conexion {
    //Conexion Local
    public static Connection conectar(){
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds","root","");
            return cn;
        }catch(SQLException e){
            System.out.println("Error: "+ e);
        }
        return(null);
    }
    
}
