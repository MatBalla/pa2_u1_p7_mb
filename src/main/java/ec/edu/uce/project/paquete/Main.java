package ec.edu.uce.project.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain //Se le indica a Quarkus que esta es la clase principal de la aplicacion
public class Main implements QuarkusApplication {//Se implementa la interfaz QuarkusApplication

    @Inject 
    private PedidoService pedidoService; //Inyeccion por atributo, se usa la anotacion @Inject para que el contenedor ArC se encargue de crear el objeto e inyectarlo en la clase Main
    @Inject
    private CompraService compraService;
    public static void main(String[] args) {
        Quarkus.run(Main.class, args);

    }

    //Todo se hace en este metodo run
    @Override 
    public int run(String... args){ //Se implementa el metodo run de la interfaz QuarkusApplication
        System.out.println("Iniciando aplicacion Quarkus");

        Pedido pedido = new Pedido("Juan", "laptop", 15000.0, "juan@gmail.com");
        pedido.setTelefono("0963629703");
        this.pedidoService.realizar(pedido); //creamos manualmente el objeto de la clase Producto
        
        Compra compra = new Compra("Maria", "celular", 800.0, "maria@gmail.com");
        compra.setTelefono("0963629704");
        this.compraService.realizar(compra);

        
        return 0;
    }
}
