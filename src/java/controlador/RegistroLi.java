/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelousuario;
import Modelo.ReisLi;
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
 * @author lenovo
 */
@WebServlet(name = "RegistroLi", urlPatterns = {"/RegistroLi"})
public class RegistroLi extends HttpServlet {

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
            int N,D,v;
            String A;
            N=Integer.parseInt(request.getParameter("doc"));
            D=Integer.parseInt(request.getParameter("nom"));
            A=request.getParameter("ape");
            ReisLi re=new ReisLi(N, D,A);
            Modelousuario mu=new Modelousuario();
            v=mu.insertar_linea(re);
            if(v==1){
                JOptionPane.showMessageDialog(null,"datos ingresados correctamente");
                response.sendRedirect("RegistroLine.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no ingresados");
                response.sendRedirect("RegistroLine.jsp");
                }
            }
            
            if(request.getParameter("act")!=null){
            boolean v;
            int N,D;
            String A;
            N=Integer.parseInt(request.getParameter("doc"));
            D=Integer.parseInt(request.getParameter("nom"));
            A=request.getParameter("ape");
            ReisLi cl=new ReisLi(N, D, A);
            Modelousuario mu=new Modelousuario();
            v=mu.actualizar_linea(cl);
            if(v){
                JOptionPane.showMessageDialog(null,"Su equipo esta "+A );
                response.sendRedirect("RegistroLine.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no actualizados");
                response.sendRedirect("RegistroLine.jsp");
                }
            }
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
