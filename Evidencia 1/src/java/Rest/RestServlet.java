/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rest;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nealg
 */

@WebServlet(name = "RestServlet", urlPatterns = {"/RestServlet"})
public class RestServlet extends HttpServlet {

    static String a;
    static String b;
    static String c;
    static String d;
    static String f;
    private Object Rest;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            
            String a = request.getParameter("Usuario");
            String b = request.getParameter("contrasena");
            String c = request.getParameter("Nombre");
            String d = request.getParameter("sexo");
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
            int e = Integer.valueOf(request.getParameter("edad"));
            if (e >= 15) {
                String f = String.valueOf(e);
                this.f=f;
                Rest.UserResource o = new Rest.UserResource();
                o.listarUsuario(a,b,c,d,f);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>JSP Page</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>se guerdaron los dstos </h1>");
                out.println("<a href=\"Usuario.jsp\">Calcular IMC</a>");
                out.println("</body>");
                out.println("</html>");
            } else {
                
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>JSP Page</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>tu edad debe ser mayor a 15 </h1>");
                out.println("<a href=\"index.jsp\">hacer otro calculo</a>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
