
package Clases;

import java.util.ArrayList;
import java.util.List;



public class Pruebas {
    
    public static void main( String[] args ){
        
        Producto p1 = new Producto( "1413", 50, 2000.00f, 800.00f, "doble", "Seally" );
        Producto p0 = new Producto( "5012", 50, 3000.00f, 900.00f, "individual", "Rustico" );
        Producto p2 = new Producto( "7496", 50, 5000.00f, 2500.00f, "queen size", "Spring air" );
        Producto p3 = new Producto( "9076", 50, 9000.00f, 5000.00f, "presidential king size", "Mamalon" );
        Producto p4 = new Producto( "8763", 50, 7000.00f, 4000.00f, "king size", "Spring air" );
        Almacen.agregarUnProducto( p1 );
        Almacen.agregarUnProducto( p2 );
        Almacen.agregarUnProducto( p3 );
        Almacen.agregarUnProducto(p4 );
        Almacen.agregarUnProducto(p0 );
        Cliente c1 = new Cliente( "Pedro", "Perez", "calle norte");
        Cliente c2 = new Cliente( "Teodoro", "robles", "calle sur" );
        Cliente c3 = new Cliente( "Pablo", "Mendez", "Calsada juarez" );
        Venta v1 = new Venta( c1 );
        Venta v2 = new Venta( c2 );
        Venta v3 = new Venta( c3 );
        v1.setNumeroProductos( 2, 4, 1 );
        v1.setPrecios( 2000.00f, 5000.00f, 9000.00f );
        v1.setCategorias( "doble", "queen size", "king size" );
        Ventas vs = new Ventas();
        v2.setNumeroProductos( 2, 10 );
        v2.setPrecios( 5000.00f, 9000.00f );
        v2.setCategorias( "individual", "doble" );
        v3.setNumeroProductos( 20, 15, 25 );
        v3.setPrecios( 4000, 6000, 5000 );
        v3.setCategorias( "king size", "presidential king size", "queen size" );
        vs.agregarUnaVenta( v1 );
        vs.agregarUnaVenta( v2 );
        vs.agregarUnaVenta(v3 );
        System.out.println( Almacen.verAlmacen() );
        System.out.println( "lista sin ordenar");
        for( Venta venta : vs.getVentas() ){
            
            System.out.println( venta );
        }
        vs.ordenarVentas( vs.getVentas(), 0, vs.getVentas().size() - 1 );
        System.out.println( "lista ordenada");
        for( Venta venta : vs.getVentas() ){
            
            System.out.println( venta );
        }
        System.out.println( Almacen.verAlmacen() );
        System.out.println( vs.imprimirVentas() );
    }
}
