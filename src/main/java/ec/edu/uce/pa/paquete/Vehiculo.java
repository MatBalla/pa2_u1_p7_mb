package ec.edu.uce.pa.paquete;


public class Vehiculo {
    private String marca;
    private String modelo;
    private int precio;
    private String color;

    public Vehiculo(String marca, String modelo, int precio, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

}
