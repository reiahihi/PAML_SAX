package controller;// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: "${PACKAGE_NAME}"
// *****        ******        ******    ***** Project: PAML_SAX
// *****    *    ****    *    ******    ***** Date: 23-Jan-18
// *****    **    **    **    ******    ***** Time: 11:02
// *****    ***        ***    ******    ***** Name: ${NAME}
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************


import entities.Employee;
import models.MyHandler;
import models.testSAX;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ListServlet", urlPatterns = {"/ListServlet"})
public class ListServlet extends HttpServlet
{
    testSAX t = new testSAX();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String check = request.getParameter("check");
        String iText = request.getParameter("iText");
        List<Employee> temp = new ArrayList<>();
        if ( iText.length() <1)
        {
            temp = t.readFile();
        }
        else
        {
            if ( check.equalsIgnoreCase("1"))
            {
                for (Employee e : t.readFile())
                {
                    if (e.getId() == Integer.parseInt(iText))
                    {
                        temp.add(e);
                    }
                }
            }
            else
            {
                for (Employee e : t.readFile())
                {
                    if (e.getName().contains(iText))
                    {
                        temp.add(e);
                    }
                }
            }
        }
        request.setAttribute("list" , temp);
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        System.out.println(t.readFile().size());
        request.setAttribute("list", t.readFile());
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
