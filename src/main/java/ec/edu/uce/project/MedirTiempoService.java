package ec.edu.uce.project;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton 
public class MedirTiempoService {
    public void guardarEnLaBase(String cliente, double total, String correo){
        System.out.println("Guardando en la base de datos: " + cliente + ", Total: "+ total + ", Correo: "+ correo);
        System.out.println("Con fecha y hora: " + LocalDateTime.now()); //Hora y fecha actual
    }
}
