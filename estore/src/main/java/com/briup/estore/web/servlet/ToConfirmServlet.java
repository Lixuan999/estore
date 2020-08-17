package com.briup.estore.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.estore.bean.Customer;
import com.briup.estore.bean.ShopAddress;
import com.briup.estore.bean.ShopCar;
import com.briup.estore.service.IShopAddressService;
import com.briup.estore.service.impl.ShopAddressServiceImpl;


@WebServlet("/user/toConfirmServlet")
public class ToConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//从session中获取customer
		HttpSession session = request.getSession();
		Customer customer = (Customer) session.getAttribute("customer");
		//根据用户id查询所有的地址信息
		IShopAddressService addressService = new ShopAddressServiceImpl();
		List<ShopAddress> addressList = addressService.findAddressBycustId(customer.getId());
		request.setAttribute("addressList", addressList);
		//跳转到confirm.jsp
		request.getRequestDispatcher("/WEB-INF/user/confirm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
