/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelousuario;
import Modelo.RegisEqu;
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
@WebServlet(name = "Registoequ", urlPatterns = {"/Registroequ"})
public class Registroeq extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            if(request.getParameter("ing")!=null){
            int N,v;
            String A,D,CE,C;
            N=Integer.parseInt(request.getParameter("doc"));
            D=request.getParameter("nom");
            A=request.getParameter("ape");
            C=request.getParameter("cor");
            CE=request.getParameter("cel");
            RegisEqu re=new RegisEqu(N, D, A, C, CE);
            Modelousuario mu=new Modelousuario();
            v=mu.insertar_Equipo(re);
            if(v==1){
                JOptionPane.showMessageDialog(null,"datos ingresados correctamente");
                response.sendRedirect("RegisEq.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no ingresados");
                response.sendRedirect("RegisEq.jsp");
                }
            }
            
            if(request.getParameter("act")!=null){
            boolean v;
            int N;
            String A,CE,C,D;
            N=Integer.parseInt(request.getParameter("doc"));
            D=request.getParameter("nom");
            A=request.getParameter("ape");
            C=request.getParameter("cor");
            CE=request.getParameter("cel");
            RegisEqu cl=new RegisEqu(N, D, A, C, CE);
            Modelousuario mu=new Modelousuario();
            v=mu.actualizar_equipo(cl);
            if(v){
                JOptionPane.showMessageDialog(null,"Actualmente su equipo esta "+CE+" Gracias por su aviso");
                response.sendRedirect("RegisEq.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no actualizados");
                response.sendRedirect("RegisEq.jsp");
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
