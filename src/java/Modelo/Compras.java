/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Compras {
    
    private int id;
    private String numerodeventa;
    private String consecutivoventa;
    private Usuario usuario;
    private int idpago;
    private String fecha;
    private Double monto;
    private int mediosdepago_id;
    private int envios_id;
    private int estado_id;
    private List<Carrito> detallecompras;

    public Compras() {
    }

    public Compras(String numerodeventa, String consecutivoventa, Usuario usuario, int idpago, String fecha, Double monto, int mediosdepago_id, int envios_id, int estado_id, List<Carrito> detallecompras) {
        
        this.numerodeventa = numerodeventa;
        this.consecutivoventa = consecutivoventa;
        this.usuario = usuario;
        this.idpago = idpago;
        this.fecha = fecha;
        this.monto = monto;
        this.mediosdepago_id = mediosdepago_id;
        this.envios_id = envios_id;
        this.estado_id = estado_id;
        this.detallecompras = detallecompras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumerodeventa() {
        return numerodeventa;
    }

    public void setNumerodeventa(String numerodeventa) {
        this.numerodeventa = numerodeventa;
    }

    public String getConsecutivoventa() {
        return consecutivoventa;
    }

    public void setConsecutivoventa(String consecutivoventa) {
        this.consecutivoventa = consecutivoventa;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getIdpago() {
        return idpago;
    }

    public void setIdpago(int idpago) {
        this.idpago = idpago;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public int getMediosdepago_id() {
        return mediosdepago_id;
    }

    public void setMediosdepago_id(int mediosdepago_id) {
        this.mediosdepago_id = mediosdepago_id;
    }

    public int getEnvios_id() {
        return envios_id;
    }

    public void setEnvios_id(int envios_id) {
        this.envios_id = envios_id;
    }

    public int getEstado_id() {
        return estado_id;
    }

    public void setEstado_id(int estado_id) {
        this.estado_id = estado_id;
    }

    public List<Carrito> getDetallecompras() {
        return detallecompras;
    }

    public void setDetallecompras(List<Carrito> detallecompras) {
        this.detallecompras = detallecompras;
    }


   
    
    
    
    
    
}
