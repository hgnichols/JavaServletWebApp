/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Dkmar
 */
@WebServlet(urlPatterns = {"/productManagement"})
public class ProductManagementServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String action = request.getParameter("action");
        String url = "/index.jsp";
        
        if(action!= null && !action.isEmpty()){
        if (action.equals("displayProducts")) {
            getServletContext().getRequestDispatcher("/jsp/products.jsp").forward(request, response); 
        }
        else if (action.equals("addProduct")){
            getServletContext().getRequestDispatcher("/jsp/product.jsp").forward(request,response);
        }
        else if (action.equals("displayProduct")){
            getServletContext().getRequestDispatcher("/jsp/product.jsp").forward(request,response);
        }
        else if (action.equals("deleteProduct")){
            getServletContext().getRequestDispatcher("/jsp/confirmDelete.jsp").forward(request,response);
        }
        }
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Project Management Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Action is " + action + "</h1>");
            out.println("<h2> Error! The action parameter is required. It must equal displayProducts, addProduct,"
                    + "displayProduct, or deleteProduct");
            out.println("</body>");
            out.println("</html>");
        }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        
        String message;
        String code = request.getParameter("code");
        String description = request.getParameter("description");
        double price = Double.parseDouble(request.getParameter("price"));
        
        // Validate double input
        
        try{
        price = Double.parseDouble(request.getParameter("price"));
         }catch (NumberFormatException ex) {
         System.out.println("Exception caught, incorrect double input");
         throw ex;
}
        
        if (code.isEmpty() || description.isEmpty() || price < 0){
                
                message = "Please fill out all of the fields<br>";
                message += "You are missing: ";
                if( code.isEmpty()){
                    message += "code, ";
                }
                
                if(description.isEmpty()){
                    message += "description, ";
                }
                
                if(price < 0){
                    message += "price, ";
                }
               
                
                
        } else {
             
            // the user entered their info correctly in the JSP part
            
            Product newProduct = new Product();
                newProduct.setCode(code);
                newProduct.setDescription(description);
                newProduct.setPrice(price);
                
            
           HttpSession session = request.getSession();
           session.setAttribute("ProductData", newProduct);
           
        // create product list and store it in the session.
        ArrayList<Product> products = new ArrayList<>();
        products.add(newProduct);
        session.setAttribute("newProduct", products);
        
     }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
