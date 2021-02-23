
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


public class Mod_BuscarFactura {
    
    
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    
    public ArrayList<Con_BuscarFactura>Buscar_Factura(Con_BuscarFactura con){
        ArrayList<Con_BuscarFactura> dat=new ArrayList<>();
        
        try {
            ps=cnn.prepareStatement("SELECT \n" +
            "    factura.facnumero,\n" +
            "    persona.pernom,\n" +
            "    persona.perape,\n" +
            "    persona.percedula,\n" +
            "    persona.pertelfijo,\n" +
            "    factura.fecfechaemision,\n" +
            "    factura.facvalor\n" +
            "FROM\n" +
            "    factura\n" +
            "        INNER JOIN\n" +
            "    linea ON factura.linumerolinea = linea.linumerolinea\n" +
            "        INNER JOIN\n" +
            "    persona ON linea.perid = persona.perid\n" +
            "WHERE\n" +
            "    persona.percedula ='"+con.getCedula()+"'\n" +
            "        AND DATE (factura.fecfechaemision) < DATE('"+con.getFecha_emision()+"')");
            
            
            
            rs=ps.executeQuery();
            while(rs.next()){
                Con_BuscarFactura us=new Con_BuscarFactura(Integer.parseInt(rs.getString(1)),rs.getString(2),
                        rs.getString(3),rs.getString(4),Integer.parseInt(rs.getString(5)),rs.getString(6),Double.parseDouble(rs.getString(7)));
                dat.add(us);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelousuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dat;
        
    }
    
    public boolean eliminar_Factura(Con_BuscarFactura con){
        boolean as=false;
        try {
            ps=cnn.prepareStatement("delete from facturas where facnumero='"+con.getFactura_numero()+"'");
            
            int x=ps.executeUpdate();
            
            if(x>0){
                as=true;
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelousuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error en eliminar factura" +ex);
        }
        return as;
        
        
    }
    public boolean insertar_Factura(Con_BuscarFactura con){
        boolean as=false;
        JOptionPane.showMessageDialog(null,"fecha"+con.getLineanumero());
        try {
            ps=cnn.prepareStatement("Insert into factura(linumerolinea,fecfechaemision,facvalor) values(?,?,?)");
            ps.setString(1,con.getLineanumero());
            ps.setString(2,con.getFecha_emision());
            ps.setDouble(3,con.getFactura());
            
            int x=ps.executeUpdate();
            
            if(x>0){
                as=true;
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Modelousuario.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Error en eliminar factura" +ex);
        }
        return as;
        
    }
    
    
    
}
