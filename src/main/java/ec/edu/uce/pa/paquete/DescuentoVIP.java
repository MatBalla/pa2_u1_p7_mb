package ec.edu.uce.pa.paquete;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;


@ApplicationScoped
@Named ("VIP")
public class DescuentoVIP implements CalculadoraDescuento{
    private Double monto;
    private String nombreDescuento = "Descuento VIP";

    @Override
    public double calcular(double monto) {
        return monto - (monto*0.15);
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
