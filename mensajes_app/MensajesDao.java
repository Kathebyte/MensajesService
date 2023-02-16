package mensajes_app;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.*;

public class MensajesDao {

    public static void crearMensajeDB(Mensajes mensaje){
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection()){
            PreparedStatement ps=null;
            try{
                String query="INSERT INTO mensajes( mensaje, autor_mensaje) VALUES (?,?)";
                ps= conexion.prepareStatement(query);
                ps.setString(1,mensaje.getMensaje());
                ps.setString(2,mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje ha sido creado Exitosamente");

            }catch(SQLException ex){
                System.out.println(ex);
            }

        }catch (SQLException e){
            System.out.println(e);
        }
    }
    public static void leerMensajesDB(){

    }
    public static void borrarMensajesDB(){}

    public static void actualizarMensajesDb(){}
    
}
