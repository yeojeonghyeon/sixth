<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<p> ${param.paramName} ${param.paramAge}. </p>
<ul>
<c:forEach var="customer" items="${customers}">
	<li>${customer.custId} ${customer.custNm}</li>
</c:forEach>
</ul>
</body>
</html>
