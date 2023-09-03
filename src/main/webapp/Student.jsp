<%@page import="com.Kamil.Model.Student"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Student student = (Student)request.getAttribute("student");

%>

        <c:choose>
            <c:when test = "${student != null}">
                 <p>Student is:  <c:out value = "${student}"/><p>
                <br />
            </c:when>
            <c:otherwise>
                 <p>There is no student with this id!<p>
                <br />
            </c:otherwise>
        </c:choose>

</body>
</html>