/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.InputStream;
import java.util.Date;


/**
 *
 * @author ADMIN
 */
public class Producto {
 
    int id;
    String nombre;
    String descripcion;
    float preciocompra;
    float precioventa;
    String urlimagen;
    double existencia;
    Date fechavencimiento;
    int categoria_id;
    int estado_id;
    int unidadesdemedidas_id;
    InputStream img;

    public Producto() {
    }

    public int getId() {
        return id;
    }

    public Producto( String nombre, String descripcion, float preciocompra, float precioventa, String urlimagen, double existencia, Date fechavencimiento, int categoria_id, int estado_id, int unidadesdemedidas_id, InputStream img) {
        
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.urlimagen = urlimagen;
        this.existencia = existencia;
        this.fechavencimiento = fechavencimiento;
        this.categoria_id = categoria_id;
        this.estado_id = estado_id;
        this.unidadesdemedidas_id = unidadesdemedidas_id;
        this.img = img;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(float preciocompra) {
        this.preciocompra = preciocompra;
    }

    public float getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(float precioventa) {
        this.precioventa = precioventa;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public Date getFechavencimiento() {
        return fechavencimiento;
    }

    public void setFechavencimiento(Date fechavencimiento) {
        this.fechavencimiento = fechavencimiento;
    }

    public int getCategoria_id() {
        return categoria_id;
    }

    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public int getUnidadesdemedidas_id() {
        return unidadesdemedidas_id;
    }

    public void setUnidadesdemedidas_id(int unidadesdemedidas_id) {
        this.unidadesdemedidas_id = unidadesdemedidas_id;
    }

    public InputStream getImg() {
        return img;
    }

    public void setImg(InputStream img) {
        this.img = img;
    }
    
        
                
    
    
}
