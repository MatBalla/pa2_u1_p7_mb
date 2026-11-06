package ec.edu.uce.pa.paquete.interceptores;

import ec.edu.uce.pa.paquete.MatriculaService;
import jakarta.annotation.Priority;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;


@MedidorTiempo 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + 1)
public class MedidorTiempoInterceptor {

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{

        Long init = System.currentTimeMillis();
        Object resultado = context.proceed();

        Long end = System.currentTimeMillis();
        System.err.println("Medidor Tiempo Interceptor");
        System.out.println("El tiempo que se ejecutó el método es de: "+ (end - init));

        return resultado;
    }
}
