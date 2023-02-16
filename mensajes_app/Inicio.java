package mensajes_app;
import java.sql.Connection;
import java.util.Scanner;


public class Inicio{
    public static void main(String[] args) {
    
        Scanner teclado = new Scanner(System.in);

        int opc=0;

        do {
            System.out.println(":::::::********::::::::");
            System.out.println(":::Aplicacion de mensajes:::");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Eliminar mensaje");
            System.out.println("5. Salir");
            //leermos la opcion de usuario
            opc = teclado.nextInt();

            switch(opc){
                case 1:
                    MensajesServicAde.crearMensaje();
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listaMensajes();
                    break;
                case 3:
                    MensajesService.editarMensaje();
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                break;
                default:
                    break;
            }

        } while (opc != 5);

         Conexion conexion = new Conexion();
         try(Connection cnx = conexion.getConnection()) {

         } catch (Exception e) {
             System.out.println(e);
         }
    }
}