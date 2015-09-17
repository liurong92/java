<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>order</title>
</head>
<body>
  <c:forEach items="${order}" var="order">
    ${order.id}
    ${order.orderName}
    ${order.orderPrice}
    ${order.user_id}
  </c:forEach>
</body>
</html>
