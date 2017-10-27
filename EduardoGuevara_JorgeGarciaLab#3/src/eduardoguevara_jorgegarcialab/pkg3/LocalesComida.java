/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

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

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        if (cantidadEmpleados <= 4){
            this.cantidadEmpleados = cantidadEmpleados;
        }else {
            JOptionPane.showMessageDialog(null, "Ya se alcanzo el máximo de empleados (4)");
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
