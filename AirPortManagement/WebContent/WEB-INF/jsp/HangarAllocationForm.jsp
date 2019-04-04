<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Allocate Hanger</title>
</head>
<body>
hi every one

<springform:form modelAttribute="allocatemodel" method="post" action="AddPlaneIntoHanger.htm">







<table>
 <tr>

 
   	<td>
 plane_id:
<springform:select path="plane_id" items="${planeId}" />

         
 
 
 
 
 
 
 
<%-- <springform:label path="plane_id">plane id:</springform:label>
<td><springform:input path="plane_id"/> --%>
</td>
</tr> 
<tr>
<td><springform:label path="occuFrom">occupancy from date:</springform:label>
<td><springform:input path="occuFrom"/></td>
</tr>
<tr>
<td><springform:label path="occuTill">occupancy till date:</springform:label>
<td><springform:input path="occuTill"/></td>
</tr>
<tr>
<td><springform:label path="hangar_Id">Hanger Id</springform:label></td>
<td><springform:input path="hangar_Id" value="${hangarId}" readonly="true"/></td>
</tr>
<tr>
<td><springform:label path="manager_Id">Manager Id</springform:label></td>
<td><springform:input path="manager_Id" value="${managerId}" readonly="true"/></td>
</tr>

<%-- 
<tr>
<td><springform:label path="manager_Id">manager Id</springform:label></td>
<td><springform:input path="manager_Id" value="${managerId}" disabled="true"/></td>
</tr>


<tr>


<td><springform:label path="availableFrom">available_from_date:</springform:label>
<td><springform:input path="availableFrom"/></td>
</tr>

<tr>
<td><springform:label path="availableTill">available till date:</springform:label>
<td><springform:input path="availableTill"/></td>
</tr>
 --%>
<tr>
<td><input type="submit" value="allocate Plane"></td>
</tr>
</table>
</springform:form>


<br>${status} 
</body>
</html>