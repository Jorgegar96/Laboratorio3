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
public class Empleado extends Persona{
    private int horaEntrada;
    private int horaSalida;
    private String horarioTrabajo;
    private int productosVendidos;
    private float dinero;
    private ArrayList<Productos> comprados = new ArrayList();

    public Empleado() {
        super();
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public int getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(int productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getComprados() {
        return comprados;
    }

    public void setComprados(ArrayList<Productos> comprados) {
        this.comprados = comprados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + ", horarioTrabajo=" + horarioTrabajo + ", productosVendidos=" + productosVendidos + '}';
    }
    
    
}
