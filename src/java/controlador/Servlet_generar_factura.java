/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Con_BuscarFactura;
import Modelo.Mod_BuscarFactura;
import Modelo.Modelousuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Trabajos
 */
@WebServlet(name = "Servlet_generar_factura", urlPatterns = {"/Servlet_generar_factura"})
public class Servlet_generar_factura extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if(request.getParameter("ing")!=null){
                String a,b;
                double c;
                boolean can;
                a=request.getParameter("fecha");
                b=request.getParameter("doc");
                c=Double.parseDouble(request.getParameter("val"));
                
                Con_BuscarFactura con=new Con_BuscarFactura(b, a, c);
                
                Mod_BuscarFactura mu=new Mod_BuscarFactura();
                can=mu.insertar_Factura(con);
            if(can){
                JOptionPane.showMessageDialog(null,"datos ingresados correctamente");
                response.sendRedirect("RegistroLine.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no ingresados");
                response.sendRedirect("RegistroLine.jsp");
                }
            }
                
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
            
            
        
            
            
            
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
