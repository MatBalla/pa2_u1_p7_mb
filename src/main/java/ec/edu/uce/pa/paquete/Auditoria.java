package ec.edu.uce.pa.paquete;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Timer;
import java.util.UUID;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Inject;

@Dependent
public class Auditoria {
    //Identificar instancia de una clase
    private final UUID id = UUID.randomUUID();

    @Inject 
    private VentaService ventaService;

    public void prueba(int venta){
        Date fecha = new Date();
        LocalDateTime lc = LocalDateTime.now();
    
        System.out.println("Auditoria de la venta: " + venta);

        //Fecha, hora y tiempo de ejecucion
        System.out.println(lc.toString());

        //UUID
        System.out.println("Instancia: " + id);
        
    }
}
