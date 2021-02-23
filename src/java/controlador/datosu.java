/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Modelo.Modelousuario;
import Modelo.RegistUsu;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
@WebServlet(name = "datosp", urlPatterns = {"/datosp"})
@MultipartConfig
public class datosu extends HttpServlet {                                                                                       

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
            boolean v;
            int N,C,S;
            String A,CE,D,im;
           /* N=Integer.parseInt(request.getParameter("doc"));*/
            D=request.getParameter("nom");
            A=request.getParameter("ape");
            C=Integer.parseInt(request.getParameter("cor"));
            CE=request.getParameter("cel");
            S=Integer.parseInt(request.getParameter("gen"));
            Part foto=request.getPart("img");
            String nomfoto=foto.getSubmittedFileName();
            String nombre=D+"_"+nomfoto; 
            String url="C:\\Users\\Trabajos\\Documents\\NetBeansProjects\\Telefonia\\web\\img\\"+nombre;
            String url2="img/"+nombre;
            
            InputStream file=foto.getInputStream();
            File f=new File(url);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
            FileOutputStream sal=new FileOutputStream(f);
            int num=file.read();
            
            /*generar el recorrido de los bytes*/
            while(num!=-1){
                sal.write(num);
                num=file.read();
            }
            
            
            RegistUsu cl=new RegistUsu(D, A, C, CE, S, url2);
            Modelousuario mu=new Modelousuario();
            v=mu.agregarusuario(cl);
            if(v){
                JOptionPane.showMessageDialog(null,"datos ingresados correctamente");
                response.sendRedirect("RegistroUs.jsp");
            }
            else{
                JOptionPane.showMessageDialog(null,"Datos no ingresados");
                response.sendRedirect("RegistroUs.jsp");
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
