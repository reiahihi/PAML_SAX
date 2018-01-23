package models;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: models
// *****        ******        ******    ***** Project: PAML_SAX
// *****    *    ****    *    ******    ***** Date: 23-Jan-18
// *****    **    **    **    ******    ***** Time: 09:54
// *****    ***        ***    ******    ***** Name: MyHandler
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

import entities.Employee;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class MyHandler extends DefaultHandler
{
    public List<Employee> getEmployeeList()
    {
        return employeeList;
    }

    private List<Employee> employeeList ;
    private Employee e;

    private boolean bAge = false;
    private boolean bName = false;
    private boolean bGender = false;
    private boolean bRole = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException
    {
        if (qName.equalsIgnoreCase("Employee"))
        {
            String id = attributes.getValue("id");
            e = new Employee();
            e.setId(Integer.parseInt(id));
            if (employeeList == null)
            {
                employeeList = new ArrayList<>();
            }

        }
        else if (qName.equalsIgnoreCase("name"))
        {
            bName = true;
        }
        else if (qName.equalsIgnoreCase("age"))
        {
            bAge = true;
        }
        else if (qName.equalsIgnoreCase("gender"))
        {
            bGender = true;
        }
        else if (qName.equalsIgnoreCase("role"))
        {
            bRole = true;
        }
    }



    @Override
    public void characters(char[] ch, int start, int length) throws SAXException
    {
        if (bAge)
        {
            e.setAge(Integer.parseInt(new String(ch, start, length)));
            bAge = false;
        }
        else if (bName)
        {
            e.setName(new String(ch, start, length));
            bName = false;
        }
        else if (bGender)
        {
            e.setGender(new String(ch, start, length));
            bGender = false;
        }
        else if (bRole)
        {
            e.setRole(new String(ch, start, length));
            bRole = false;
        }




    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException
    {
        if (qName.equalsIgnoreCase("Employee"))
        {
            employeeList.add(e);
        }
    }
}
