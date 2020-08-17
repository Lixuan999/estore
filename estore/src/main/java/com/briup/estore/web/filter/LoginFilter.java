package com.briup.estore.web.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.briup.estore.bean.Customer;


@WebFilter("/user/*")
public class LoginFilter implements Filter {

    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

			//判断当前用户有没有登陆---->customer--->session
			//如果登陆了就放行
			//如果没登陆-->要求用户登陆--->给他返回到login.jsp页面--->给login.jsp页面提示信息
			
			//将请求和响应对象进行类型转换(因为ServletRequest父接口中没有获取session的方法)
			HttpServletRequest req = (HttpServletRequest)request;
			HttpServletResponse resp = (HttpServletResponse)response;
			
			//取出session中的customer对象
			HttpSession session = req.getSession();
			Customer c = (Customer)session.getAttribute("customer");
			
			//获取session中的customer对象进行验证		  
		   if(c==null) {
			   session.setAttribute("msg", "请先登陆");
			   req.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(req, resp);
		   }else{
			   chain.doFilter(req, resp);
		   }
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
