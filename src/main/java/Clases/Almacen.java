
package Clases;


public class Almacen {
    
    private static int[] productos;
    private static boolean esVacio;
    private static boolean esLleno;
    private static int limiteDeExistencias;
    private static int contadorDeExistencias;

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
    
    
    public static boolean esVacio() {
        
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

    public static boolean esLleno() {
        
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
    
    public static void agregarUnProducto( Producto producto ){
        
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
    
    public static void venderUnProducto( int cantidad, String categoria ){
        
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
    
    public static String verAlmacen(){
        
        return String.format("Cantidades en almacen\nIndividual: %d\nDoble: %d\nQueen Size: %d\nKing Size: %d\nPresidential king size: %d\n",
                productos[ 0 ], productos[ 1 ], productos[ 2 ], productos[ 3 ], productos[ 4 ] );
    }
}
