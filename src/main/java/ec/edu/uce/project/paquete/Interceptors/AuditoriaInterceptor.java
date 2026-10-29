package ec.edu.uce.project.paquete.Interceptors;

import java.lang.reflect.Parameter;

import ec.edu.uce.project.paquete.AuditoriaService;
import ec.edu.uce.project.paquete.Pedido;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Auditoria 
@Interceptor
public class AuditoriaInterceptor {

    @Inject 
    private AuditoriaService auditoriaService;

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception{
        
        //Todo lo que está arriba, se ejecuta antes de ejecutar el método interceptado
        Object resultado = context.proceed();//Ejecuta el método interceptado
        System.out.println("Retorno:" + resultado);

        System.out.println("Mensaje luego de que se ejecuta el método interceptado");
        
        //Antes de que se ejecute el método
        String nombreMetodo = context.getMethod().getName();
        System.out.println("Auditoria: Se está ejecutando el metodo: " +  nombreMetodo);
        System.out.println("Ejecuto todo lo que quiero que haga el interceptor");
        
        Parameter[] parametros = context.getMethod().getParameters(); //Accede al método y parametros
        for(Parameter parametro: parametros){
            System.out.println("Parametro: " + parametro.getName());
        }

        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido)valores[0];

        String cliente = pedido.getCliente();
        double total = pedido.getTotal();
        String correo = pedido.getCorreo();

        this.auditoriaService.guardarEnLaBase(cliente, total, correo);
        
        return resultado;

    
    }
}
