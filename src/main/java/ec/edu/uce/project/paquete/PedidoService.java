package ec.edu.uce.project.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;


//@RequestScoped //Solo vive en aplicaciones web
//@Singleton // porogramar otra cosa que NO SEA LOGICA
@ApplicationScoped //Delego el control al contenedor ArC - logica de negocio
public class PedidoService {
    @Inject
    @Named ("correo") //Se le indica al contenedor ArC que inyecte la clase MailService en la variable notificacionCorreo
    private Notificacion notificacionCorreo;
    @Inject
    @Named ("sms") //Se le indica al contenedor ArC que inyecte la clase SMSService en la variable notificacionSMS
    private Notificacion notificacionSMS;

    
       
    public void realizar(Pedido pedido ){
        
        System.out.println("Realizado pedido...");
        System.out.println("" + pedido.getCliente());
        System.out.println("" + pedido.getProducto());
        System.out.println("" + pedido.getTotal());
        System.out.println("" + pedido.getCorreo());

        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + 
        pedido.getProducto() + " por un total de $" + pedido.getTotal() +
        " ha salido con exito"; 

        //Notificacion de pedido por correo
        this.notificacionCorreo.enviar(pedido.getCorreo(), cuerpo);
        
        //Notificacion de pedido por SMS
        this.notificacionSMS.enviar(pedido.getTelefono(), cuerpo);
        
    }

}
