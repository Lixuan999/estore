package com.briup.estore.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.briup.estore.bean.Book;
import com.briup.estore.service.impl.BookServiceImpl;


@WebServlet("/toListServlet")
public class ToListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cateId = Integer.parseInt(request.getParameter("id"));
		
		BookServiceImpl bookservice = new BookServiceImpl();
		List<Book> booklist = bookservice.selectBookByCateId(cateId);
		List<Book> topBooklist = bookservice.selectBookByCateIdAndClick(cateId);
		
		request.setAttribute("booklist", booklist);
		request.setAttribute("topBooklist", topBooklist);
		
		request.getRequestDispatcher("/WEB-INF/jsp/list.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
