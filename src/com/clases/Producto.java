package com.clases;

public class Producto {
    private String nombre;
    private String carateristicas;
    private String idProducto;
    private String condiciones;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarateristicas() {
        return carateristicas;
    }

    public void setCarateristicas(String carateristicas) {
        this.carateristicas = carateristicas;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public Integer getIdProductoInt(){
        return Integer.parseInt(idProducto);
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getCondiciones() {
        return condiciones;
    }

    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }

    public Producto(String nombre, String carateristicas, String idProducto, String condiciones) {
        this.nombre = nombre;
        this.carateristicas = carateristicas;
        this.idProducto = idProducto;
        this.condiciones = condiciones;
    }
}
