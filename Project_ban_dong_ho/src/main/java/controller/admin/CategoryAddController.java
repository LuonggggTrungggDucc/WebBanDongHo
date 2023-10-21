package controller.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import service.CategoryService;
import service.impl.CategoryServicesImpl;
import model.Catalog;

/**
 * Servlet implementation class CategoryAddController
 */
//@WebServlet(urlPatterns = { "" })
public class CategoryAddController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CategoryService cateService = new CategoryServicesImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/addcate.jsp");
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
	    String cate_name = req.getParameter("cate-name");
		String cate_parent_id = req.getParameter("parent-id");
		Catalog category = new Catalog();
		category.setName(cate_name);
		category.setParent_id(cate_parent_id);
		cateService.insert(category);
		resp.sendRedirect(req.getContextPath() + "/admin/cate/list");
	}

}
