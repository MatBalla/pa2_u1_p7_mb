import com.edu.ec.negocio.Pedido;
import com.edu.ec.negocio.PedidoService;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Pedido pedido = new Pedido("Juan", "laptop", 15000.0, "juan@gmail.com");
        PedidoService pedidoService = new PedidoService();
        //pedido = null; //hace que el objeto se aelegible por el garbage collector
        pedidoService.realizar(pedido); //creamos manualmente el objeto de la clase Producto
        //el objeto vive en la memoria heap
        //pedidoService = null; //el objeto sea elegible por el Garbage collector

        //CONTENEDOR DE OBJETOS (componente): delegar a un componente especializado, gestiona el cliclo d vida del objeto


        System.out.println("Fin del programa");


    }
}
