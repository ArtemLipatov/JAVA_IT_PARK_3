package com.company.servlets.productServlets;

import com.company.models.Product;
import com.company.repository.ProductsRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductUpdateJspServlet extends HttpServlet {
    private ProductsRepository productsRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.productsRepository = (ProductsRepository)config.getServletContext().getAttribute("productsRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getRequestURI().replaceAll("\\D+", ""));
        req.setAttribute("product", productsRepository.find(id));
        req.getRequestDispatcher("/jsp/product/productUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String model = req.getParameter("model");
        String description = req.getParameter("description");
        String color = req.getParameter("color");
        String productCode = req.getParameter("productCode");
        int rating = Integer.parseInt(req.getParameter("rating"));
        int price = Integer.parseInt(req.getParameter("price"));

        Product product = Product.builder()
                .name(name)
                .model(model)
                .description(description)
                .color(color)
                .productCode(productCode)
                .rating(rating)
                .price(price)
                .build();

        productsRepository.update(product);
        resp.sendRedirect("/products");
    }
}
