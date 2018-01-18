package com.company.servlets.userServlets;

import com.company.repository.UsersRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserDeleteJspServlet extends HttpServlet {
    private UsersRepository usersRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.usersRepository = (UsersRepository) config.getServletContext().getAttribute("usersRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("userDeleteTitle", "Удаление пользователя");
        Long id = Long.parseLong(req.getRequestURI().replaceAll("\\D+", ""));
        req.setAttribute("userId", id);
        req.getRequestDispatcher("/jsp/user/userDelete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if ((req.getParameter("confirm")).equals(new String("yes")))
            usersRepository.delete(Long.parseLong(req.getParameter("id")));
        resp.sendRedirect("/users");
    }
}
