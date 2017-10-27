/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eduardoguevara_jorgegarcialab.pkg3;

/**
 *
 * @author JorgeLuis
 */
public class BackUp {
    /*static ArrayList<Cliente> clientes= new ArrayList();
    static ArrayList<Empleado> empleados = new ArrayList();
    static ArrayList<Locales> locales = new ArrayList();
    static Persona logged;

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
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
        logged = user;
        String opcion = "";
        while (!opcion.equals("5")){
            opcion = menuclient();
            switch (opcion){
                case "1":
                    comprarProductos();
                    break;
                case "2":
                    productosComprados();
                    break;
                case "3":
                    revisionSaldo();
                    break;
                case "4":
                    agregarSaldo();
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
    
    public static String menuclient() {
        return JOptionPane.showInputDialog("Ingrese una opcion:\n"
                + "1: Comprar producto\n"
                + "2: Salir");
    }
    
    public static void comprarProductos(){
        String opcion = "";
        while (!opcion.equals((locales.size() + 1) + "")){
            opcion = JOptionPane.showInputDialog(listaTiendas());
            if (esNumero(opcion)){
                if (Integer.parseInt(opcion)-1 < locales.size()){
                    listaProductos(Integer.parseInt(opcion)-1);
                }
            }
        }
    }
    
    public static String listaTiendas(){
        String lista = "Locales:\n";
        for (Locales local : locales) {
            lista += (locales.indexOf(local) + 1) + ") " + local.getNombre();
            if (local instanceof Tiendas){
                lista += "/ Tienda\n"; 
            } else if (local instanceof Quioscos){
                lista += "/ Quiosco\n"; 
            }else if (local instanceof LocalesComida){
                lista += "/ Local de Comida\n"; 
            }
        }
        return lista;
    }
    
    public static void listaProductos(int index){
        String opcion = "";
        while (!opcion.equals((locales.get(index).getProductos().size()+1)+"")){
            opcion = JOptionPane.showInputDialog(concatenarProductos(index));
            if (esNumero(opcion)){
                if (Integer.parseInt(opcion)-1 < locales.get(index).getProductos().size()){
                    comprar(index, Integer.parseInt(opcion)-1);
                }
            }
        }
    }
    
    public static String concatenarProductos(int index){
        String lista = "Productos\n";
        for (int x=0 ; x < locales.get(index).getProductos().size() ; x++){
            lista += (locales.get(index).getProductos().indexOf(x) + 1) + ") "
                    + locales.get(index).getProductos().get(x) + "\n";
        }
        return lista;
    }
    
    public static void comprar(int index, int productPos){
        if (((Cliente)logged).getDinero() >= ((Productos)locales.get(index).getProductos().get(productPos)).getPrecio()
                || ((Cliente)logged).getDinero() >= ((Productos)locales.get(index).getProductos().get(productPos)).getPrecio()){
            if (logged instanceof Cliente){
                ((Cliente)logged).getComprados().add(locales.get(index).getProductos().get(productPos));
            }else if (logged instanceof Empleado){
                ((Empleado)logged).getComprados().add(locales.get(index).getProductos().get(productPos));
            }
            locales.get(index).getVendidos().add(locales.get(index).getProductos().get(productPos));
            locales.get(index).getProductos().remove(productPos);
            locales.get(index).addContVendidos();
            if (locales.get(index).getContVendidos() % 5 == 0){
                String factura = facturacion(index);
                JOptionPane.showMessageDialog(null, factura);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Fondos Insuficientes!");
        }
    }
    
    public static String facturacion(int index){
        String lista = "Factura\n";
        for (Productos vendido : locales.get(index).getVendidos()) {
            if (vendido instanceof Ropa){
                lista += ((Ropa)vendido).toString();
            } else if (vendido instanceof Comida){
                lista += ((Comida)vendido).toString();
            } else if (vendido instanceof Juguetes){
                lista +=((Juguetes)vendido).toString();
            }
            lista += vendido.getPrecio() + "\n";
        }
        return lista;
    }
    
    public static void productosComprados(){
        JOptionPane.showMessageDialog(null, concatenarComprados());
    }
    
    public static String concatenarComprados(){
        String lista = "Compras:\n";
        if (logged instanceof Cliente){
            for (Productos product : ((Cliente)logged).getComprados()) {
                if (product instanceof Ropa){
                    lista += ((Ropa)product).toString();
                } else if (product instanceof Comida){
                    lista += ((Comida)product).toString();
                } else if (product instanceof Juguetes){
                    lista +=((Juguetes)product).toString();
                }
                lista += "\n";
            }
        } else if (logged instanceof Empleado){
            for (Productos product : ((Empleado)logged).getComprados()) {
                if (product instanceof Ropa){
                    lista += ((Ropa)product).toString();
                } else if (product instanceof Comida){
                    lista += ((Comida)product).toString();
                } else if (product instanceof Juguetes){
                    lista +=((Juguetes)product).toString();
                }
                lista += "\n";
            }
        }
        return lista;
    }
    
    public static void revisionSaldo(){
        JOptionPane.showMessageDialog(null, concatenarSaldo());
    }
    
    public static String concatenarSaldo(){
    String lista = "Saldo restante:\n";
        if (logged instanceof Cliente){
            lista += ((Cliente)logged).getDinero();
        } else if (logged instanceof Empleado){
            lista += ((Empleado)logged).getDinero();
        }
        return lista;    
    }
    
    public static void agregarSaldo(){
        if (logged instanceof Cliente){
           ((Cliente)logged).addDinero(Integer.parseInt(JOptionPane.showInputDialog("Monto a Agregar")));
        } else if (logged instanceof Empleado){
            ((Empleado)logged).addDinero(Integer.parseInt(JOptionPane.showInputDialog("Monto a Agregar")));
        }
    }*/
}
