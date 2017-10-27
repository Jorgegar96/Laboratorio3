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
public class Tiendas extends Locales {

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

//ctrlc :wq
    private int tam;
    private ArrayList<Productos> product;

    public Tiendas() {
        super();
    }

    public Tiendas(int tam, ArrayList<Productos> product) {
        this.tam = tam;
        this.product = product;
    }

    public ArrayList<Productos> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Productos> product) {
        this.product = product;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        if (tam <= 18) {
            this.tam = tam;
        }
    }

}
