
package Clases;


public class Cliente extends Usuario {
    
    private String nombre;
    private String apellidos;
    private String direccion;
    private int comprasRealizadas;

    public Cliente( String nombreU, String pass, String nombre, String apellidos, String direccion ) {
        
        super( nombreU, pass );
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        comprasRealizadas = 0;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getComprasRealizadas() {
        return comprasRealizadas;
    }

    public void setComprasRealizadas(int comprasRealizadas) {
        this.comprasRealizadas = comprasRealizadas;
    }
    
    
}
