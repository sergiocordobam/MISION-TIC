
package reto4;


public class Cliente {
    //Atributos
    private String nombreCompleto;
    private String documentoIdentidad;
    private int totalApagar;
    private String fechaCompra;
    private String numeroFactura;
    
    //Constructor
    public Cliente(String nombreCompleto, String documentoIdentidad, int totalApagar, String fechaCompra, String numeroFactura) {
        this.nombreCompleto = nombreCompleto;
        this.documentoIdentidad = documentoIdentidad;
        this.totalApagar = totalApagar;
        this.fechaCompra = fechaCompra;
        this.numeroFactura = numeroFactura;
    }

   
    
    //Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public int getTotalApagar() {
        return totalApagar;
    }

    public void setTotalApagar(int totalApagar) {
        this.totalApagar = totalApagar;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    
    
}
