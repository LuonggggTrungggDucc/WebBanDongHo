package controller.admin;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import service.ReviewService;
import service.impl.ReviewServicesImpl;

public class ReviewDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReviewService reviewService =  new ReviewServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		reviewService.delete(Integer.parseInt(id));
		resp.sendRedirect(req.getContextPath() + "/admin/review/list");
	}

}
