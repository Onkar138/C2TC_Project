package com.Studentapp.Controller;

import java.io.IOException;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Studentapp.Model.DAOservice;
import com.Studentapp.Model.DAOserviceImpl;

@WebServlet("/listall")
public class GetAllSaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public GetAllSaveController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOservice service=new DAOserviceImpl();
		service.ConnectDB();
		
		ResultSet result = service.listSave();
		
		request.setAttribute("result", result);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/View/list_all.jsp");
		rd.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
