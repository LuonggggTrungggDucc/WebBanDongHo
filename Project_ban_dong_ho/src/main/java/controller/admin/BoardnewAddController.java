package controller.admin;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Boardnew;
import service.BoardnewService;
import service.impl.BoardnewServicesImpl;
public class BoardnewAddController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BoardnewService boardnewService = new BoardnewServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/addboardnew.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		String new_title = req.getParameter("new-title");
		String new_content = req.getParameter("new-content");
		String new_image_link = req.getParameter("new-image_link");
		String new_author = req.getParameter("new-author");
		String new_created = req.getParameter("new-created");
		Boardnew boardnew = new Boardnew();
		boardnew.setTitle(new_title);
		boardnew.setContent(new_content);
		boardnew.setImage_link(new_image_link);
		boardnew.setAuthor(new_author);
		boardnew.setCreated(new_created);
		boardnewService.insert(boardnew);
		resp.sendRedirect(req.getContextPath() + "/admin/new/list");
	}

}
