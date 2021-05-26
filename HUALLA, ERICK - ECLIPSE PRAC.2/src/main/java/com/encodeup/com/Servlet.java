package com.encodeup.com;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String message = request.getParameter("message");
    	String number = request.getParameter("number");
    	String sistema = request.getHeader("USER-AGENT");
    	
    	holaMundo bienvenida = new holaMundo();
    	Date fecha = new Date();
    	
    	bienvenida.setMessage(message);
    	bienvenida.setNumControl(number);
    	
    	request.setAttribute("holaMundo", bienvenida);
    	request.setAttribute("fecha", fecha);
    	request.setAttribute("sistema",sistema);
    	
    	RequestDispatcher dispatcher =
    			request.getRequestDispatcher("jsp/welcome.jsp");
    			dispatcher.forward(request, response);
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
