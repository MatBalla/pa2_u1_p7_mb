package ec.edu.uce.pa.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped 
@Named ("REGULAR")
public class DescuentoRegular implements CalculadoraDescuento{
    private Double monto;
    private String nombreDescuento = "Descuento regular";

    @Override
    public double calcular(double monto) {
        return monto -(monto*0.05);
    }

    @Override
    public void setMonto(Double monto) {
        this.monto = monto;
    }

    @Override
    public Double getMonto() {
        return monto;
    }

    @Override
    public void setnombreDescuento(String nombreDescuento) {
        this.nombreDescuento = nombreDescuento;
    }

    @Override
    public String getnombreDescuento() {
        return nombreDescuento;
    }

    


}
