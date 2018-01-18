package com.company.servlets.userServlets;

import com.company.models.User;
import com.company.repository.UsersRepository;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserUpdateJspServlet extends HttpServlet {
    private UsersRepository usersRepository;

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.usersRepository = (UsersRepository)config.getServletContext().getAttribute("usersRepository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getRequestURI().replaceAll("\\D+", ""));
        req.setAttribute("user", usersRepository.find(id));
        req.getRequestDispatcher("/jsp/user/userUpdate.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        User user = User.builder()
                .name(name)
                .email(email)
                .password(password)
                .build();

        usersRepository.update(user);
        resp.sendRedirect("/users");
    }
}
