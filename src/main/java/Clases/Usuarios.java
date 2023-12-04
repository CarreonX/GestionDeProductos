
package Clases;

import java.util.ArrayList;
import java.util.List;

public class Usuarios {
    
    public static List< Usuario > usuarios;
    public static Usuario usuarioActual;
    
    public static void crearUsuarios(){
        
        usuarios = new ArrayList<>();
        usuarios.add( new Cliente( "beto", "123", "Alberto", "Carreon", "Calle norte" ) );
        usuarios.add( new Cliente( "adri", "123", "Adriana", "Perez", "Calle sur" ) );
        usuarios.add( new Cliente( "pedrito", "234", "Pedro", "Perez", "calle norte") );
        usuarios.add( new Administrador( "Teo", "123", "Teodoro", "Robles" ) );
        usuarios.add( new Administrador( "pablito", "123", "Pablo", "Mendez" ) );
        
    }
}
