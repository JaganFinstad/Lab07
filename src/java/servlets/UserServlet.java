/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import Services.RoleService;
import Services.UserService;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Role;
import models.User;
/**
 *
 * @author jagan
 */
public class UserServlet extends HttpServlet {

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                UserService us = new UserService();
                RoleService rs = new RoleService();
        try {
        List<Role> roles = rs.getAll();
        List<User> users = us.getAll();
        request.setAttribute("users", users);
        request.setAttribute("roles", roles);
    } catch (Exception ex) {
        Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
    }
         getServletContext().getRequestDispatcher("/WEB-INF/users.jsp").forward(request, response);
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String 
        RoleService rs = new RoleService();
         try {
            switch (action) {
                case "create":
                    ns.insert(title, contents, email);
                    break;
                case "update":
                    ns.update(Integer.parseInt(noteId), title, contents, email);
                    break;
                case "delete":
                    ns.delete(Integer.parseInt(noteId));
            }
            request.setAttribute("message", action);
        } catch (Exception ex) {
            Logger.getLogger(NoteServlet.class.getName()).log(Level.SEVERE, null, ex);
            request.setAttribute("message", "error");
        }
    }



}
