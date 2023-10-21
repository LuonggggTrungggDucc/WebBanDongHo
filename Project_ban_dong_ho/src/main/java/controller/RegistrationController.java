package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import dao.impl.RegisterDao;
import jdbc.connectDB;
import model.User;

/**
 * Servlet implementation class RegistrationController
 */

public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegistrationController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/view/client/register.jsp");
    	dispatcher.forward(request, response);
    }
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String name = request.getParameter("name");
		String created = request.getParameter("created");

		User user = new User(username, password, email, phone, name, created);

		RegisterDao register = new RegisterDao(connectDB.getConnect());
		if (register.RegisterUser(user)) // On success, you can display a message to user on Home page
		{
			request.setAttribute("Message", "Bạn đã tạo tài khoàn thành công. Mời bạn đăng nhập <a href='/do-an-java/view/client/login'>tại đây!</a>");
			RequestDispatcher rd = request.getRequestDispatcher("/view/client/register.jsp");
			rd.forward(request, response);
		} else {
			request.setAttribute("errMessage", "Tạo tài khoản thất bại. Hãy thử lại !!!");
			RequestDispatcher rd = request.getRequestDispatcher("/view/client/register.jsp");
			rd.forward(request, response);
		}
	}
}
