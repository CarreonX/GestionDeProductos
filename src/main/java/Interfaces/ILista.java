
package Interfaces;

import Clases.Nodo;

public interface ILista {
    
    boolean esVacia();
    void insertarInicio( Nodo n );
    void insertarFin( Nodo n );
    Nodo quitarInicio();
    Nodo quitarFin();
    int contarLista();
    Object mostrar();
}
