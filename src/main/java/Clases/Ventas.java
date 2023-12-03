
package Clases;

import java.util.ArrayList;
import java.util.List;


public class Ventas {
    
    ArrayList < Venta > ventas = new ArrayList<>();
    
    public  void ordenarVentas( List< Venta > cantidades, int inicio, int fin) {
        
        if (inicio < fin) {
            
            int indiceParticion = particion(cantidades, inicio, fin);

            ordenarVentas(cantidades, inicio, indiceParticion - 1);
            ordenarVentas(cantidades, indiceParticion + 1, fin);
        }
    }

    public int particion( List< Venta > cantidades, int inicio, int fin) {
        
        float pivote = cantidades.get(fin).getVentaTotal();
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if (cantidades.get( j ).getVentaTotal() >= pivote) {
                i++;
                intercambiar(cantidades, i, j);
            }
        }

        intercambiar(cantidades, i + 1, fin);

        return i + 1;
    }

    public void intercambiar(List< Venta > cantidades, int indice1, int indice2) {
        
        float temp = cantidades.get(indice1 ).getVentaTotal();
        cantidades[indice1] = cantidades[indice2];
        
        cantidades.get(indice2).set( indice2 );
        cantidades[indice2] = temp;
    }
    
    public static List<Float> obtenerVentasMayoresA5000( List< Venta > cantidades, int inicio, int fin) {
        
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
