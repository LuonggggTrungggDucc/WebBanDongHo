package controller.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import service.BoardnewService;
import service.impl.BoardnewServicesImpl;

//@WebServlet(urlPatterns = { "/admin/new/delete" })
public class BoardnewDeleteController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	BoardnewService boardnewService = new BoardnewServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		boardnewService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/new/list");
	}

}