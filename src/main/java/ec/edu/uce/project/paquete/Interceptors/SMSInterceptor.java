package ec.edu.uce.project.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@SMS
@Priority (Interceptor.Priority.APPLICATION + 2)
public class SMSInterceptor {
    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception{
        Long init = System.currentTimeMillis();

        //Todo lo que está arriba, se ejecuta antes de ejecutar el método interceptado
        Object resultado = context.proceed();//Ejecuta el método interceptado
        Long end = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución interceptor SMS: " + (end - init) + " ms");

        
        return resultado;

    
    }
}
