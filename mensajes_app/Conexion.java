package mensajes_app;
import java.sql.*;

public class Conexion {
    
    public Connection getConnection(){
        Connection connection =null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/al_tayer_motors_db","root","");
            if(connection != null){
                System.out.println("Conexion exitosa");

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM Vehicle");

                while (resultSet.next()) {
                    int idVehicle = resultSet.getInt("idVehicle");
                    String make= resultSet.getString("make");
                    System.out.println("Id Vehicle:" + idVehicle + "\nMake: " + make);
          
                }




            }
        }catch(SQLException e){

            System.out.println(e);
        }
        return connection;
    }
    
}
