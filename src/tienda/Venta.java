/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;
import java.util.*;
/**
 *
 * @author rodri
 */
public class Venta {
    private int Formadepago;
    private ArrayList<Producto> productosvendidos;
    private vendedor Vendedor;
    private String Fecha;
    private ArrayList<Integer> cantidad;
    private String cliente;
    private boolean codigopromocion;

    public Venta(int Formadepago, vendedor Vendedor, String Fecha, String cliente, boolean codigopromocion) {
        this.Formadepago = Formadepago;
        this.Vendedor = Vendedor;
        this.Fecha = Fecha;
        this.cliente = cliente;
        this.codigopromocion = codigopromocion;
        productosvendidos = new ArrayList<Producto>();
        cantidad = new ArrayList<Integer>();
    }
    
    public void vender(Producto producto,int cantidad){
        productosvendidos.add(producto);
        this.cantidad.add(cantidad);
    }
    
    public void impFactura(){
        System.out.println(this.Fecha);
        System.out.println(this.Vendedor);
        System.out.println(this.cliente);
        for (int i = 0; i < productosvendidos.size(); i++) {
            System.out.println(productosvendidos.get(i).getCodigo());
            System.out.println(productosvendidos.get(i).getPrecio());
            System.out.println(cantidad.get(i));
        }
        System.out.println(this.Formadepago);
        if(this.codigopromocion == true){
            System.out.println("se aplico descuento");
        }else{
            System.out.println("no se aplico decuento");
        }
        
    }
            
   
    
}
