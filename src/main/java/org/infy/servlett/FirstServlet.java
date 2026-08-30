package org.infy.servlett;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet("/first")
public class FirstServlet implements Servlet {

    public ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig=servletConfig;
        System.out.println("FirstServlet init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return this.servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("FirstServlet service");
    }

    @Override
    public String getServletInfo() {
        return "created by me";
    }

    @Override
    public void destroy() {
        System.out.println("FirstServlet destroy");

    }
}
