
package Clases;


import Interfaces.ICola;
import java.util.LinkedList;
import java.util.Queue;


public class Cola implements ICola {
    
    Queue< Object > cola;

    public Cola(){
        cola = new LinkedList<>();
    }

    @Override
    public boolean esVacia() {
        return cola.isEmpty();
    }

    @Override
    public boolean esLlena() {
        return false;
    }

    @Override
    public void insertar( Object n) {
        cola.add(n);
    }

    @Override
    public Object quitar() {
        return cola.poll();
    }

    @Override
    public Object mostrar() {
        String salida = "";
        for( Object item : cola){
            
            Producto atemp = ( Producto ) item;
            salida += atemp.mostrarDetalleProducto() + "\n";
        }
        return salida;
    }
}
