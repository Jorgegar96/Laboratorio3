/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import java.util.ArrayList;

/**
 *
 * @author JorgeLuis
 */
public class LocalesComida extends Locales{
    private int cantidadEmpleados;
    private ArrayList<Comida> productos = new ArrayList();
    private Comida productoDia;

    public LocalesComida() {
        super();
    }

    LocalesComida(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    LocalesComida(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        if (cantidadEmpleados <= 4){
            this.cantidadEmpleados = cantidadEmpleados;
        }
    }

    public Comida getProductoDia() {
        return productoDia;
    }

    public void setProductoDia(Comida productoDia) {
        this.productoDia = productoDia;
    }

    @Override
    public String toString() {
        return "LocalesComida{" + "cantidadEmpleados=" + cantidadEmpleados + ", productos=" + productos + ", productoDia=" + productoDia + '}';
    }
    
    
    
    
}
