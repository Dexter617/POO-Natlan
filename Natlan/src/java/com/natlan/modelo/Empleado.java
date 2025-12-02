/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.natlan.modelo;

import com.natlan.util.Conexion;
import java.sql.*;

public class Empleado extends Persona{
    
    private String usuario;
    private String correo;
    
       public Empleado login (Empleado empleado){
        
        ResultSet r=null;
        Connection con = Conexion.getConexion();
        String sql="select rol_id from empleado where usuario=? and clave=?";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1,empleado.getUsuario());
            ps.setString(2,empleado.getClave());
            
            r=ps.executeQuery();
            if(r.next()){
                empleado.setRol(r.getInt(1));
               
            }
           
        } catch (SQLException ex) {
            System.getLogger(Cliente.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return empleado;
    }
    
    
    
    
    
    
    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}
