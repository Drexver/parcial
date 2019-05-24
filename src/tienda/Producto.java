/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author rodri
 */
public class Producto {
    private int Codigo;
    private String Descripcion;
    private double Precio;

    public Producto(int Codigo, String Descripcion, double Precio) {
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Precio = Precio;
    }

    public int getCodigo() {
        return Codigo;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public double getPrecio() {
        return Precio;
    }
    
    
}
