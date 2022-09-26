/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ADMIN
 */
public class Usuario {
    
    
    String id;
    String identificacion;
    String nombre;
    String telefono;
    String correo;
    String direccion;
    String contraseña;
    String estadoid;
    String admistradorid;
    String tipodocuentoid;
    String cuentabancariaid;

    public Usuario() {
    }

    public String getId() {
        return id;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getEstadoid() {
        return estadoid;
    }

    public String getAdmistradorid() {
        return admistradorid;
    }

    public String getTipodocuentoid() {
        return tipodocuentoid;
    }

    public String getCuentabancariaid() {
        return cuentabancariaid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setEstadoid(String estadoid) {
        this.estadoid = estadoid;
    }

    public void setAdmistradorid(String admistradorid) {
        this.admistradorid = admistradorid;
    }

    public void setTipodocuentoid(String tipodocuentoid) {
        this.tipodocuentoid = tipodocuentoid;
    }

    public void setCuentabancariaid(String cuentabancariaid) {
        this.cuentabancariaid = cuentabancariaid;
    }

    public Usuario(String id, String identificacion, String nombre, String telefono, String correo, String direccion) {
        this.id = id;
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
   
    }
    
    
        
    
    
    
}
