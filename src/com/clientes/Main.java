package com.clientes;

import com.clases.Clientes;
import com.clases.Personas;
import com.clases.Producto;
import jdk.jshell.EvalException;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String menu =
                        "         * 1 Agregar cliente\n" +
                        "         * 2 Editar cliente\n" +
                        "         * 3 Eliminar cliente\n" +
                        "         * 4 Agregar productos\n" +
                        "         * 5 Consultar clientes con documento y tipo de documento \n" +
                        "         * 0 salir de la aplicacion";
        Scanner in = new Scanner(System.in);
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        ArrayList<Producto> listaProducto = new ArrayList<>();
        List<String> productoscli = Arrays.asList("");
        Integer opMenu = new Integer(0);
        String pro = "";
        Boolean val = false;

        do {
            System.out.println(menu);
            opMenu = in.nextInt();
            switch (opMenu.toString()) {
                case "1":
                    if (listaProducto.isEmpty()){
                        System.out.println("No existen productos por favor crear primero");
                        break;
                    }
                    System.out.println("Agregar Nombre Cliente");
                    String nom = in.next();
                    System.out.println("Agregar documento cliente");
                    String doccli = in.next();
                    System.out.println("Agregar tipo documento cliente");
                    String tpdoc = in.next();
                    System.out.println("Agregar celular cliente");
                    String cel = in.next();
                    System.out.println("Agregar direccion cliente");
                    String dir = in.next();
                    System.out.println("Listado de Productos Disponibles");
                    for (int i = 0; i < listaProducto.size() ; i++) {
                        System.out.println("Id Producto = " + listaProducto.get(i).getIdProducto()
                                           + " Nombre Producto =  " + listaProducto.get(i).getNombre() );
                    }
                    int count = 0;
                    for (int i = 0; i < listaProducto.size() ; i++) {
                        System.out.println("Agregar Id producto a asociar");
                        String idAso = in.next();
                        for (int j = 0; j < listaProducto.size() ; j++) {
                            int resul = Integer.compare(Integer.parseInt(idAso), listaProducto.get(j).getIdProductoInt());
                            if(resul == 0){
                                val = true;
                                break;
                            }
                        }
                        if (val == false){
                            System.out.println("agregar un id de producto de la lista");
                            break;
                        }
                        pro = pro + idAso;
                        ++count;
                        System.out.println("desea agregar otro producto? N/Y");
                        String Respuesta = in.next();
                        if (Respuesta.equalsIgnoreCase("N")){
                            break;
                        }else {
                            if (count < listaProducto.size()){
                                pro = pro + ",";
                            }
                        }
                    }
                    if (val) {
                        productoscli = Arrays.asList(pro);
                        listaClientes.add((new Clientes(nom, doccli, tpdoc, cel, dir, productoscli)));
                        System.out.println(" 'Cliente Agregado Exitosamente' ");
                    }
                    break;
                case "2":
                    if (listaClientes.isEmpty()){
                        System.out.println("Debe agregar primero un cliente");
                        break;
                    }
                    String nomMod = "0",doccliMod = "0",tpdocMod = "0",celMod = "0",dirMod = "0";
                    Clientes clienteMod = new Clientes(nomMod,doccliMod,tpdocMod,celMod,dirMod,productoscli);
                    System.out.println("Ingrese documento cliente a buscar");
                    String doc = in.next();
                    int pos = -1;
                    for (int i = 0; i < listaClientes.size() ; i++) {
                        int resul = Integer.compare(Integer.parseInt(doc), listaClientes.get(i).getDocInt());
                        if(resul == 0){
                            pos = i;
                        }
                    }
                    System.out.println("Los datos del cliente son los siguientes");
                    System.out.println(listaClientes.get(pos).getDatos2());
                    System.out.println("Agregar Nombre Cliente a Modificar");
                    clienteMod.setNombre(in.next());
                    System.out.println("Agregar documento cliente a Modificar");
                    clienteMod.setCedula(in.next());
                    System.out.println("Agregar tipo documento cliente a Modificar");
                    clienteMod.setTipDoc(in.next());
                    System.out.println("Agregar celular cliente a Modificar");
                    clienteMod.setCelular(in.next());
                    System.out.println("Agregar direccion cliente a Modificar");
                    clienteMod.setDireccion(in.next());
                    listaClientes.set(pos, clienteMod);
                    System.out.println("Los datos cambiados quedaron de la siguiente forma");
                    System.out.println(listaClientes.get(pos).getDatos2());
                    break;
                case "3":
                    if (listaClientes.isEmpty()){
                        System.out.println("No hay Clientes creados");
                        break;
                    }
                    System.out.println("Ingrese documento cliente a eliminar");
                    doc = in.next();
                    for (int i = 0; i < listaClientes.size() ; i++) {
                        int resul = Integer.compare(Integer.parseInt(doc), listaClientes.get(i).getDocInt());
                        if(resul == 0){
                            listaClientes.remove(i);
                            System.out.println("se realiza la eliminacion del cliente");
                        }
                    }
                    break;
                case "4":
                    System.out.println("Agregar Nombre Producto");
                    String produc = in.next();
                    System.out.println("Agregar caracteristicas Producto");
                    String caraproduc = in.next();
                    System.out.println("Agregar Id Producto");
                    String idprodu = in.next();
                    System.out.println("Agregar condicion producto");
                    String condiprodu = in.next();
                    listaProducto.add(new Producto(produc,caraproduc,idprodu,condiprodu));
                    System.out.println("Producto Agregado");


                    break;
                case "5":
                    if (listaClientes.isEmpty()){
                        System.out.println("Debe agregar primero un cliente");
                        break;
                    }
                    System.out.println("Ingrese documento cliente a buscar");
                    doc = in.next();
                    System.out.println("Ingrese Tipo documento cliente a buscar");
                    tpdoc = in.next();
                    for (int i = 0; i < listaClientes.size() ; i++) {
                        if (doc.equalsIgnoreCase(listaClientes.get(i).getCedula()) &&
                            tpdoc.equalsIgnoreCase(listaClientes.get(i).getTipDoc())){
                            System.out.println("Cliente encontrado los datos son ");
                            System.out.println(listaClientes.get(i).getDatos2());
                        }
                    }
                    break;
                case "0":
                    System.out.println("Muchas gracias por usar nuestra app, hasta luego");
                    break;
                default:
                    System.out.println("El valor ingresado no es una opcion de menu");
                    break;
            }
        } while (!opMenu.toString().equals("0"));
        in.close();

    }
}
