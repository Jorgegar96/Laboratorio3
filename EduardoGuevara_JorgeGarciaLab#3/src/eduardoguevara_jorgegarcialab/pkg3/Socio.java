/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import java.util.ArrayList;

/**
 *
 * @author edujg
 */
public class Socio extends Persona {

    private final String contra = "admin";
    private final String user = "socio";
    private final String nombre = "Alex Reyes";
    private ArrayList<String> facturas = new ArrayList();

    public Socio() {
        super();
    }

    public ArrayList<String> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<String> facturas) {
        this.facturas = facturas;
    }

    public String getContra() {
        return contra;
    }

    public String getUser() {
        return user;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Socio{" + "contra=" + contra + ", user=" + user + ", nombre=" + nombre + '}';
    }

}
