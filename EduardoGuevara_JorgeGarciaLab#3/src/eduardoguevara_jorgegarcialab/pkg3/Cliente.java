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
public class Cliente extends Persona{
    
   private ArrayList<Productos> comprados = new ArrayList();
   private float dinero;

    public Cliente() {
        super();
        
    }

    public ArrayList<Productos> getComprados() {
        return comprados;
    }

    public void setComprados(ArrayList<Productos> comprados) {
        this.comprados = comprados;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "comprados=" + comprados + ", dinero=" + dinero + '}';
    }
   
   
    
}
