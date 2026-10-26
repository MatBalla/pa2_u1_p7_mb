package ec.edu.uce.pa.paquete;

import java.util.UUID;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {
    private int conteo = 0;

    // Inyeccion por atributo
    @Inject
    @Named ("REGULAR")
    private DescuentoRegular descuentoRegular;


    // Inyeccion por constructor
    @Named ("VIP")
    private DescuentoVIP descuentoVIP;

    @Inject 
    public VentaService(){
        this.descuentoVIP = descuentoVIP;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }


    public void realizar(Double monto, String descuento){

        // id + tipo + monto + descuento + total
        
        if(descuento == "REGULAR"){
            System.out.println("Venta realizada....");
            System.out.println("Venta: " + ++conteo);
            System.out.println("Monto: " + monto);
            System.out.println("Descuento: " + descuentoRegular.getnombreDescuento());
            System.out.println("Total: " + descuentoRegular.calcular(monto));

        }else if(descuento == "VIP"){
            System.out.println("Venta realizada....");
            System.out.println("Venta: " + ++conteo);
            System.out.println("Monto: " + monto);
            System.out.println("Descuento: " + descuentoVIP.getnombreDescuento());
            System.out.println("Total: " + descuentoVIP.calcular(monto));

        }else{
            System.out.println("No escogiste un descuento");
        }
        
    }



    

}
