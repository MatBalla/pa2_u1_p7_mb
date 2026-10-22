package ec.edu.uce.project.paquete;

import jakarta.inject.Singleton;

@Singleton 
@Named ("sms") //Se le da un nombre a la clase para que pueda ser inyectada en otras clases
public class SMSService implements Notificacion{
    
    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviar SMS a " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("SMS enviado con exito");
        System.out.println("Fin del envio de SMS");
    }

}
