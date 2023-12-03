
package Clases;


public class Producto {
    
    private String codigo;
    private int cantidadDePiezas;
    private float precio;
    private float costo;
    private String categoria;
    private String marca;

    public Producto(String codigo, int cantidadDePiezas, float precio, float costo, String categoria, String marca ) {
        
        setCodigo( codigo );
        setCantidadDePiezas( cantidadDePiezas );
        setPrecio( precio );
        setCosto( costo );
        setCategoria( categoria );
        setMarca( marca );
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCantidadDePiezas() {
        return cantidadDePiezas;
    }

    public void setCantidadDePiezas(int cantidadDePiezas) {
        this.cantidadDePiezas = cantidadDePiezas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String mostrarDetalleProducto(){
        
        return String.format( "Colchon: %s, %s", getMarca(), getCategoria() );
    }
    
    public String toString(){
            
        return String.format( "Codigo de barras: %s\nPiezas disponibles: %d\nPrecio por unidad: %.2f\nCosto por unidad: %.2f\nCategoria: %s\n",
            getPrecio(), getCantidadDePiezas(), getPrecio(), getCosto(), getCategoria() );
    }
}
