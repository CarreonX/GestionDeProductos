
package Clases;


public class Administrador extends Usuario {
    
    private String nombre;
    private String apellidos;



    public Administrador( String nombreU, String pass, String nombre, String apellidos ) {
        
        super( nombreU, pass );
        this.nombre = nombre;
        this.apellidos = apellidos;

    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos( String apellidos ) {
        this.apellidos = apellidos;
    }
    
    @Override
    public String toString(){
        
        return String.format( "Usuario: %s\nNombre completo: %s %s", 
                super.getNombreUsuario(), getNombre(), getApellidos() );
    }
    
}
