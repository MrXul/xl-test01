package com.shsxt.web;

 
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shsxt_service.UserService;


@WebServlet(urlPatterns="/userAction.do")
public class UserAction extends HttpServlet {

    /**
     * 
     */
    private static final long serialVersionUID = 1661933106038150349L;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        System.out.println("user servlet 被访问。。。");
        UserService.add();  
    }
}	 

