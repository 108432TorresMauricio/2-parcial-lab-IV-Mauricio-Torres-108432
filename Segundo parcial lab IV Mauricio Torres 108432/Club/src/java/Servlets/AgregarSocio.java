/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import Gestor.GestorBD;
import Modelo.Socio;
import Modelo.Sexo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Mauricio
 */
@WebServlet(name = "AgregarSocio", urlPatterns = {"/AgregarSocio"})
public class AgregarSocio extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
            GestorBD Gestor = new GestorBD();
            ArrayList<Sexo> listaSexo = Gestor.ComboBoxSexo();
            
            
            request.setAttribute("listaSexo",listaSexo);
            RequestDispatcher rd= getServletContext().getRequestDispatcher("/CargarSocio.jsp");
            rd.forward(request, response);
    }
    
    
    
    

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
            String Nombre = request.getParameter("txtNombre");
            String Apellido = request.getParameter("txtApellido");
            int Edad = Integer.parseInt(request.getParameter("txtEdad"));
            int Telefono = Integer.parseInt(request.getParameter("txtTelefono"));
            int sexoId = Integer.parseInt(request.getParameter("cboSexo"));
            
            Sexo sex = new Sexo(sexoId,"");
            Socio nuevoSocio = new Socio(0,Nombre,Apellido,Edad,Telefono,sex);
            GestorBD Gestor = new GestorBD();
            Gestor.agregarSocio(nuevoSocio);
            
        
            response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ListadoSocios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1> Persona generada correctamente ");
            out.println("</h1>");
             out.println("</body>");
            out.println("</html>");
      
           
           
           
           
        
        
    }

    }  
}
