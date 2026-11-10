package ec.edu.uce.project.paquete;

import ec.edu.uce.project.paquete.extensiones.NotificacionExtension;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class CompraService {

    public void realizar(Compra compra, NotificacionExtension notificacionExtension ){
        
        System.out.println("Realizado compra...");
        System.out.println("Compra realizada para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Compra realiada con exito");

        //Se programa el envio de la notificacion
        notificacionExtension.enviar("Su pedido ha sido con exito", compra.getCliente());

        



        
    }
}
