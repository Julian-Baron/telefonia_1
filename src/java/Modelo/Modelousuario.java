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

public class Modelousuario {
    conexion con=new conexion();
    Connection cnn=con.conexiondb();
    PreparedStatement ps=null;
    ResultSet rs=null;
    
    public boolean agregarusuario(RegistUsu ru){
        boolean dat=false;
        int x;
        try {
            ps=cnn.prepareStatement("Insert into persona (perid,pernom,perape,pertelfijo,perfecha,percedula,imagen) values(?,?,?,?,?,?,?)");
            ps.setInt(1,ru.getPercedula());
            ps.setString(2,ru.getPernom());
            ps.setString(3,ru.getPerape());
            ps.setInt(4,ru.getTelfijo());
            ps.setString(5,ru.getPerfecha());
            ps.setInt(6,ru.getPercedula());
            ps.setString(7,ru.getImagen());
            x=ps.executeUpdate();
            if(x>0){
                dat=true;
            }
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            }
            return dat;
        }
    public int insertar_Equipo(RegisEqu re){
        int respuesta1=0;
        try {
            ps=cnn.prepareStatement("Insert into equipo values(?,?,?,?,?)");
            ps.setInt(1,re.getEquiserial());
            ps.setString(2,re.getLineanumerolinea());
            ps.setString(3,re.getEqumarca());
            ps.setString(4,re.getEqudescripcion());
            ps.setString(5,re.getEquestado());
            int dat=ps.executeUpdate();
            if(dat>0){
                respuesta1=1;
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar los datos"+ex);
        }
        return respuesta1;
    }
    public boolean actualizar_equipo(RegisEqu cl){
        boolean dat=false;
        try {
         ps=cnn.prepareStatement("Update equipo Set linumerolinea='"+cl.getLineanumerolinea()+"',equmarca='"+cl.getEqumarca()+"'"
                         + ",equdescripcion='"+cl.getEqudescripcion()+""+"',equestado='"+cl.getEquestado()+"'"
                                 + "Where equiserial='"+cl.getEquiserial()+"'");
         int x=ps.executeUpdate();
         if(x>0){
             dat=true;
         }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos del usuario"+e);
        }
        return dat;
        }
    public int insertar_linea(ReisLi re){
        int respuesta1=0;
        try {
            ps=cnn.prepareStatement("Insert into linea values(?,?,?)");
            ps.setInt(1,re.getLinumerolinea());
            ps.setInt(2,re.getPerid());
            ps.setString(3,re.getLinestado());
            int dat=ps.executeUpdate();
            if(dat>0){
                respuesta1=1;
            }
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al insertar los datos"+ex);
        }
        return respuesta1;
    }
    public boolean actualizar_linea(ReisLi cl){
        boolean dat=false;
        try {
         ps=cnn.prepareStatement("Update linea Set perid='"+cl.getPerid()+"',linestado='"+cl.getLinestado()+
                 "'Where linumerolinea='"+cl.getLinumerolinea()+"'");
         int x=ps.executeUpdate();
         if(x>0){
             dat=true;
         }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos del usuario"+e);
        }
        return dat;
        }
    public ArrayList<Buscarfac> Buscarfactura(String linumerolinea){
        ArrayList<Buscarfac> lista=new ArrayList<>();
        try {
            ps=cnn.prepareStatement("Select * from linea where linumerolinea='"+linumerolinea+"'");
            rs=ps.executeQuery();
            while(rs.next()){
                Buscarfac us=new Buscarfac(Integer.parseInt(rs.getString(1)),rs.getString(2),Integer.parseInt(rs.getString(3)),Double.parseDouble(rs.getString(4)));
            lista.add(us);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelousuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
        }
    public boolean Buscarfactu(Buscarfac cl){
        boolean dat=false;
        try {
         ps=cnn.prepareStatement("Select * from linea where linumeroline¨='"+cl.getLinumerolinea()+"'");
         int x=ps.executeUpdate();
         if(x>0){
             dat=true;
         }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al buscar los datos del usuario"+e);
        }
        return dat;
        }
    }