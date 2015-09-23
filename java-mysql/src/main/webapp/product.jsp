<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
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
  <div id="product">
    <div class="product">
      <div class="product-head">
        商品显示
      </div>
      <div class="product-show">
        <c:forEach var="product" items="${products}">
          <form action="/add" method="post">
            <div>
              <label class="product-font">商品名称：</label><c:out value="${product.productName}"/>

              <label class="product-font">商品价格：</label><c:out value="${product.productPrice}"/>
              <input type="submit" value="添加" class="button product-button">
            </div>
            <hr>
          </form>
        </c:forEach>

      </div>
      <form action="/userOrder" method="get">
        <input type="submit" value="订单" class="button product-button order-return"></a>
      </form>
    </div>
  </div>
</body>
