package controller.admin;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;
import service.impl.UserServicesImpl;

public class UserAddController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UserService userService = new UserServicesImpl();


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/adduser.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		String user_name = req.getParameter("user-name");
		String user_email = req.getParameter("user-email");
		String user_phone = req.getParameter("user-phone");
		String user_userName = req.getParameter("user-userName");
		String user_password = req.getParameter("user-password");
		String user_created = req.getParameter("user-created");
		
		
		User user = new User();
		user.setName(user_name);
		user.setEmail(user_email);
		user.setPhone(user_phone);
		user.setUsername(user_userName);
		user.setPassword(user_password);
		user.setCreated(user_created);
		userService.insert(user);
		resp.sendRedirect(req.getContextPath() + "/admin/user/list");
		//resp.sendRedirect(req.getContextPath() + "/view/admin/user.jsp");
	}

}
