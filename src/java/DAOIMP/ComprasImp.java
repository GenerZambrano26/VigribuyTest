/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOIMP;

import DAO.Conexion;
import Interfaces.Icompras;
import Modelo.Carrito;
import Modelo.Compras;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ADMIN
 */
public class ComprasImp implements Icompras {

    Connection cn;
    Conexion con = new Conexion();
    PreparedStatement psta;
    ResultSet rs;
    int r = 0;

    @Override
    public int GenerarCompra(Compras compra) {

        int idcompras;
        try {
            String sql = "insert into compras(numerodeventas,consecutivoventas,usuarios_id,fecha,mediosdepagos_id,envios_id,Estados_id) values (?,?,?,?,?,?,?)";

            cn = con.Conectar();
            psta = cn.prepareStatement(sql);
            psta.setInt(1, compra.getEnvios_id());
            psta.setString(2, compra.getConsecutivoventa());
            psta.setInt(3, compra.getEnvios_id());
            psta.setString(4, compra.getFecha());
            psta.setInt(5, compra.getMediosdepago_id());
            psta.setInt(6, compra.getEnvios_id());
            psta.setInt(7, compra.getEstado_id());

            r=psta.executeUpdate();
//                } catch (Exception e) {
//            
//            System.out.print("Error Insertar Compra " + e.getMessage());
//                  }
//        try {
             sql = "select @@IDENTITY AS idcompras";

            rs = psta.executeQuery(sql);
            rs.next();
            idcompras = rs.getInt("idcompras");

            for (Carrito detalle : compra.getDetallecompras()) {
                sql = "insert into  detallecompra(numeroventas,cantidad,valorunitario,subtotal,iva,total,productos_id,compras_id ) values (?,?,?,?,?,?,?,?)";
                psta = cn.prepareStatement(sql);
                psta.setInt(1, detalle.getId());
                psta.setInt(2, detalle.getCantidad());
                psta.setDouble(3, detalle.getPreciocompra());
                psta.setDouble(4, detalle.getSubtotal());
                psta.setDouble(5, detalle.getSubtotal());
                psta.setDouble(6, detalle.getSubtotal());
                psta.setInt(7, detalle.getId());
                psta.setInt(8, idcompras);
                r = psta.executeUpdate();

            } 
        } catch (Exception e) {
            
            System.out.print("Error Insertar Detalle Compra " + e.getMessage());
        }
            
            
        
          

        

        return r;

    }

}
