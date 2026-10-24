package ec.edu.uce.project.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class CompraService {

    @Inject
    @Named ("correo")
    private Notificacion notificacionCorreo;

    public void realizar(Compra compra ){
        
        System.out.println("Realizado compra...");
        System.out.println("Compra realizada para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Compra realiada con exito");

        String cuerpo = "Estimado " + compra.getCliente() + ", su compra de " + 
        compra.getProducto() + " por un total de $" + compra.getTotal() +
        " ha salido con exito"; 

        //Notificacion de compra por correo
        this.notificacionCorreo.enviar(compra.getCorreo(), cuerpo);
        this.notificacionCorreo.setCantidad(this.notificacionCorreo.getCantidad()+1);
        System.out.println("Cantidad de correos enviados Compra: " + this.notificacionCorreo.getCantidad());
        System.out.println("Nombre: " + this.notificacionCorreo.getNombre());
    }
}
