package servelet;

import dao.ProductDao;
import entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CreateNewProductServlet",urlPatterns = "/create-product")

public class CreateNewProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDao dao = new ProductDao();


        ProductEntity product = new ProductEntity(
                request.getParameter("name"),
                request.getParameter("brand"),
                Integer.parseInt(request.getParameter("price")),
                request.getParameter("description")
        );

        dao.insertProduct(product);

        response.sendRedirect("home");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("new-product.jsp").forward(request, response);
    }
}
