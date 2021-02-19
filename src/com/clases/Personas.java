package com.clases;

public class Personas {
    private String cedula;
    private String celular;
    private String nombre;
    private String telefono;
    private String direccion;
    private String tipDoc;
    private String representante;


    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipDoc() {
        return tipDoc;
    }

    public void setTipDoc(String tipDoc) {
        this.tipDoc = tipDoc;
    }

    public Integer getDocInt(){
        return Integer.parseInt(cedula);
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getDatos(){
        return "cedula: " + cedula + " Tipo doc: " + tipDoc + " nombre: " + nombre  + " Celular: " + celular + " Direccion: " + direccion;
    }

    public Personas(String nombre,String cedula,  String tipDoc, String celular,  String direccion) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipDoc = tipDoc;
        this.celular = celular;
        this.direccion = direccion;

    }
}
