package ec.edu.uce.pa.paquete;
//Desarollado por: Mateo Balladares
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject 
    public AgenciaService agenciaService;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);

    }
    @Override 
    public int run(String... args){
        System.out.println("Iniciando aplicacion Quarkus");
        System.out.println("Hello, World!");

        Vehiculo carro = new Vehiculo("Mitsubishi", "Lancer Evolucion XI", 30000, "Blanco");

        this.agenciaService.registrarVenta(carro);

        return 0;
    }
}
