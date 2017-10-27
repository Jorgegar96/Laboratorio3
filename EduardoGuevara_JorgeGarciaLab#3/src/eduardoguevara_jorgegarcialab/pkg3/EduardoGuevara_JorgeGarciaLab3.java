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
public class EduardoGuevara_JorgeGarciaLab3 {
    
    static ArrayList<Cliente> clientes= new ArrayList();
    static ArrayList<Empleado> empleados = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String opcion = "";
        while (!opcion.equals("5")){
            opcion = JOptionPane.showInputDialog(""
                    + "Menu:\n"
                    + "1) Inicar Seción Socio\n"
                    + "2) Iniciar Seción Cliente\n"
                    + "3) Crear Usuario Cliente\n}"
                    + "4) Crerar Usuario Empleado\n"
                    + "5) Salir"
            );
            switch (opcion){
                case "1":
                    break;
                case "2":
                    if (clientes.size() > 0){
                        logIn();
                    }else{
                        JOptionPane.showMessageDialog(null, ""
                                + "No hay cuentas de clientes creadas!"
                        );
                    }
                    break;
                case "3":
                    crearCliente(new Cliente());
                    break;
                case "5":
                    crearEmpleado(new Empleado());
                    break;
            }
        }
    }
    
    public static void crearCliente(Cliente cliente){
        cliente.setNombre(JOptionPane.showInputDialog(""
                + "Ingrese su nombre:"
        ));
         cliente.setApellido(JOptionPane.showInputDialog(""
                + "Ingrese su apellido:"
        ));
        String ID = "";
        do{
            ID = JOptionPane.showInputDialog(""
                    + "Ingrese su número de identidad:"
            );
        }while (!IDUnico(ID) || !esNumero(ID));
        cliente.setID(ID);
        int mes = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el mes de su nacimiento:"
        ));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el dia de su nacimiento:"
        ));
        int año = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el año de su nacimiento:"
        ));
        cliente.setNacimiento(dia, mes, año);
        String username = "";
        do{
            username = JOptionPane.showInputDialog(""
                    + "Ingrese su nombre de usuario:"
            );
        }while (!usuarioUnico(username));
        cliente.setUsername(username);
        cliente.setPassword(JOptionPane.showInputDialog(""
                + "Ingrese la contraseña deseada:"
        ));
        cliente.setCorreo(JOptionPane.showInputDialog(""
                + "Ingrese la dirección de correo:"
        ));
        cliente.setDinero(Float.parseFloat(JOptionPane.showInputDialog(""
                + "Ingrese el dinero disponible:"
        )));
        clientes.add(cliente);
    }
    
    public static void crearEmpleado(Empleado empleado){
        empleado.setNombre(JOptionPane.showInputDialog(""
                + "Ingrese su nombre:"
        ));
        empleado.setApellido(JOptionPane.showInputDialog(""
                + "Ingrese su apellido:"
        ));
        String ID = "";
        do{
            ID = JOptionPane.showInputDialog(""
                    + "Ingrese su número de identidad:"
            );
        }while (!IDUnico(ID) || !esNumero(ID));
        empleado.setID(ID);
        int mes = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el mes de su nacimiento:"
        ));
        int dia = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el dia de su nacimiento:"
        ));
        int año = Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese el año de su nacimiento:"
        ));
        empleado.setNacimiento(dia, mes, año);
        String username = "";
        do{
            username = JOptionPane.showInputDialog(""
                    + "Ingrese su nombre de usuario:"
            );
        }while (!usuarioUnico(username));
        empleado.setUsername(username);
        empleado.setPassword(JOptionPane.showInputDialog(""
                + "Ingrese la contraseña deseada:"
        ));
        empleado.setCorreo(JOptionPane.showInputDialog(""
                + "Ingrese la dirección de correo:"
        ));
        empleado.setDinero(Float.parseFloat(JOptionPane.showInputDialog(""
                + "Ingrese el dinero disponible:"
        )));
        empleado.setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese la hora de entrada:"
        )));
         empleado.setHoraSalida(Integer.parseInt(JOptionPane.showInputDialog(""
                + "Ingrese la hora de salida:"
        )));
        empleados.add(empleado);
    }
    
    public static boolean usuarioUnico(String username){
        for (Cliente cliente : clientes) {
            if (cliente.getUsername().equals(username)){
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe.");
                return false;
            }
        }
        for (Empleado empleado : empleados) {
            if (empleado.getUsername().equals(username)){
                JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe.");
                return false;
            }
        }
        return true;
    }
    
    public static boolean IDUnico(String ID){
        if (clientes.size() > 0){
            for (Cliente cliente : clientes) {
                if (cliente.getID().equals(ID)){
                    JOptionPane.showMessageDialog(null, "ID repetido.");
                    return false;
                }
            }
            for (Empleado empleado : empleados) {
                if (empleado.getID().equals(ID)){
                    JOptionPane.showMessageDialog(null, "ID repetido.");
                    return false;
                }
            }
        }
        return true;
    } 
    
    public static boolean esNumero(String cadena){//Revisa si la cadena ingresada es un número
        for (int x=0 ; x < cadena.length() ; x++){
            if (!Character.isDigit(cadena.charAt(x))){
                return false;
            }
        }
        return true;
    }
    
    public static void logIn(){
        String datos = "";
        while (!datos.equals("0")){
            datos = JOptionPane.showInputDialog(""
                        + "Ingrese su Usuario: ('0' para salir)"
            );
            if (!datos.equals("0")){
                if (userExists(datos)){
                    String usuario = datos;
                    datos = JOptionPane.showInputDialog(""
                                + "Ingrese su Contraseña: ('0' para salir)"
                    );
                    if (contraseñaCorrespondiente(usuario, datos)){
                        logged(loggedUser(usuario, datos));
                    }else{
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta!");
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "El Usuario no existe!");
                }
            }
        }
    }
    
    public static boolean userExists(String usuario){
        for (Cliente cliente : clientes) {
            if (usuario.equals(cliente.getUsername())){
                return true;
            }
        }
        for (Empleado empleado : empleados) {
            if (usuario.equals(empleado.getUsername())){
                return true;
            }
        }
        return false;
    }
    
    public static boolean contraseñaCorrespondiente(String usuario, String contraseña){
        for (Cliente cliente : clientes) {
            if (usuario.equals(cliente.getUsername()) && contraseña.equals(cliente.getPassword())){
                return true;
            }
        }
        for (Empleado empleado: empleados) {
            if (usuario.equals(empleado.getUsername()) && contraseña.equals(empleado.getPassword())){
                return true;
            }
        }
        return false;
    }
    
    public static void logged(Persona user){
        String opcion = "";
        while (!opcion.equals("4")){
            //menucliente
            switch (opcion){
                case "1":
                    ;
                    break;
                case "2":
                    ;
                    break;
                case "3":
                    ;
                    break;
                case "4":
                    break;
            }
        }
    }
    
    public static Persona loggedUser(String usuario, String password){
        for (Cliente cliente : clientes) {
            if (usuario.equals(cliente.getUsername()) && password.equals(cliente.getPassword())){
                return cliente;
            }
        }
        for (Empleado empleado : empleados) {
            if (usuario.equals(empleado.getUsername()) && password.equals(empleado.getPassword())){
                return empleado;
            }
        }
        return null;
    }
}
