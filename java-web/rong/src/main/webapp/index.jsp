<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
  <table>
    <tr>
      <th>Id</th>
      <th>name</th>
      <th>age</th>
    </tr>
    <c:forEach var="user" items="${students}">
      <tr>
        <td>${user.ID}</td>
        <td>${user.NAME}</td>
        <td>${user.AGE}</td>
      </tr>
    </c:forEach>
  </table>


</body>
</html>
