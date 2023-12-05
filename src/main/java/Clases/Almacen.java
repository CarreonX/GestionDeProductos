
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Almacen {
    
    private static int[] productos = { 0, 0, 0, 0, 0 };
    private static boolean esVacio;
    private static boolean esLleno;
    private static int limiteDeExistencias = 1000;
    private static int contadorDeExistencias = 0;
    public static List < Producto > productos2;
    public static Lista listaProductos;
    
    public static boolean esVacio() {
        
        int contador = 0;
        for (int cantidad : productos) {
            if (cantidad == 0) {
                contador++;
            }
        }
        return contador >= 5;
    }
    
    public static void crearProductos(){
        
        productos2 = new ArrayList<>();
        productos2.add( new Producto( "1413", 50, 2000.00f, 800.00f, "doble", "Seally" ) );
        productos2.add( new Producto( "5012", 50, 3000.00f, 900.00f, "individual", "Rustico" ) );
        productos2.add( new Producto( "7496", 50, 5000.00f, 2500.00f, "queen size", "Spring air" ) );
        productos2.add( new Producto( "9076", 50, 9000.00f, 5000.00f, "presidential king size", "Mamalon" ) );
        productos2.add( new Producto( "8763", 50, 7000.00f, 4000.00f, "king size", "Spring air" ) );
        
        for( int i = 0; i < productos2.size(); i++ ){
            
            agregarUnProducto( productos2.get( i ) );
        }
    }
    
    public static void inicializarLista() {
        listaProductos = new Lista();
        listaProductos.insertarFin(new Nodo(new Producto("1413", 50, 2000.00f, 800.00f, "doble", "Seally")));
        listaProductos.insertarFin(new Nodo(new Producto("5012", 50, 3000.00f, 900.00f, "individual", "Rustico")));
        listaProductos.insertarFin(new Nodo(new Producto("7496", 50, 5000.00f, 2500.00f, "queen size", "Spring air")));
        listaProductos.insertarFin(new Nodo(new Producto("9076", 50, 9000.00f, 5000.00f, "presidential king size", "Mamalon")));
        listaProductos.insertarFin(new Nodo(new Producto("8763", 50, 7000.00f, 4000.00f, "king size", "Spring air")));
    }

    public static Lista obtenerListaProductos() {
        return listaProductos;
    }

    public static void agregarUnProductoALista(Producto producto) {
        listaProductos.insertarFin(new Nodo(producto));
    }
    
    public static List < Producto > obtenerProductos(){
        
        return productos2;
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
            agregarUnProductoALista( producto );
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
