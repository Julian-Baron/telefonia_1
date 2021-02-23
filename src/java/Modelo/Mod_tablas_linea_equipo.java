/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Conexion.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Mod_tablas_linea_equipo {
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public ArrayList<Con_tabla_linea>Buscar_persona(){
        ArrayList<Con_tabla_linea> dat=new ArrayList<>();
       
        try {
            ps=cnn.prepareStatement("SELECT \n" +
                "    persona.perid,\n" +
                "    persona.pernom,\n" +
                "    persona.perape,\n" +
                "    persona.percedula,\n" +
                "    linea.linumerolinea\n" +
                "FROM\n" +
                "    persona\n" +
                "        inner JOIN\n" +
                "    linea ON persona.perid = linea.perid");
            
            
            
            rs=ps.executeQuery();
            
            
            while(rs.next()){
                
                Con_tabla_linea us=new Con_tabla_linea(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                        
                dat.add(us);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelousuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex);
        }
        return dat;
        
    }
    
}
