package com.clases;

import java.util.List;

public class Clientes extends Personas {

    private List<Producto> product;

    public Clientes(String nombre, String cedula , String tipDoc, String celular, String direccion, List producto) {
        super(nombre, cedula, tipDoc, celular, direccion);
        this.product = producto;
    }

    public String getDatos2(){
        return "cedula: " + getCedula() + " Tipo doc: " + getTipDoc() + " nombre: " + getNombre()  + " Celular: " + getCelular() + " Direccion: " + getDireccion() + ", Productos Cliente: " + product;
    }

    public List<Producto> getProduct() {
        return product;
    }

    public void setProduct(List<Producto> product) {
        this.product = product;
    }
}
