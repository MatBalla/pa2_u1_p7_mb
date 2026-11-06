package ec.edu.uce.pa.paquete;

import ec.edu.uce.pa.paquete.interceptores.MedidorTiempo;
import ec.edu.uce.pa.paquete.login.Login;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped 
public class MatriculaService {

    @MedidorTiempo 
    @Login
    public String matricular(Persona persona, String val1){
       try {
            Thread.sleep(1500); //es parte de la logica de negocio
        } catch (InterruptedException e) {
            e.printStackTrace();
        } 

        System.out.println("Realizando registro");
        System.out.println("Usuario: "+ persona.getUsuario());
        System.out.println("Correo: "+ persona.getCorreo());
        System.out.println("Contraseña: " + persona.getClave().hashCode());
        System.out.println("Placa del vehiculo: "+ persona.getPlacaCarro());
        return "Matriculación exitosa";
    }

}
