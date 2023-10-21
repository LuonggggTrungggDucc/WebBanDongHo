package controller.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Review;
import service.ReviewService;
import service.impl.ReviewServicesImpl;

public class ReviewListController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	ReviewService reviewService = new ReviewServicesImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Review> reviewList = reviewService.getAll();
		req.setAttribute("reviewlist", reviewList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/show-review.jsp");
		dispatcher.forward(req, resp);
	}
}
