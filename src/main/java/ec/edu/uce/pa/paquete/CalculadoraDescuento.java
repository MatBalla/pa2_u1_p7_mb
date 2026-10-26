package ec.edu.uce.pa.paquete;

public interface CalculadoraDescuento {
    public double calcular(double monto);
    
    public void setMonto(Double monto);
    public Double getMonto();

    public void setnombreDescuento(String nombreDescuento);
    public String getnombreDescuento();
}
