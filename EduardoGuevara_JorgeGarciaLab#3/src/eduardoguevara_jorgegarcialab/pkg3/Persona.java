/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author JorgeLuis
 */
public class Persona {
    private String username;
    private String password;
    private String correo;
    private String nombre;
    private String ID;
    private Date nacimiento;
    private DateFormat formato = new SimpleDateFormat("mm/dd/yyyy");

    public Persona() {
    }

    public Persona(String username, String password, String correo, String nombre, String ID, Date nacimiento) {
        this.username = username;
        this.password = password;
        this.correo = correo;
        this.nombre = nombre;
        this.ID = ID;
        this.nacimiento = nacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "username=" + username + ", password=" + password + ", correo=" + correo + ", nombre=" + nombre + ", ID=" + ID + ", nacimiento=" + nacimiento + '}';
    }
    
    
}
