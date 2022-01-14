<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="header"><h1>Register Student</h1></div>
    <div class= "content">
    <form action="updateOneStudent" method="post">
       <div>
         <label for="name">Name :</label>
         <input type="text" id="name" name="name" value="${Student.name }"/>
         <label for="lastname">Last Name :</label>
         <input type="text" id="lastname" name="lastname" value="${Student.lastname }"/>
         <label for="address">Student Address :</label>
         <input type="text" id="address" name="address" value="${Student.address }"/>
         <label for="phone">Phone Number :</label>
         <input type="text" id="phone" name="phone" value="${Student.phone }"/>
         <label for="faculty">Faculty :</label>
         <input type="text" id="faculty" name="faculty" value="${Student.faculty }"/>
         <label for="dob">Date of Birth :</label>
         <input type="date" id="dob" name="DOB" value="${Student.DOB }"/>
         
       </div>
       <input type="submit" value="Submit">
    </form>
    </div>
</body>
</html>