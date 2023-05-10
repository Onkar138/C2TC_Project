package com.Studentapp.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Studentapp.Model.DAOservice;
import com.Studentapp.Model.DAOserviceImpl;

@WebServlet("/New_Login")
public class Login_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login_Controller() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		DAOservice service=new DAOserviceImpl();
		service.ConnectDB();
		boolean status = service.VerifyLogin(email, password);
		
		if (status==true) {
			HttpSession session = request.getSession(true);
			session.setAttribute("email", email);
			
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/New.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("error", "Invalide Username/Password");
			
			RequestDispatcher rd = request.getRequestDispatcher("New_Login.jsp");
			rd.forward(request, response);
		}
	}

}
