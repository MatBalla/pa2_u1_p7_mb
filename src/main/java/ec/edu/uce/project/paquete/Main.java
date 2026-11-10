package ec.edu.uce.project.paquete;

import ec.edu.uce.project.paquete.extensiones.NotificacionExtensionMail;
import ec.edu.uce.project.paquete.extensiones.NotificacionExtensionSMS;
import ec.edu.uce.project.paquete.extensiones.NotificacionExtensionWhatsApp;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain //Se le indica a Quarkus que esta es la clase principal de la aplicacion
public class Main implements QuarkusApplication {//Se implementa la interfaz QuarkusApplication

    @Inject 
    private CompraService compraService; 

    @Inject
    private NotificacionExtensionMail notificacionExtensionMail;

    @Inject 
    private NotificacionExtensionSMS notificacionExtensionSms;

    @Inject 
    private NotificacionExtensionWhatsApp notificacionExtensionWhatsApp;
    
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);

    }

    
    //Todo se hace en este metodo run
    @Override 
    public int run(String... args){ //Se implementa el metodo run de la interfaz QuarkusApplication
        System.out.println("Iniciando aplicacion Quarkus");

       Compra compra = new Compra("Juan Caranqui", "Laptop", 1200.00, "juan@gmail.com");
        compraService.realizar(compra, notificacionExtensionMail);

        System.out.println("--------------------------------------------------");
        
        Compra compra2 = new Compra("Ismael Andrango", "Laptop", 1200.00, "ismael@gmail.com");
        compraService.realizar(compra2, notificacionExtensionSms);
        
        System.out.println("--------------------------------------------------");

        //Se crea la extension, sin topar la clase CompraService
        Compra compra3 = new Compra("Joseph Caiza", "Laptop", 1200.00, "joseph@gmail.com");
        compraService.realizar(compra3, notificacionExtensionWhatsApp);

        return 0;
    }
}
