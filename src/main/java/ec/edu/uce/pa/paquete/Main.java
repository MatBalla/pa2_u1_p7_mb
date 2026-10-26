package ec.edu.uce.pa.paquete;

import java.util.Date;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication {
    @Inject 
    private VentaService ventaService;

    @Inject 
    private Auditoria auditoria;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }


    @Override
    public int run(String... args){
        
        //Ejecutar cuatro ventas predefinidas desde Main
        ventaService.realizar(1000.0, "REGULAR");
        auditoria.prueba(ventaService.getConteo());
        System.out.println("-----------------------------------");
        ventaService.realizar(800.0, "VIP");
        auditoria.prueba(ventaService.getConteo());
        System.out.println("-----------------------------------");
        ventaService.realizar(100.0, "REGULAR");
        auditoria.prueba(ventaService.getConteo());
        System.out.println("-----------------------------------");
        ventaService.realizar(6000.0, "VIP");
        auditoria.prueba(ventaService.getConteo());
        
        return 0;
        
    }

}
