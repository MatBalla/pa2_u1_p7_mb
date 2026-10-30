package ec.edu.uce.pa.paquete;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton 
public class LoginService {
    public void guardarEnLaBase(String usuario, String clave, String correo){
        System.out.println("Registrado el usuario en la base de datos: " + usuario);
        System.out.println("Registrado el usuario en la base de datos: " + correo);
        System.out.println("La contraseña del usuario es: " + clave.hashCode());
        System.out.println("Con fecha y hora: " + LocalDateTime.now());
    }
}
