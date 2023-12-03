
package Clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Ventas {
    
    ArrayList < Venta > ventas;
    
    public Ventas(){
        
        ventas = new ArrayList<>();
    }
    
    public void agregarUnaVenta( Venta venta ){
        
        ventas.add( venta );
    }
    
    public List< Venta > getVentas(){
        
        return ventas;
    }
    
    public void ordenarVentas( List<Venta> ventas, int inicio, int fin ) {
        
        if (inicio < fin) {
            
            int indiceParticion = particion( ventas, inicio, fin );

            ordenarVentas( ventas, inicio, indiceParticion - 1 );
            ordenarVentas( ventas, indiceParticion + 1, fin );
        }
    }

    public int particion( List<Venta> ventas, int inicio, int fin ) {
        
        float pivote = ventas.get(fin).getVentaTotal();
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (ventas.get(j).getVentaTotal() >= pivote) {
                i++;
                intercambiar(ventas, i, j);
            }
        }

        intercambiar( ventas, i + 1, fin );

        return i + 1;
    }

    public void intercambiar( List<Venta> ventas, int indice1, int indice2 ) {
        
        Collections.swap(ventas, indice1, indice2);
    }

    public String imprimirVentas() {
        
        String salida = "";
        for ( Venta venta : ventas ) {
            
            salida = String.format("%s%s\n", salida, venta.toString() );
        }
        return salida;
    }
    
    public List<Float> obtenerVentasMayoresA5000( List< Venta > cantidades, int inicio, int fin) {
        
        List<Float> resultado = new ArrayList<>();

        if (inicio <= fin) {
            
            float cantidadActual = cantidades.get( inicio ).getVentaTotal();
            
            if (cantidadActual > 5000.00f) {
                resultado.add(cantidadActual);
            }

            List<Float> subLista = obtenerVentasMayoresA5000(cantidades, inicio + 1, fin);
            resultado.addAll(subLista);
        }

        return resultado;
    }
}
