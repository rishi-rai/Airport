<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="springcore" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="springform" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Plane</title>
</head>
<body>
<springform:form modelAttribute="planemodel" method="post" action="AddPlaneInfo.htm">
<table>
<tr>
<td><springform:label path="plane_id">Plane Id:</springform:label>
<td><springform:input path="plane_id"/>
</td>
</tr>
<tr>
<td><springform:label path="owner_id">owner id:</springform:label>
<td><springform:input path="owner_id"/></td>
</tr>
<tr>
<td><springform:label path="owner_first_name">owner first name:</springform:label>
<td><springform:input path="owner_first_name"/></td>
</tr>

<tr>
<td><springform:label path="owner_last_name">owner last name:</springform:label>
<td><springform:input path="owner_last_name"/></td>
</tr>

<tr>
<td><springform:label path="owner_contact_no">owner contact no:</springform:label>
<td><springform:input path="owner_contact_no"/></td>
</tr>
<tr>
<td><springform:label path="owner_email">owner_email:</springform:label>
<td><springform:input path="owner_email"/></td>
</tr>

<tr>
<td><springform:label path="plane_type">plane type:</springform:label>
<td><springform:input path="plane_type"/></td>
</tr>

<tr>
<td><springform:label path="plane_capacity">plane capacity:</springform:label>
<td><springform:input path="plane_capacity"/></td>
</tr>

<tr>
<td><input type="submit" value="Add Plane"></td>
</tr>
</table>
</springform:form>

</body>
</html>