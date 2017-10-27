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
        while (!opcion.equals("4")){
            opcion = JOptionPane.showInputDialog(""
                    + "Menu:\n"
                    + "1) Inicar Seción Socio\n"
                    + "2) Iniciar Seción Cliente\n"
                    + "3) Crear Usuario Cliente\n"
                    + "4) Salir"
            );
            switch (opcion){
                case "1":
                    break;
                case "2":
                    if (clientes.size() > 0){
                        crearCliente(new Cliente());
                    }else{
                        JOptionPane.showMessageDialog(null, ""
                                + "No hay cuentas de clientes creadas!"
                        );
                    }
                    break;
                case "3":
                    crearCliente(new Cliente());
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
}
