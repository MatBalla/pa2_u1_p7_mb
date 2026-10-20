package ec.edu.uce.project.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {
    @Inject 
    private PedidoService pedidoService;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);

    }
    @Override 
    public int run(String... args){
        System.out.println("Iniciando aplicacion Quarkus");
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Juan", "laptop", 15000.0, "juan@gmail.com");
        
        this.pedidoService.realizar(pedido); //creamos manualmente el objeto de la clase Producto
        
        return 0;
    }
}
