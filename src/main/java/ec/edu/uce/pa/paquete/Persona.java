package ec.edu.uce.pa.paquete;

public class Persona {
    private String usuario;
    private String clave;
    private String correo;
    private String placaCarro;


    public Persona(String usuario, String clave, String correo, String placaCarro) {
        this.usuario = usuario;
        this.clave = clave;
        this.correo = correo;
        this.placaCarro = placaCarro;
    }

    
    public String getUsuario() {
        return usuario;
    }


    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public String getClave() {
        return clave;
    }


    public void setClave(String clave) {
        this.clave = clave;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }


    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    

}
