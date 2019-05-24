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
public class Tienda {
    private ArrayList<Producto> productos;
    private ArrayList<vendedor> vendedores;
    private ArrayList<Venta> ventas;

    public Tienda(ArrayList<Producto> productos, ArrayList<vendedor> vendedores) {
        this.productos = productos;
        this.vendedores = vendedores;
        this.ventas = new ArrayList<Venta>();
    }
    
    public Tienda(){
        productos = new ArrayList<Producto>();
        productos.add(new Producto(01, "banano", 26000));
        productos.add(new Producto(02, "pera", 10));
        productos.add(new Producto(03, "mora", 2000));
        
        vendedores = new ArrayList<vendedor>();
        vendedores.add(new vendedor(00001,"JUAN"));
        vendedores.add(new vendedor(00001,"PEDRO"));
        this.ventas = new ArrayList<Venta>();
    }
    
    
    public void registrar_venta(int Formadepago, String Fecha, String cliente, boolean codigopromocion,String Vendedor,ArrayList<String> Prod,ArrayList<Integer> cant){
        vendedor v1=null;
        for (int i = 0; i < vendedores.size(); i++) {
            if (Vendedor.equals(vendedores.get(i).getNombre())){
                v1 = vendedores.get(i);
            }
        }
        
        if (v1==null){
            
        }
        else{
            Venta ven1=new Venta(Formadepago, v1, Fecha,cliente,codigopromocion);
            ingresar_productos(ven1,Prod,cant);
            ventas.add(ven1);
        }
    }
    
    private void ingresar_productos(Venta v1,ArrayList<String> Prod,ArrayList<Integer> cant){
        for (int i = 0; i < Prod.size(); i++) {
            for (int j = 0; j < productos.size(); j++) {
                if (Prod.get(i).equals(productos.get(j).getDescripcion())) {
                    v1.vender(productos.get(j), cant.get(i));
                }
            }
        }
    }
    
    
    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*ArrayList<Producto> productos = new ArrayList<Producto>();
        productos.add(new Producto(01, "banano", 26000));
        productos.add(new Producto(02, "pera", 10));
        productos.add(new Producto(03, "mora", 2000));
        
        ArrayList<vendedor> vendedores = new ArrayList<vendedor>();
        vendedores.add(new vendedor(00001,"JUAN"));
        vendedores.add(new vendedor(00001,"PEDRO"));*/
        
        Tienda D1 = new Tienda();
        
        
       
        
        
    }
    
}
