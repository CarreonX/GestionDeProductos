
package Clases;


public class Usuario {
    
    private String nombreUsuario;
    private String password;
    
    public Usuario( String nombre, String pass ){
        
        setNombreUsuario( nombre );
        setPassword( pass );
    }
    
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreusuario) {
        this.nombreUsuario = nombreusuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
