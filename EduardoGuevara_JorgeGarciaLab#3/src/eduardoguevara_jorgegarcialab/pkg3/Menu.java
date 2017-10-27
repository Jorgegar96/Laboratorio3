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
                + "8: Salir\n"
                + "9: Eliminar locales\n"
                + "10: Eliminar tiendas\n"
                + "11: Eliminar productos"));
        return opcion;
    }

    public int menulocal() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Modificar nombre\n"
                + "2: Modificar o agregar numero de piso\n"
                + "3: Modificar o agregar Empleados\n"
                + "4: Modificar o agregar Productos\n"
                + "5: Modificar o agregar Empleado de turno\n"
                + "6: Salir\n"
                + "7: Eliminar productos\n"));
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
                + "3: Salir"));
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

    public int menuprodu() {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Agregar Productos\n"
                + "2: Modificar Productos\n"
                + "3: Salir"));
        return opcion;
    }
    /*              switch (m.menusocio()) {
                        case 1:
                            switch (m.menutipol()) {
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
                            switch (m.menutipop()) {
                                case 1:
                                    Productos.add(new Ropa());
                                    break;
                                case 2:
                                    Productos.add(new Juguetes());
                                    break;
                                case 3:
                                    Productos.add(new Comida());
                                    break;
                                case 4:
                                    //salir
                                    break;
                            }
                            break;
                        case 3:
                            empleados.add(new Empleado());
                            break;
                        case 4:
                            int op = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del local a modificar"));
                            switch (m.menulocal()) {
                                case 1:
                                    locales.get(op).setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre"));
                                    break;
                                case 2:
                                    locales.get(op).setPiso(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo piso del local")));
                                    break;
                                case 3:
                                    switch (m.menuemp()) {
                                        case 1:
                                            locales.get(op).getEmpleado().add(new Empleado());
                                            break;
                                        case 2:
                                            int posi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del empleado a modificar: "));
                                            switch (m.menuemple()) {
                                                case 1:
                                                    locales.get(op).getEmpleado().get(posi).setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva hora de entrada: ")));
                                                    break;
                                                case 2:
                                                    locales.get(op).getEmpleado().get(posi).setHoraSalida(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva hora de salida: ")));
                                                    break;
                                                case 3:
                                                    //salir
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            //salir
                                            break;
                                    }
                                    break;
                                case 4:
                                    switch (m.menuprodu()) {
                                        case 1:
                                            switch (m.menutipop()) {
                                                case 1:
                                                    Productos.add(new Ropa());
                                                    break;
                                                case 2:
                                                    Productos.add(new Juguetes());
                                                    break;
                                                case 3:
                                                    Productos.add(new Comida());
                                                    break;
                                                case 4:
                                                    //salir
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del producto a modificar: "));
                                            switch (m.menuproduct()) {
                                                case 1:
                                                    locales.get(op).getProductos().get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")));
                                                    break;
                                                case 2:
                                                    locales.get(op).getProductos().get(pos).setMarca(JOptionPane.showInputDialog("Ingrese la nueva marca: "));
                                                    break;
                                                case 3:
                                                    locales.get(op).getProductos().get(pos).setDescrip(JOptionPane.showInputDialog("Ingrese la nueva Descripcion: "));
                                                    break;
                                                case 4:
                                                    locales.get(op).getProductos().get(pos).setDesc(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo descuento: ")));
                                                    break;
                                                case 5:
                                                    //salir
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            //salir
                                            break;
                                    }
                                    //modificar productos array
                                    break;
                                case 5:
                                    locales.get(op).setEmpleadoturno(JOptionPane.showInputDialog("Ingrese el empleado de turno"));
                                    break;
                                case 6:
                                    //salir local
                                    break;
                            }
                            break;
                        case 5:
                            int po = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la tienda a modificar:"));
                            switch (m.menutienda()) {
                                case 1:
                                    ((Tiendas)(locales.get(po))).setTam(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo tamaño de la tienda:")));
                                    break;
                                case 2:
                                    switch (m.menuprodu()) {
                                        case 1:
                                            switch (m.menutipop()) {
                                                case 1:
                                                    locales.get(po).getProductos().add(new Ropa());
                                                    break;
                                                case 2:
                                                    locales.get(po).getProductos().add(new Juguetes());
                                                    break;
                                                case 3:
                                                    ((Tiendas)(locales.get(po))).getProductos().add(new Comida());
                                                    break;
                                            }
                                            break;
                                        case 2:
                                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del producto a modificar: "));
                                            switch (m.menuproduct()) {
                                                case 1:
                                                    ((Tiendas)(locales.get(po))).getProductos().get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")));
                                                    break;
                                                case 2:
                                                    ((Tiendas)locales.get(po)).getProductos().get(pos).setMarca(JOptionPane.showInputDialog("Ingrese la nueva marca: "));
                                                    break;
                                                case 3:
                                                    ((Tiendas)(locales.get(po))).getProductos().get(pos).setDescrip(JOptionPane.showInputDialog("Ingrese la nueva Descripcion: "));
                                                    break;
                                                case 4:
                                                    ((Tiendas)(locales.get(po))).getProductos().get(pos).setDesc(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo descuento: ")));
                                                    break;
                                                case 5:
                                                    //salir
                                                    break;
                                            }
                                            break;
                                        case 3:
                                            //salir
                                            break;
                                    }
                                    break;
                                case 3:
                                    //salir
                                    break;
                            }
                            break;
                        case 6:
                            int pos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del producto a modificar: "));
                            switch (m.menuproduct()) {       
                                case 1:
                                    Productos.get(pos).setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo precio: ")));
                                    break;
                                case 2:
                                    Productos.get(pos).setMarca(JOptionPane.showInputDialog("Ingrese la nueva marca: "));
                                    break;
                                case 3:
                                    Productos.get(pos).setDescrip(JOptionPane.showInputDialog("Ingrese la nueva Descripcion: "));
                                    break;
                                case 4:
                                    Productos.get(pos).setDesc(Float.parseFloat(JOptionPane.showInputDialog("Ingrese el nuevo descuento: ")));
                                    break;
                                case 5:
                                    //salir
                                    break;
                            }
                            break;
                        case 7:
                            int posi = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion del empleado a modificar: "));
                            switch (m.menuemple()) {
                                case 1:
                                    empleados.get(posi).setHoraEntrada(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva hora de entrada: ")));
                                    break;
                                case 2:
                                    empleados.get(posi).setHoraSalida(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva hora de salida: ")));
                                    break;
                                case 3:
                                    //salir
                                    break;
                            }
                            break;
                        case 8:
                            //salir
                            break;
                    }static Menu m = new Menu();
                    static ArrayList<Productos> Productos = new ArrayList();
     */
}
