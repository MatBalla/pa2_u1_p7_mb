package ec.edu.uce.pa.paquete.login;

import java.lang.reflect.Parameter;
import ec.edu.uce.pa.paquete.LoginService;
import ec.edu.uce.pa.paquete.Persona;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Login 
@Interceptor 
public class LoginInterceptor {

    @Inject 
    private LoginService loginService;

    @AroundInvoke 
    public Object logear(InvocationContext context) throws Exception{
        Object resultado = context.proceed();
        System.out.println("Retorno: " + resultado);

        //Antes de que se ejecute
        String nombreMetodo = context.getMethod().getName();
        System.out.println("En el login, se está ejecutando el método: " + nombreMetodo);

        Parameter[] parametros = context.getMethod().getParameters();
        for(Parameter parametro: parametros){
            System.out.println("Parametro: "+ parametro.getName());
        }

        Object[] valores = context.getParameters();
       Persona persona = (Persona)valores[0];

       String usuario = persona.getUsuario();
       String clave = persona.getClave();
       String correo = persona.getCorreo();

        this.loginService.guardarEnLaBase(usuario, clave, correo);
        return resultado;


    }

}
