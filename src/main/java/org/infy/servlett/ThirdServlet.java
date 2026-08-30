package org.infy.servlett;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException{
        System.out.println("Third Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String message=req.getParameter("message");
        System.out.println("Third Post Servlet");
        System.out.println(message);

        res.setContentType("text/html");
        PrintWriter writer=res.getWriter();
        writer.print("<h1>Third Post Servlet</h1>");
        Date date=new Date();
        writer.print("""
                <h2>Message Heelo: %s</h2>
                <h2>Current Date is : %s</h3>
                """.formatted(message,date));
    }


}
