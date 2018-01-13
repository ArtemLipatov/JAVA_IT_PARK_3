package com.company.servlets.productServlets;

import com.company.repository.ProductsRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ProductDeleteJspServlet extends HttpServlet{
    private ProductsRepository productsRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.productsRepository = (ProductsRepository)config.getServletContext().getAttribute("productsRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("productDeleteTitle", "Удаление товара");
        Long id = Long.parseLong(req.getRequestURI().replaceAll("\\D+", ""));
        req.setAttribute("productId", id);
        req.getRequestDispatcher("/jsp/product/productDelete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ((req.getParameter("confirm")).equals(new String("yes")))
            productsRepository.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect("/productSave");
    }
}
