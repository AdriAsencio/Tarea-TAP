package es.pildorasinformaticas.servletpruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Registrousuarios
 */
@WebServlet("/Registrousuarios")
public class Registrousuarios extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registrousuarios() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter salida=response.getWriter();
	
	salida.println("<html><body>");
	salida.println("<h1>Usuario registrado</h1>");
	salida.println("<br>");
	salida.println("Nombre:" + request.getParameter("nombre"));
	salida.println("<br>");
	salida.println("Apellido: "+ request.getParameter("apellido"));
	salida.println("<br>");
	salida.println("Correo: "+ request.getParameter("correo"));
	salida.println("<br>");
	salida.println("Usuario: "+ request.getParameter("usuario"));
	salida.println("<br>");
	salida.println("Contraseña: "+ request.getParameter("contrase"));
	salida.println("<br>");
	salida.println("Telefono: "+ request.getParameter("telefono"));
	salida.println("</body></html>");
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
