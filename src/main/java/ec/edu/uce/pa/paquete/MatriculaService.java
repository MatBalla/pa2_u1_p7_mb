package ec.edu.uce.pa.paquete;

import jakarta.inject.Singleton;

@Singleton 
public class MatriculaService {

    public void emitirMatricula(String marca, String mensaje, String confirmacion) {
        System.out.println("Matriculación Agencia Nacional de Tránsito - AMT");
        System.out.println("Validando datos del vehículo: " + marca);
        System.out.println(mensaje);
        System.out.println("Datos Vehículo: " + confirmacion);
    }
}
