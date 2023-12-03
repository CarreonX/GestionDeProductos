
package Clases;


public class Almacen {
    
    private int[] productos;
    private boolean esVacio;
    private boolean esLleno;
    private int limiteDeExistencias;
    private int contadorDeExistencias;

    public Almacen() {
        
        limiteDeExistencias = 1000;
        contadorDeExistencias = 0;
        productos = new int[ 5 ];
        
        //Subindice 0 = categoria individual
        //Subindice 1 = categoria doble
        //Subindice 2 = categoria queen size
        //Subindice 3 = categoria king size
        //Subindice 4 = categoria presidential king size
    }
    
    
    public boolean esVacio() {
        
        int contador = 0;
        for( int cantidad : productos ){
            
            if( cantidad == 0 ){
                contador++;
            }
        }
        if( contador >= 5 ){
            
            return true;
        }
        else{
            return false;
        }
    }

    public boolean esLleno() {
        
        int contador = 0;
        for( int cantidad : productos ){
            
            contador += cantidad;
        }
        if( contador >= 5 ){
            
            return true;
        }
        else{
            return false;
        }
    }
    
    public void agregarUnProducto( Producto producto ){
        
        if(  ( contadorDeExistencias + producto.getCantidadDePiezas() ) <= limiteDeExistencias ){
            
            switch( producto.getCategoria() ){
                
                case "individual":
                    productos[ 0 ] += producto.getCantidadDePiezas();
                    
                break;
                
                case "doble":
                    productos[ 1 ] += producto.getCantidadDePiezas();
                    
                break;
                
                case "queen size":
                    productos[ 2 ] += producto.getCantidadDePiezas();
                    
                break;
                
                case "king size":
                    productos[ 3 ] += producto.getCantidadDePiezas();
                    
                break;
                
                case "presidential king size":
                    productos[ 4 ] += producto.getCantidadDePiezas();
                    
                break;
            }
        }
    }
    
    public void venderUnProducto( int cantidad, String categoria ){
        
        switch( categoria ){
                
                case "individual":
                    productos[ 0 ] -= cantidad;
                    
                break;
                
                case "doble":
                    productos[ 1 ] -= cantidad;
                    
                break;
                
                case "queen size":
                    productos[ 2 ] -= cantidad;
                    
                break;
                
                case "king size":
                    productos[ 3 ] -= cantidad;
                    
                break;
                
                case "presidential king size":
                    productos[ 4 ] -= cantidad;
                    
                break;
        }
        contadorDeExistencias -= cantidad;
    }
}
