package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class AgenciaService {

    private final MatriculaService matriculaService;

    public AgenciaService() {
        this(new MatriculaService());
    }

    @Inject
    public AgenciaService(MatriculaService matriculaService) {
        this.matriculaService = matriculaService != null ? matriculaService : new MatriculaService();
    }

    public void registrarVenta(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }

        System.out.println("Registrando nueva venta");
        System.out.println("Marca: " + vehiculo.getMarca());
        System.out.println("Modelo: " + vehiculo.getModelo());
        System.out.println("Color: " + vehiculo.getColor());
        System.out.println("Precio a pagar: $" + vehiculo.getPrecio());

        String asunto = "Confirmación de compra de vehículo";
        String mensaje = "El vehículo de marca: " + vehiculo.getMarca()
                + ", modelo: " + vehiculo.getModelo()
                + ", color: " + vehiculo.getColor()
                + " se ha registrado con éxito";

        this.matriculaService.emitirMatricula(vehiculo.getMarca(), asunto, mensaje);
    }
}
