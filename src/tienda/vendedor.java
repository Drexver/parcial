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
public class vendedor {
    private int ID;
    private String Nombre;

    public vendedor(int ID, String Nombre) {
        this.ID = ID;
        this.Nombre = Nombre;
    }

    public int getID() {
        return ID;
    }

    public String getNombre() {
        return Nombre;
    }
    
}
