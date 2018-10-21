/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
@WebServlet(urlPatterns = {"/membership"})
public class MembershipServlet extends HttpServlet {

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
        
        if(action!= null && !action.isEmpty()){
        if (action.equals("login")) {
            getServletContext().getRequestDispatcher("/jsp/login.jsp").forward(request, response); 
        }
        else if (action.equals("signup")){
            getServletContext().getRequestDispatcher("/jsp/signup.jsp").forward(request,response);
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
            out.println("<h2> Error! The action parameter is required. It must equal signup or login");
            out.println("</body>");
            out.println("</html>");
        }
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
      
     String firstName = request.getParameter("firstName");
     String lastName = request.getParameter("lastName");
     String email = request.getParameter("email");
     String password = request.getParameter("password");
     
     if ( firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                
                message = "Please fill out all of the fields<br>";
                message += "You are missing: ";
                if( firstName.isEmpty()){
                    message += "first name, ";
                }
                
                if(lastName.isEmpty()){
                    message += "last name, ";
                }
                
                if(email.isEmpty()){
                    message += "email, ";
                }
                
                if(password.isEmpty()){
                    message += "password, ";
                }
                
                
        } else {
             
            // the user entered their info correctly in the JSP part
            
            User newUser = new User();
                newUser.setFirstName(firstName);
                newUser.setLastName(lastName);
                newUser.setEmail(email);
                newUser.setPassword(password);
                
            
           HttpSession session = request.getSession();
           session.setAttribute("UserData", newUser);
           
        // create users list and store it in the session.
        ArrayList<User> users = new ArrayList<>();
        session.setAttribute("newUser", users);
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
