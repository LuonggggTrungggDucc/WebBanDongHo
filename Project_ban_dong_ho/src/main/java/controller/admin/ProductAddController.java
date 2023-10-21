package controller.admin;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Catalog;
import model.Product;
import service.CategoryService;
import service.ProductService;
import service.impl.CategoryServicesImpl;
import service.impl.ProductServiceImpl;

public class ProductAddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService productService = new ProductServiceImpl();


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CategoryService cateService = new CategoryServicesImpl();
		List<Catalog> cateList = cateService.getAll();
		req.setAttribute("catelist", cateList);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/view/admin/addproduct.jsp");
		dispatcher.forward(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=UTF-8");
			String product_cate = req.getParameter("product-cate");
			String product_name = req.getParameter("product-name");
			String product_price = req.getParameter("product-price");
			String product_status = req.getParameter("product-status");
			String product_desc = req.getParameter("product-desc");
			String product_content = req.getParameter("product-content");
			String product_discount = req.getParameter("product-discount");
			String product_image = req.getParameter("product-image");
			String product_day = req.getParameter("product-day");

			Product product = new Product();
			product.setCatalog_id(product_cate);
			product.setName(product_name);
			product.setPrice(product_price);
			product.setStatus(product_status);
			product.setDescription(product_desc);
			product.setContent(product_content);
			product.setDiscount(product_discount);
			product.setImage_link(product_image);
			product.setCreated(product_day);
			productService.insert(product);
			resp.sendRedirect(req.getContextPath() + "/admin/product/list");

	}
}
