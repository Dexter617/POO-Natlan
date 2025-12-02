/*
  Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt 
  Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java 
 */
package com.natlan.modelo;

import com.natlan.util.Conexion;
import java.sql.*;

        
    public class Cliente extends Persona{
    
    private String correo;
    private Integer estado;
    
    public boolean guardarCliente(Cliente cliente){
            boolean r=false;
            Connection con= Conexion.getConexion();
            String sql="INSERT INTO `natlan`.`cliente` (`primer_nombre`, `segundo_nombre`, "
                    + "`primer_apellido`, `segundo_apellido`, `clave`, `correo`, `rol_id`, "
                    + "`estado_id`) VALUES (?, ?, ?, ?, ?, ?, ?, ?);"; 
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, cliente.getPrimerNombre());
            ps.setString(2, cliente.getSegundoNombre());
            ps.setString(3, cliente.getPrimerApellido());
            ps.setString(4, cliente.getSegundoApellido());
            ps.setString(5, cliente.getClave());
            ps.setString(6, cliente.getCorreo());
            ps.setInt(7, cliente.getRol());
            ps.setInt(8, cliente.getEstado());
            
            
            r=(ps.execute());
            
        } catch (SQLException ex) {
            System.getLogger(Cliente.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
                    
            return false;
        }
        
        public boolean existeClientePorCorreo (String correo){
        
        return false;
    
        }


    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    

   
    
}
