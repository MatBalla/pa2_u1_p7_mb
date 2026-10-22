package ec.edu.uce.project.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;


//@RequestScoped //Solo vive en aplicaciones web
//@Singleton // porogramar otra cosa que NO SEA LOGICA
@ApplicationScoped //Delego el control al contenedor ArC - logica de negocio
public class PedidoService {
    //@Inject 
    //private MailService mailService2;
    
    //Lookup de la clase MailServie
        MailService mailService = CDI.current().select(MailService.class).get(); //Se obtiene el objeto de la clase MailService
    
    public void realizar(Pedido pedido ){
        
        System.out.println("Realizado pedido...");
        System.out.println("" + pedido.getCliente());
        System.out.println("" + pedido.getProducto());
        System.out.println("" + pedido.getTotal());
        System.out.println("" + pedido.getCorreo());

        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado " + pedido.getCliente() + ", su pedido de " + 
        pedido.getProducto() + " por un total de $" + pedido.getTotal() +
        " ha salido con exito"; 

        this.mailService.enviar(pedido.getCorreo(), asunto, cuerpo);
    }

}
