package ec.edu.uce;

import ec.edu.uce.pa.AgenciaService;
import ec.edu.uce.pa.MatriculaService;
import ec.edu.uce.pa.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Vehiculo("Toyota", "Corolla", 20000, "Blanco");
        
        AgenciaService agenciaService = new AgenciaService();
        agenciaService.registrarVenta(carro);
        System.out.println("-----------------------------------");
        
        MatriculaService matriculaService = new MatriculaService();
        matriculaService.emitirMatricula(carro.getMarca(), carro.getModelo(), carro.getColor(), "AGE-UIO-01");

    }
    
}
