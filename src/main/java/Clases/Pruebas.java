
package Clases;

import java.util.ArrayList;
import java.util.List;



public class Pruebas {
    
    public static void main( String[] args ){
        
        Producto p1 = new Producto( "1413", 50, 2000.00f, 800.00f, "doble", "Seally" );
        Producto p2 = new Producto( "7496", 50, 5000.00f, 2500.00f, "queen size", "Spring air" );
        Producto p3 = new Producto( "9076", 50, 9000.00f, 5000.00f, "presidential king size", "Mamalon" );
        Almacen a = new Almacen();
        a.agregarUnProducto( p1 );
        a.agregarUnProducto( p2 );
        a.agregarUnProducto( p3 );
        Cliente c1 = new Cliente( "Pedro", "Perez", "calle norte");
        Cliente c2 = new Cliente( "Teodoro", "robles", "calle sur" );
        Venta v1 = new Venta( c1 );
        Venta v2 = new Venta( c2 );
        v1.getNumeroProductos( 2, 4, 1 );
        v1.setPrecios( 2000.00f, 5000.00f, 9000.00f );
        Ventas vs = new Ventas();
        v2.getNumeroProductos( 2, 10 );
        v2.setPrecios( 5000.00f, 9000.00f );
        vs.agregarUnaVenta( v1 );
        vs.agregarUnaVenta( v2 );
        System.out.println( a.verAlmacen() );
        List< Venta > ventas = vs.getVentas();
        System.out.println( "lista sin ordenar");
        vs.ordenarVentas( ventas, 0, ventas.size() - 1 );
        System.out.println( "lista ordenada");
        for( Venta venta : ventas ){
            
            System.out.println( venta );
        }
    }
}
