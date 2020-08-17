package com.briup.estore.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.estore.bean.Book;
import com.briup.estore.bean.OrderLine;
import com.briup.estore.bean.ShopCar;
import com.briup.estore.service.IBookService;
import com.briup.estore.service.impl.BookServiceImpl;


@WebServlet("/user/addShopCarServlet")
public class AddShopCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.接收来自于前台的参数--->id  num
		String id = request.getParameter("id");
		String num = request.getParameter("num");
		//2.调用service去根据id查找书籍信息---->book
		IBookService bookservice = new BookServiceImpl();
		Book book = bookservice.selectBookById(Integer.parseInt(id));
		//3.有了book的信息  有了num --> orderline
		OrderLine line = new OrderLine();
		line.setBook(book);
		line.setNum(Integer.parseInt(num));
		line.setCost(book.getPrice()*line.getNum());
		//4.获取购物车
		HttpSession session = request.getSession();
		ShopCar car = (ShopCar) session.getAttribute("car");
		
		if(car!=null) {
			car.addShopCar(line);
			request.getRequestDispatcher("/WEB-INF/user/shopCar.jsp").forward(request, response);
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
