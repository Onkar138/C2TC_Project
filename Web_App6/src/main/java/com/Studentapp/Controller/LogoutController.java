package com.Studentapp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LogOut")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LogoutController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*HttpSession session = request.getSession(false);
		session.invalidate();				//Destroy the session
		
		RequestDispatcher rd = request.getRequestDispatcher("New_Login.jsp");
		rd.forward(request, response);*/
		
		HttpSession session = request.getSession(false);
		if(session.getAttribute("email")!=null) {
			try {
			session.invalidate();
			RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/Logout.jsp");
			rd.forward(request, response);
			} catch (Exception e) {
			e.printStackTrace();
			}
			} else {
			RequestDispatcher rd = request.getRequestDispatcher("New_Login.jsp");
			rd.forward(request, response);
			}
	}

}
