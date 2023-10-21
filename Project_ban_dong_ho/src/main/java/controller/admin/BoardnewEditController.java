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

public class BoardnewEditController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BoardnewService boardnewService = new BoardnewServicesImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		Boardnew boardnew = boardnewService.get(Integer.parseInt(id));
		req.setAttribute("boardnew", boardnew);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/editboardnew.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		Boardnew boardnew = new Boardnew();
		boardnew.setId(req.getParameter("new-id"));
		boardnew.setTitle(req.getParameter("new-title"));
		boardnew.setContent(req.getParameter("new-content"));
		boardnew.setImage_link(req.getParameter("new-image_link"));
		boardnew.setAuthor(req.getParameter("new-author"));
		boardnew.setCreated(req.getParameter("new-created"));
		boardnewService.edit(boardnew);
		
		resp.sendRedirect(req.getContextPath()+"/admin/new/list");

	}

}
