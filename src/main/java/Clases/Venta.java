
package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Venta {
    
    Calendar fechaHora = Calendar.getInstance();
    private int cantidadProductos;
    private float ventaTotal;
    private Cliente comprador;
    private String horaFecha;
    
    public Venta( int cantidad, Cliente cliente ){
        
        setCantidadProductos( cantidad );
        setComprador( cliente );
        setHoraFecha();
    }
    
    public void setHoraFecha(){
        
        horaFecha = String.format( "%tr, %1$TA, %1$TB %1$Td, %1$TY\n", fechaHora, fechaHora );
    }
    
    public String getHoraFecha(){
        return horaFecha;
    }
    
    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }
    
    public float[] setPrecios( float ... precios ){
        
        return precios;
    }
    
    public int[] getNumeroProductos( int ... numeroProductos ){
        
        return numeroProductos;
    }
    
    public float getVentaTotal(){
        
        float cuenta = 0f;
        for( int i = 0; i < setPrecios().length; i++ ){
            
            cuenta += setPrecios()[ i ] * getNumeroProductos()[ i ];
        }
        
        comprador.setComprasRealizadas( comprador.getComprasRealizadas() + 1 );
        return cuenta;
    }
    
    
    
    public String toString(){
        
        return String.format("%s %s %.2f", comprador.getNombre(), getHoraFecha(), getVentaTotal() );
    }
    
}
