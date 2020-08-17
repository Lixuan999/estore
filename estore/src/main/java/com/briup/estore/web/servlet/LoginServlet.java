package com.briup.estore.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.estore.bean.Customer;
import com.briup.estore.bean.ShopCar;
import com.briup.estore.service.ICustomerService;
import com.briup.estore.service.impl.CustomerServiceImpl;


@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		
		ICustomerService custservice = new CustomerServiceImpl();
		
		String url = "";
		try {
			Customer customer = custservice.login(name, password);
			ShopCar car = new ShopCar();
			HttpSession session = request.getSession();
			session.setAttribute("customer", customer);
			session.setAttribute("car", car);
			url = "/toIndexServlet";
		} catch (Exception e) {
			url = "/WEB-INF/jsp/login.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
