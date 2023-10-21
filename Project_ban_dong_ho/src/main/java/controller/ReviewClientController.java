package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Review;
import service.ReviewService;
import service.impl.ReviewServicesImpl;

public class ReviewClientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ReviewService reviewService = new ReviewServicesImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher dispatcher = req.getRequestDispatcher(req.getContextPath() + "/view/client/product-detail?id=" +req.getParameter("id"));
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=UTF-8");
		String id = req.getParameter("id");
		System.out.println("thử: " + id);
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String content = req.getParameter("content");
		long millis=System.currentTimeMillis();  
		java.sql.Date date=new java.sql.Date(millis);  
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String today = df.format(date);
		Review review = new Review();
		review.setName(name);
		review.setEmail(email);
		review.setProduct_id(id);
		review.setContent(content);
		review.setCreated(today);
		System.out.println("thử tostring: " + review);
		reviewService.insert(review);
		resp.sendRedirect(req.getContextPath() + "/view/client/product-detail?id=" + id);
	}
}
