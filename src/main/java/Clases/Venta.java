
package Clases;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Venta {
    
    Calendar fechaHora = Calendar.getInstance();
    private float ventaTotal;
    private Cliente comprador;
    private String horaFecha;
    private float[] precios;
    private int[] numeroArticulos;
    private String[] categorias;
    
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
    
    public void setPrecios( float ... aPrecios ){
        
        precios = aPrecios;
    }
    
    public void setCategorias( String ... aCategorias ){
        
        categorias = aCategorias;
    }
    
    public void setNumeroProductos( int ... numeroProductos ){
        
        numeroArticulos = numeroProductos;
    }
    
    public void setVentaTotal( float venta ){
        
        venta = ventaTotal;
    }
    
    public float getVentaTotal(){
        
        float cuenta = 0f;
        for( int i = 0; i < precios.length; i++ ){
            
            cuenta += precios[ i ] * numeroArticulos[ i ];
        }
        
        comprador.setComprasRealizadas( comprador.getComprasRealizadas() + 1 );
        ventaTotal = cuenta;
        Almacen.venderUnProducto( numeroArticulos, categorias );
        return ventaTotal;
    }
    
    
    
    public String toString(){
        
        return String.format("%15s %s $%,10.2f", comprador.getNombre(), getHoraFecha(), ventaTotal );
    }
    
}
