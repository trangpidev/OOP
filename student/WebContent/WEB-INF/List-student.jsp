<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/SV.css">
</head>
<body>
       <div id="container">
        <h3>Hello UserName: ${username}</h3>
    </div>
    <div id="wrapper">
        <div id="header">
            <h2>Simple Student List </h2>
        </div>
    </div>
    <input type="button" value="Add Student" class="add-button" onclick="window.location.href='addstudent';return false;"/>

    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Last Name</th>
            <th>Phone</th>
            <th>Address</th>
            <th>Faculty</th>
            <th>DoB</th>
            <th>Action</th>
        </tr>
    <c:forEach var="tempStudent" items="${Student}">
        <c:url var="updateLink" value="updateStudent">
            <c:param name="studentID" value="${tempStudent.studentnumber}"/>
        </c:url>

	    <c:url var="deleteLink" value="deleteStudent">
	        <c:param name="studentID" value="${tempStudent.studentnumber}"/>
	    </c:url>
   		 <tr>
	        <td>${tempStudent.studentnumber}</td><td>${tempStudent.name}</td>
	        <td>${tempStudent.lastname}</td><td>${tempStudent.phone}</td>
	        <td>${tempStudent.address}</td><td>${tempStudent. faculty}</td>
	        <td><c:set var="Date" value="${tempStudent.DOB}" />
	        <fmt:formatDate type = "date" value = "${Date}" /></td>
	        <td>
	        <a href="${updateLink}">Update</a> | <a href="${deleteLink}" onclick="if(!(confirm( 'Ban chac chan muon xoa khong?'))) return false">Delete</a>
	        </td>
    	</tr>
    </c:forEach>
       </table>
</body>
</html>