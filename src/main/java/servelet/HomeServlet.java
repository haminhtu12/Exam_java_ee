package servelet;

import dao.ProductDao;
import entity.ProductEntity;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet",urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {
    ProductDao dao = new ProductDao();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductEntity> products = getAllProduct();
        request.setAttribute("products", products);
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
    private List<ProductEntity> getAllProduct() {
        List<ProductEntity> products = dao.getAll();
        for (ProductEntity p : products) {
            System.out.println("Product: "+p.getName());
        }
        return products;
    }
    private void insertProduct() {

//        for (int i = 0; i < 10; i++) {
//            ProductEntity p = new ProductEntity("Iphone "+i, 300+i*100, 10, 1);
//            dao.insertProduct(p);
//        }
    }
}
