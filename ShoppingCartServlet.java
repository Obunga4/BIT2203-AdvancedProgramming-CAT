import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/cart")
public class ShoppingCartServlet extends HttpServlet {
    @SuppressWarnings("unchecked")
    private List<String> getCart(HttpSession session) {
        List<String> cart = (List<String>) session.getAttribute("cart");
        if (cart == null) {
            cart = new ArrayList<>();
            session.setAttribute("cart", cart);
        }
        return cart;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String item = request.getParameter("item");
        getCart(request.getSession()).add(item);
        response.sendRedirect("cart");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        List<String> cart = getCart(request.getSession());
        response.setContentType("text/html");
        response.getWriter().println("<h2>Shopping Cart</h2>");
        for (String item : cart) {
            response.getWriter().println("<p>" + item + "</p>");
        }
    }
}