package com.Studentapp.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Studentapp.Model.DAOservice;
import com.Studentapp.Model.DAOserviceImpl;

@WebServlet("/New")
public class SaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public SaveController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/New.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		if(session.getAttribute("email")!=null) {
		
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		DAOservice service=new DAOserviceImpl();
		service.ConnectDB();
		service.saveDetails(name,city,email,mobile);
		
		request.setAttribute("msg", "Record Save Sucessfully!!");
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/New.jsp");
		rd.forward(request, response);
		}else {
			RequestDispatcher rd = request.getRequestDispatcher("New_Login.jsp");
			rd.forward(request, response);
		}
	}

}
