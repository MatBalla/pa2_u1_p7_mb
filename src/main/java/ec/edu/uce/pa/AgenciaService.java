package ec.edu.uce.pa;

public class AgenciaService {
    
    public void registrarVenta(Vehiculo vehiculo) {
        System.out.println("Registrando nueva venta");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Precio a pagar: $" + vehiculo.getPrecio());

        MatriculaService matriculaService = new MatriculaService();
        String codigoAgencia = "AGE-UIO-01";
        
        matriculaService.emitirMatricula(vehiculo.getMarca(), vehiculo.getModelo(), vehiculo.getColor(), codigoAgencia);

        matriculaService = null;
    }
}