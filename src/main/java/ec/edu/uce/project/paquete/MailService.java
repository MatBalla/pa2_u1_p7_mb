package ec.edu.uce.project.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Singleton;

//@RequestScoped //Solo vive en aplicaciones web
@Singleton //// porogramar otra cosa que NO SEA LOGICA
//@ApplicationScoped //Delego el control al contenedor ArC
public class MailService  { //Se le delega la clase al contenedor ArC para que se encargue de su ciclo de vida y la inyeccion de dependencias
    public void enviar(String correo, String asunto, String cuerpo){
        System.out.println("Enviando correo a: "+ correo);
        System.out.println("Asunto: " + asunto);
        System.out.println("Cuerpo: " + cuerpo);
        System.out.println("Correo enviado con exito");
    }
}
