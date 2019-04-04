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
select*from hangar_status  
</sql:query>

	<table border="2" width="100%">
		<tr>
			<th>Hanger ID</th>
			<th>Manager ID</th>
			<th>Status</th>
			<th>Occupancy from date</th>
			<th>Occupancy till date</th>
			<th>Available from date</th>
			<th>Available till date</th>
			
		</tr>
		<c:forEach var="table" items="${rs.rows}">
			<tr>
				<td><c:out value="${table.hangar_id}" /></td>
				<td><c:out value="${table.manager_id}" /></td>
				<td><c:out value="${table.status}" /></td>
				<td><c:out value="${table.occupancy_from_date}" /></td>
				<td><c:out value="${table.occupancy_till_date}" /></td>	
				<td><c:out value="${table.available_from_date}" /></td>	
				<td><c:out value="${table.available_till_date}" /></td>	
				
				
				<a href="allocateplaneviewform.htm?hangarId=${table.hangar_id}&managerId=${table.manager_id}">allocation</a>
			
				
			</tr>
		</c:forEach>
	</table>
	
</body>
</html>