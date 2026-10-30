package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.login.Login;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class MatriculaService {

    @Login 
    public String matricular(Persona persona, String val1){
        System.out.println("Realizando registro");
        System.out.println("Usuario: "+ persona.getUsuario());
        System.out.println("Correo: "+ persona.getCorreo());
        System.out.println("Contraseña: " + persona.getClave().hashCode());
        System.out.println("Placa del vehiculo: "+ persona.getPlacaCarro());
        return "Matriculación exitosa";
    }

}
