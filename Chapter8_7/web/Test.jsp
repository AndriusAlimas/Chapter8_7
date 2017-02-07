<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Result</title>
</head>
<body>
	  <!--  If the thing to left of the bracket is an array or a List, 
	  and the index is a String literal, the index is coerced to an int-->
	    Music array : ${musicList}
	    <hr>
		First song is: ${musicList[0]}
		<br>
		Second song is: ${musicList["1"]}
		<hr>
		Food Array List: ${foodList}
		<hr>
		First food is : ${foodList["0"]}
		<br>
		Third food is : ${foodList["2"]}
		<hr>
		<%-- Second food is: ${foodList["one"]} Compile Error --%>
</body>
</html>