/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T-101
 */
public class ServletAutenticar extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Todo esto es un servlet
        //El servlet jamas debe de ser visto ya que este esta en el controlador
        //Su unica tarea es obtener informacion y pasarsela al model para que la verifique
        /*
        El servlet solo pregunta si la autentucacion es correcta
        Tiene la capa de persistencia y transaccional
        Patron de diseño DAO = Data Acces Object
        Se encarga de acceder a los datos conjntamente con la capa de persistencia y la capa transaccional
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        */        
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        //out.println("El login es " +  login + "\nEl password es: "+ password);
    }
}    