<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>sql:query Tag</title>
</head>
<body>

	<sql:setDataSource var="db" driver="oracle.jdbc.driver.OracleDriver"
		url="jdbc:oracle:thin:@10.155.109.186:1521:XE" user="amsuser"
		password="amsuser" />

	<sql:query dataSource="${db}" var="rs">  
select*from planes  
</sql:query>

	<table border="2" width="100%">
		<tr>
			<th>Plane ID</th>
			<th>owner ID</th>
			<th>owner first name</th>
			<th>owner last name</th>
			<th>owner contact no</th>
			<th>owner email</th>
			<th>plane type</th>
			<th>plane capacity</th>
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<td><c:out value="${table.plane_id}" /></td>
				<td><c:out value="${table.owner_id}" /></td>
				<td><c:out value="${table.owner_first_name}" /></td>
				<td><c:out value="${table.owner_last_name}" /></td>
				<td><c:out value="${table.owner_contact_no}" /></td>	
				<td><c:out value="${table.owner_email}" /></td>	
				<td><c:out value="${table.plane_type}" /></td>	
				<td><c:out value="${table.plane_capacity}" /></td>	
				
				<%-- <td>
				<form action="ViewDescriptionServlet" method ="post" >
				<input type="checkbox" name="productId" value="${table.product_id}">
				<input type="submit" value="view">
				</form></td> --%>
			</tr>
		</c:forEach>
	</table>
	<!-- <form action ="LogoutServlet" method="post" >
	<input type="submit" value="Logout">
	</form>
	<form action ="ViewToAddProductservlet" method="post" >
	<input type="submit" value="add product">
	</form>
 -->
</body>
</html>