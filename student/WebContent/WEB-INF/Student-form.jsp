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
    <form action="saveStudent" method="post">
       <div>
         <label for="username">Student Number :</label>
         <input type="text" id="username" name="studentnumber"/>
         <label for="name">Name :</label>
         <input type="text" id="name" name="name"/>
         <label for="lastname">Last Name :</label>
         <input type="text" id="lastname" name="lastname"/>
         <label for="address">Student Address :</label>
         <input type="text" id="address" name="address"/>
         <label for="phone">Phone Number :</label>
         <input type="text" id="phone" name="phone"/>
         <label for="faculty">Faculty :</label>
         <input type="text" id="faculty" name="faculty"/>
         <label for="dob">Date of Birth :</label>
         <input type="date" id="dob" name="DOB"/>
         
       </div>
       <input type="submit" value="Submit">
    </form>
    </div>
</body>
</html>