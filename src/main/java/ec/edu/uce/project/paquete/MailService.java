package ec.edu.uce.project.paquete;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;


@Singleton //// porogramar otra cosa que NO SEA LOGICA
@Named ("correo") //Se le da un nombre a la clase para que pueda ser inyectada en otras clases
public class MailService implements Notificacion { //Se le delega la clase al contenedor ArC para que se encargue de su ciclo de vida y la inyeccion de dependencias
    
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviar correo a " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con exito");
        System.out.println("Fin del envio de correo");

    }
}
