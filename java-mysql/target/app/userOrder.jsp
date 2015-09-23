<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
  <link rel="stylesheet" href="./css/index.css" type="text/css">
  <link rel="stylesheet" href="./css/register.css" type="text/css">
  <link rel="stylesheet" href="./css/userProfile.css" type="text/css">
  <link rel="stylesheet" href="./css/userOrder.css" type="text/css">
  <title>商品显示页面</title>
</head>
  <body>
    <div class="body-self">
      <div class="product">
        <div class="product-head">
          订单信息
        </div>
        <div>
          <table>
            <tr>
              <th>订单ID</th>
              <th>商品名称</th>
              <th>商品价格</th>
              <th>操作</th>
            </tr>
            <c:forEach var="order" items="${orders}">
            <form action="/deleteOrder" method="get">
              <tr>
                <td>
                  <c:out value="${order.id}"/>
                  <input type="hidden" name="orderId" value="<c:out value="${order.id}"/>">
                  <input type="hidden" name="userId" value="<c:out value="${order.user_id}"/>">
                </td>
                <td>
                  <c:out value="${order.orderName}"/>
                </td>
                <td>
                  <c:out value="${order.orderPrice}"/>
                </td>
                <td>
                  <input type="submit" value="删除" class="button product-button">
                </td>
              </tr>
            </form>
            </c:forEach>
          </table>
        </div>

        <div>
          <form action="returnProfile" method="get">
            <input type="submit" value="返回" class="button product-button order-return">
            <input type="hidden" name="userId" value="<c:out value="${userId}"/>">
          </form>
        </div>
      </div>
    </div>
  </body>
</html>
