
package Clases;

import Interfaces.ILista;
import java.util.ArrayList;
import java.util.List;


public class Lista implements ILista{
    
    Nodo inicio, fin;

    public Lista() {
        inicio = fin = null;
    }
    
    @Override
    public boolean esVacia() {
        return inicio == null;
    }
    
    @Override
    public void insertarInicio(Nodo n) {
        if (esVacia()) {
            inicio = fin = n;
        } else {
            n.siguiente = inicio;
            inicio = n;
        }
    }
    
    @Override
    public void insertarFin(Nodo n) {
        if (esVacia()) {
            inicio = fin = n;
        } else {
            fin.siguiente = n;
            fin = n;
        }
    }
    
    @Override
    public Object mostrar() {
        //String salida = "";
        List < Object > listaTemp = new ArrayList<>();
        Nodo aux = inicio;
        while (aux != null) {
            //salida += aux.dato + "\n";
            listaTemp.add( aux.dato );
            aux = aux.siguiente;
        }
        return listaTemp;
    }
    
    @Override
    public Nodo quitarInicio() {
        if (esVacia() == true) {
            return null;
        } else {
            Nodo aux = inicio;
            if (inicio == fin) {
                inicio = fin = null;
            } else {
                inicio = inicio.siguiente;
                aux.siguiente = null;
            }
            return aux;
        }
    }
    
    @Override
    public Nodo quitarFin() {
        if(esVacia() == true){
            return null;
        }
        else{
            Nodo aux = inicio;
            if(inicio == fin){
                inicio = fin = null;
            }else{
                while(aux.siguiente != fin){
                    aux = aux.siguiente;
                }
                fin = aux;
                aux = fin.siguiente;
                fin.siguiente = null;
            }
            return aux;
        }
    }

    @Override
    public int contarLista() {
       
        int cont = 0;
        Nodo aux = inicio;
        
        while( aux != null ){
            
            cont++;
            aux = aux.siguiente;
        }
        return cont;
    }
}
