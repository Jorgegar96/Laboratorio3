/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import java.util.ArrayList;

/*
o Quioscos, estos cuentan con el nombre de una tienda existente, y deberán tener
un producto de cada tipo el cual este a mitad de precio.
o Locales de comida, cuentan con un máximo de 4 empleados y estos solo pueden
tener productos alimenticios, además de eso también cuentan con un producto
del día el cual tendrá un 50% de descuento.*/
/**
 *
 * @author edujg
 */
public class Locales {

    protected String nombre;
    private int piso;
    private ArrayList<Empleado> empleado;
    private ArrayList<Productos> productos;
    private String empleadoturno;

    public Locales() {
    }

    public Locales(String nombre) {
        this.nombre = nombre;
    }
    

    public Locales(String nombre, int piso, ArrayList<Empleado> empleado, ArrayList<Productos> productos, String empleadoturno) {
        this.nombre = nombre;
        this.piso = piso;
        this.empleado = empleado;
        this.productos = productos;
        this.empleadoturno = empleadoturno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleado;
    }

    public void setEmpleado(ArrayList<Empleado> empleado) {
        this.empleado = empleado;
    }

    public ArrayList<Productos> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Productos> productos) {
        this.productos = productos;
    }

    public String getEmpleadoturno() {
        return empleadoturno;
    }

    public void setEmpleadoturno(String empleadoturno) {
        this.empleadoturno = empleadoturno;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", empleado=" + empleado + ", productos=" + productos + ", empleadoturno=" + empleadoturno + '}';
    }

}
