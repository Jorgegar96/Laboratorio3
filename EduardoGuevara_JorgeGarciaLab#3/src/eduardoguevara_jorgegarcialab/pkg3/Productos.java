/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

/**
 *
 * @author edujg
 */
public class Productos {

    private double precio;
    private String descrip;
    private String marca;
    private double desc;

    public Productos() {
        desc = 0;
    }

    public Productos(double precio, String descrip, String marca, double desc) {
        this.precio = precio;
        this.descrip = descrip;
        this.marca = marca;
        this.desc = desc;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio - (precio*desc);
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getDesc() {
        return desc;
    }

    public void setDesc(double desc) {
        this.desc = desc;
    }

    
    @Override
    public String toString() {
        return "Productos{" + "precio=" + precio + ", descrip=" + descrip + ", marca=" + marca + ", desc=" + desc + '}';
    }

}
