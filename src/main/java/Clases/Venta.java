
package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Venta {
    
    Calendar fechaHora = Calendar.getInstance();
    private float ventaTotal;
    private Cliente comprador;
    private String horaFecha;
    
    public Venta( Cliente cliente ){
        
        setComprador( cliente );
        setHoraFecha();
    }
    
    public void setHoraFecha(){
        
        horaFecha = String.format( "%tr, %1$TA, %1$TB %1$Td, %1$TY", fechaHora, fechaHora );
    }
    
    public String getHoraFecha(){
        return horaFecha;
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
        
        float [] precios = setPrecios();
        int [] numeroProductos = getNumeroProductos();
        float cuenta = 0f;
        for( int i = 0; i < setPrecios().length; i++ ){
            
            cuenta += precios[ i ] * numeroProductos[ i ];
        }
        
        comprador.setComprasRealizadas( comprador.getComprasRealizadas() + 1 );
        ventaTotal = cuenta;
        return cuenta;
    }
    
    
    
    public String toString(){
        
        return String.format("%s %s $%.2f", comprador.getNombre(), getHoraFecha(), ventaTotal );
    }
    
}
