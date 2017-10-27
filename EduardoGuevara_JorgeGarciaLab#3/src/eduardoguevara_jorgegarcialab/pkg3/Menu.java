/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author edujg
 */
public class Menu {

    private int opcion;

    public int menusocio() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Crear locales\n"
                + "2: Crear productos\n"
                + "3: Crear empleados\n"
                + "4: Modificar locales\n"
                + "5: Modificar tiendas\n"
                + "6: Modificar productos\n"
                + "7: Modificar empleados\n"
                + "8: Salir"));
        return opcion;
    }

    public int menulocal() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Modificar nombre\n"
                + "2: Modificar o agregar numero de piso\n"
                + "3: Modificar o agregar Empleados\n"
                + "4: Modificar o agregar Productos\n"
                + "5: Modificar o agregar Empleado de turno\n"
                + "6: Salir"));
        return opcion;
    }

    public int menutienda() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Modificar tamaño\n"
                + "2: Modificar productos\n"
                + "3: Salir"));
        return opcion;
    }

    public int menuproduct() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Modificar el precio\n"
                + "2: Modificar la marca\n"
                + "3: Modificar la descripcion\n"
                + "4: Modificar el descuento\n"
                + "5: Salir"));
        return opcion;
    }

    public int menuemple() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Modificar hora de entrada\n"
                + "2: Modificar hora de salida\n"
                + "3: Modificar Horario\n"
                + "4: Salir"));
        return opcion;
    }

    public int menuclient() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Comprar producto\n"
                + "2: Salir"));
        return opcion;
    }

    public int menutipol() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Nueva Tienda\n"
                + "2: Nuevo Quiosco\n"
                + "3: Nuevo Local de comida\n"
                + "4: Salir"));
        return opcion;
    }

    public int menutipop() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tipo de producto a crear:\n"
                + "1: Ropa\n"
                + "2: Juguetes\n"
                + "3: Comida\n"
                + "4: Salir"));
        return opcion;
    }

    public int menuemp() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Agregar empleados\n"
                + "2: Modificar empleados\n"
                + "3: Salir"));
        return opcion;
    }
    /*switch(Menusocio()){
    case 1:
    switch(menutipol()){
    case 1:
    locales.add(new Tiendas(JOptionPane.showInputDialog("Ingrese el nombre del local")));
    break;
    case 2:
    locales.add(new Quioscos(JOptionPane.showInputDialog("Ingrese el nombre del local")));
    break;
    case 3:
    locales.add(new LocalesComida(JOptionPane.showInputDialog("Ingrese el nombre del local")));
    break;
    }
    break;
    case 2:
    switch(menutipop()){
    case 1:
    Productos.add(new Ropa());
    break;
    case 2:
    Productos.add(new Juguetes());
    break;
    case 3:
    Productos.add(new Comida());
    break;
    }
    break;
    case 3:
    Personas.add(new Empleado());
    break;
    case 4:
    int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del local a modificar"));
    switch(menulocal()){
    case 1:
    Locales.get(op).setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre"));
    break;
    case 2:
    Locales.get(op).setPiso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo piso del local")))
    break;
    case 3:
    modificar empleados array
    break;
    case 4:
    modificar productos array
    break;
    }
    break;
    case 5:
    switch(menutienda){
    }
    break;
    case 6:
    switch(menuproduct()){
    }
    break;
    case 7:
    switch(menuemple){
    }
    break;
    }
     */
}
