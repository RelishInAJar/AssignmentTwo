
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/NewCustomerServlet")
public class NewCustomerServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewCustomerServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewCustomerServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String url = "New_customer.jsp";
        
        String firstName = request.getParameter("FirstName");
        String lastName = request.getParameter("LastName");
        String phone = request.getParameter("Phone");
        String address = request.getParameter("Address");
        String city = request.getParameter("City");
        String state = request.getParameter("State");
        String zipcode = request.getParameter("Zipcode");
        String email = request.getParameter("Email");
        
      
        
        if (firstName.isEmpty() || lastName.isEmpty() || phone.isEmpty() || address.isEmpty() || city.isEmpty() || state.isEmpty() || zipcode.isEmpty() || email.isEmpty()) {
            String message;
            message = "Please fill out all of the fields below.";
            request.setAttribute("message", message);
            url = "/New_customer.jsp";
       getServletContext().getRequestDispatcher(url)
               .forward(request, response);
        }
        
        else {
            User user = new User(firstName, lastName, phone, address, city, state, zipcode, lastName+zipcode, "welcome1");
            HttpSession session = request.getSession();
session.setAttribute("user", user);
            url = "/Success.jsp";
       getServletContext().getRequestDispatcher(url)
               .forward(request, response);
        }

        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
