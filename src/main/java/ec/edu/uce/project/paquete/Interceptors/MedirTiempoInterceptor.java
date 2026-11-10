package ec.edu.uce.project.paquete.Interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo
@Interceptor
@Priority (Interceptor.Priority.APPLICATION + 4)
public class MedirTiempoInterceptor {

    @AroundInvoke
    public Object interceptar(InvocationContext context) throws Exception{
        Long init = System.currentTimeMillis();

        //Todo lo que está arriba, se ejecuta antes de ejecutar el método interceptado
        Object resultado = context.proceed();//Ejecuta el método interceptado
        Long end = System.currentTimeMillis();
        System.out.println("Tiempo de ejecución interceptor MedirTiempo " + (end - init) + " ms");

        
        return resultado;

    
    }
}
