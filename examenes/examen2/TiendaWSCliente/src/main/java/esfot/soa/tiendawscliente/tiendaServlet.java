/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esfot.soa.tiendawscliente;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import static java.util.Collections.list;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author Usuario
 */
@WebServlet(name = "tiendaServlet", urlPatterns = {"/tiendaServlet"})
public class tiendaServlet extends HttpServlet {
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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet tiendaServlet</title>");            
            out.println("</head>");
            out.println("<body >");
            out.println("<h1>Servlet tiendaServlet at " + request.getContextPath() + "</h1>");
            esfot.soa.TiendaDvdWS_Service servicio = new esfot.soa.TiendaDvdWS_Service();
            esfot.soa.TiendaDvdWS port = servicio.getTiendaDvdWSPort();
             String nombre= request.getParameter("director");
            List<esfot.soa.PeliculaTO> listaresuesta = port.buscaDirector(nombre);
            out.println("<h1>Resultados: </h1>");
            if(!listaresuesta.isEmpty()){
                
                for (esfot.soa.PeliculaTO pe : listaresuesta) {
                out.println("<p><b> Director:</b>" + pe.getDirector() + "</p>");
                out.println("<p><b> Titulo:</b>" + pe.getTitulo() + "</p>");
                out.println("<p><b> Precio:</b>" + pe.getPrecio() + "</p>");
            }
                
                
            }else{
             out.println("<h1>Error Parametro no encontrado</h1>");
            }
            
            out.println("</body>");
            out.println("</html>");
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
