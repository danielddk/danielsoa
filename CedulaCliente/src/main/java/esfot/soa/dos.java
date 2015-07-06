/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esfot.soa;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import esfot.soa.Cedula_Service;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "dos", urlPatterns = {"/dos"})
public class dos extends HttpServlet {
     @WebServiceRef
     private Cedula_Service servicio; 
     

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
        PrintWriter out = response.getWriter(); 
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HolaMundo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HolaMundo desde "
                    + request.getContextPath() + "</h1>");
            
            try { // Obtenemos el Port
                esfot.soa.Cedula port = servicio.getCedulaPort();
                java.lang.String ci = request.getParameter("ci");
                //java.lang.Integer b = Integer.parseInt(request.getParameter("b"));
             
// Llamamos a la operación correspondiente del SEI
               
                java.lang.Boolean result = port.validarCI(ci);
                java.lang.String pro = port.provincia(ci);
                 out.println("<h3>Resultado = " + result); 
                out.println("<h3>Esta cedula pertenece a la provincia de " +pro);
                 }
             catch (Exception ex) {
// Manejo de excepciones
            }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
}
