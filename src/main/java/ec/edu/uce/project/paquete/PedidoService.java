package ec.edu.uce.project.paquete;

import ec.edu.uce.project.paquete.Interceptors.Auditoria;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;



@ApplicationScoped
public class PedidoService {
       
    @Auditoria
    public String realizar(Pedido pedido, String valor1 ){
        
        System.out.println("Realizado pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        return "Pedido realizado con éxito";
    }

}
