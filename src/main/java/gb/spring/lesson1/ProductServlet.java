package gb.spring.lesson1;

import clases.Product;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = {"/products"})

public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        resp.getWriter().write("<h3>" + new Product(1, "Яблоко", 5) +"</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(2, "Груша", 8) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(3, "Слива", 10) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(4, "Арбуз,", 12) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(5, "Вишня", 7) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(6, "Лимон", 16) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(7, "Виноград", 22) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(8, "Орех", 10) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(9, "Банан", 25) + "</h3>" + "\n");
        resp.getWriter().write("<h3>" + new Product(10, "Апельсин", 15) + "</h3>" + "\n");
    }
}
