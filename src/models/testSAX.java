package models;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: models
// *****        ******        ******    ***** Project: PAML_SAX
// *****    *    ****    *    ******    ***** Date: 23-Jan-18
// *****    **    **    **    ******    ***** Time: 10:16
// *****    ***        ***    ******    ***** Name: testSAX
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import entities.Employee;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class testSAX
{

    public List<Employee> readFile()
    {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try
        {
            SAXParser sp = spf.newSAXParser();
            MyHandler handler = new MyHandler();
            sp.parse(new File("E:\\FPTProjects\\PAML_SAX\\src\\resources\\Employees.xml"), handler);
            List<Employee> list = handler.getEmployeeList();


            return list;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args)
    {
        testSAX t = new testSAX();
        for (Employee e : t.readFile())
        {
            System.out.println(e.toString());
        }
    }
}
