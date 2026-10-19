package ec.edu.uce.pa;

public class MatriculaService {
    
    public void emitirMatricula(String marca, String modelo, String color, String codigoAgencia) {
        System.out.println("Matriculaión Agencia Nacional de Tránsito - AMT");
        System.out.println("Validando datos del vehículo: " + marca + " " + modelo + " (" + color + ")");
        System.out.println("Agencia responsable: " + codigoAgencia);
        System.out.println("Matriculación exitosa");
    }
}