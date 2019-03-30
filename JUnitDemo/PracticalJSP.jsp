<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.sql.*"%>
    <%@ page import="java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
String FirstName=request.getParameter("txtusername");
String Password=request.getParameter("txtpassword");
session.setAttribute("session-uid", FirstName);
	
   PreparedStatement ps;
    try 
   {
    Class.forName("com.mysql.jdbc.Driver");
    Connection con =DriverManager.getConnection("jdbc:MySql://localhost:3307/mysqljdbc","root","root");
    ps = con.prepareStatement("select FirstName,Password from customerregister where FirstName = ? and Password=?");
                            
        if (FirstName.equals("txtusername") && Password.equals("txtpassword")) 
        {
         response.sendRedirect("PracticalLoginPage.html");
        }
        else
        {
        	 out.println("Invalid User");
        }
    
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
%>

</body>
</html>