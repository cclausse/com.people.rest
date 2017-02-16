<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="com.people.rest.db.Dbmanager"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DB Test</title>
</head>
<body>


<% 
	Dbmanager db = new Dbmanager();
	Connection conn = db.getConnection();
	if (conn==null){
		out.print("connection failed");
	}
	else {
		out.print("connection success");
	}
 
%>
 	
	
</body>
</html>