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

    int contVendidos;
    protected String nombre;
    private int piso;
    private ArrayList<Empleado> empleado = new ArrayList();
    private ArrayList<Productos> productos = new ArrayList();
    private Empleado empleadoturno;
    private ArrayList<Productos> vendidos = new ArrayList();
    private ArrayList<String> facturas = new ArrayList();

    public Locales() {
        contVendidos = 0;
    }

    public Locales(String nombre) {
        this.nombre = nombre;
    }
    

    public Locales(String nombre, int piso, ArrayList<Empleado> empleado, ArrayList<Productos> productos, Empleado empleadoturno) {
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

    public ArrayList<String> getFacturas() {
        return facturas;
    }

    public void setFacturas(ArrayList<String> facturas) {
        this.facturas = facturas;
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

    public Empleado getEmpleadoturno() {
        return empleadoturno;
    }

    public void setEmpleadoturno(Empleado empleadoturno) {
        this.empleadoturno = empleadoturno;
    }

    public int getContVendidos() {
        return contVendidos;
    }

    public void addContVendidos() {
        this.contVendidos++;
    }

    public ArrayList<Productos> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList<Productos> vendidos) {
        this.vendidos = vendidos;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", empleado=" + empleado + ", productos=" + productos + ", empleadoturno=" + empleadoturno + '}';
    }

}
