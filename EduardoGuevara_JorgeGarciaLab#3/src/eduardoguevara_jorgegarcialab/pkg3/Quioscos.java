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
public class Quioscos extends Locales {

    public Quioscos(String nombre) {
        this.nombre = nombre;
    }

    //o Quioscos, estos cuentan con el nombre de una tienda existente, y deberán tener
//un producto de cada tipo el cual este a mitad de precio.
    private String nombre;
    private ArrayList<Productos> product;

    public Quioscos() {
        super();
    }

    public Quioscos(String nombre, ArrayList<Productos> product) {
        this.nombre = nombre;
        this.product = product;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Productos> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Productos> product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Quioscos{" + "nombre=" + nombre + ", product=" + product + '}';
    }

}
