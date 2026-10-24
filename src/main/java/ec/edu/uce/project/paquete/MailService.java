package ec.edu.uce.project.paquete;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

//Ambitos y contextos


//@ApplicationScoped - //durante toda la aplicacion, es decir se crea una sola instancia de la clase y se comparte en todos los comoponentes de la aplicacion
//@Singleton // durante toda la aplicacion, es decir se crea una sola instancia de la clase y se comparte en todos los comoponentes de la aplicacion
//@RequestScooed // su ambito es durante toda la aplicacion web, es decir se crea en durante el request y se destruye al finalizar el request
//@SessionScoped //su ambito es durante toda la aplicacion web, es decir se crea en durante el request y se destruye al finalizar el request
@Dependent //su ambito es durante la inyeccion de dependencias, es decir se crea la instancia de la clase cada vez que se inyecta en otra clase
@Named ("correo") //Se le da un nombre a la clase para que pueda ser inyectada en otras clases
public class MailService implements Notificacion { //Se le delega la clase al contenedor ArC para que se encargue de su ciclo de vida y la inyeccion de dependencias
    private Integer cantidad = 0; 

    private String nombre;


    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviar correo a " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Correo enviado con exito");
        System.out.println("Fin del envio de correo");

    }

    public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
