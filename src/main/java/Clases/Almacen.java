
package Clases;


public class Almacen {
    
    private static int[] productos = { 0, 0, 0, 0, 0 };
    private static boolean esVacio;
    private static boolean esLleno;
    private static int limiteDeExistencias = 1000;
    private static int contadorDeExistencias = 0;
    
    public static boolean esVacio() {
        
        int contador = 0;
        for (int cantidad : productos) {
            if (cantidad == 0) {
                contador++;
            }
        }
        return contador >= 5;
    }

    public static boolean esLleno() {
        
        int contador = 0;
        for (int cantidad : productos) {
            contador += cantidad;
        }
        return contador >= 5;
    }

    public static void agregarUnProducto(Producto producto) {
        
        if ((contadorDeExistencias + producto.getCantidadDePiezas()) <= limiteDeExistencias) {
            
            actualizarCantidadProducto(producto.getCategoria(), producto.getCantidadDePiezas());
        }
    }

    public static void venderUnProducto(int [] cantidad, String [] categoria) {
        
        for( int c = 0; c < cantidad.length; c++ ){
            
            actualizarCantidadProducto(categoria[ c ], -cantidad[ c ]);
            contadorDeExistencias -= cantidad[ c ];
        }
    }

    private static void actualizarCantidadProducto(String categoria, int cantidad) {
        
        switch (categoria.toLowerCase()) {
            
            case "individual":
                productos[0] += cantidad;
                break;
                
            case "doble":
                productos[1] += cantidad;
                break;
                
            case "queen size":
                productos[2] += cantidad;
                break;
                
            case "king size":
                productos[3] += cantidad;
                break;
                
            case "presidential king size":
                productos[4] += cantidad;
                break;
        }
    }
    
    public static String verAlmacen(){
        
        return String.format("Cantidades en almacen\nAlmacen es vacio?: %s\nIndividual: %d\nDoble: %d\nQueen Size: %d\nKing Size: %d\nPresidential king size: %d\n",
                esVacio() != false ? "No" : "Si", productos[ 0 ], productos[ 1 ], productos[ 2 ], productos[ 3 ], productos[ 4 ] );
    }
}
