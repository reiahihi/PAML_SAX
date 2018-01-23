package entities;

// ****************************************** ************************************
// **************************    ************ User: MiTom
// *****************************    ********* Phone: 0966 941 840
// ********************************    ****** Email: 
// ****************************************** ************************************
// *****       ********       ******    ***** Package: entities
// *****        ******        ******    ***** Project: PAML_SAX
// *****    *    ****    *    ******    ***** Date: 23-Jan-18
// *****    **    **    **    ******    ***** Time: 09:48
// *****    ***        ***    ******    ***** Name: Employee
// *****    **************    ******    ***** ************************************
// *****    **************    ******    ***** Created by IntelliJ IDEA.
// ****************************************** ************************************

public class Employee
{
    private int id;
    private String name;
    private int age;
    private String gender;
    private String role;

    public Employee()
    {
    }

    public int getId()
    {

        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getRole()
    {
        return role;
    }

    @Override
    public String toString()
    {
        return "id: " + id + " - name: " + name + " - Age: " +age + " - Gender: " + gender + " - Role: " + role;
    }

    public void setRole(String role)
    {
        this.role = role;
    }
}
