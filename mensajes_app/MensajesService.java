package mensajes_app;

import java.util.Scanner;

public class MensajesService {

    public static void crearMensaje(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje= teclado.nextLine();

        System.out.println("Autor del mensaje");
        String autor = teclado.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(autor);
        MensajesDao.crearMensajeDB(registro);
    }

    public static void listaMensajes(){}

    public static void borrarMensaje(){}

    public static void editarMensaje(){}
    
}
