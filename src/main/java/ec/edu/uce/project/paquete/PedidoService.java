package ec.edu.uce.project.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;


//@RequestScoped //Solo vive en aplicaciones web
//@Singleton // porogramar otra cosa que NO SEA LOGICA
@ApplicationScoped //Delego el control al contenedor ArC - logica de negocio
public class PedidoService {
    //Dependency Inyection por atributo
    //@Inject
    //public MailService mailService;
    ////////////////////////////////////////////////////
    //Dependency Inyection por constructor
    public MailService mailService;
    
    //Inyeccion de dependencias por constructor
    @Inject
    public PedidoService(MailService mailService){
        this.mailService = mailService;
    }
    ////////////////////////////////////////////////////
    //Dependency Inyection por metodo set
    //private MailService mailService;
 
    //@Inject
    //public void setMailService(MailService mailService) {
    //    System.out.println("Se esta inyectando el servicio de correo");

    //    this.mailService = mailService;
    //}

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
