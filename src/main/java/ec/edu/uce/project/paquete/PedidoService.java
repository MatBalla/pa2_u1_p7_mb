package ec.edu.uce.project.paquete;

import ec.edu.uce.project.paquete.Interceptors.Auditoria;
import ec.edu.uce.project.paquete.Interceptors.Mail;
import ec.edu.uce.project.paquete.Interceptors.MedirTiempo;
import ec.edu.uce.project.paquete.Interceptors.SMS;
import jakarta.enterprise.context.ApplicationScoped;



@ApplicationScoped
public class PedidoService {
    
    @MedirTiempo 
    @Auditoria
    @SMS 
    @Mail 
    public String realizar(Pedido pedido, String valor1 ){
        
        try {
            Thread.sleep(1500); //es parte de la logica de negocio
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 
        
        System.out.println("Realizado pedido...");
        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo()); 
        System.out.println("----------------------------------------");
        return "Pedido realizado con éxito";
    }

}

