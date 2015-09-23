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
    <div>
      <div>
        <div class="useProfile">
          <form action="/updateUser" method="post">
            <div class="head">
              用户信息页面
            </div>
            <div class="format">
              <div>
                <label>用&nbsp;&nbsp;户&nbsp;&nbsp;ID：</label>
                <label class="label-text"><c:out value="${user.id}"/> </label>
                <input type="hidden" name="userId" value="<c:out value="${user.id}"/> ">
              </div>
              <div>
                <label>用&nbsp;&nbsp;户&nbsp;&nbsp;名：</label>
                <label class="label-text"><c:out value="${user.userName}"/></label>
                <input type="hidden" name="userName" value="<c:out value="${user.userName}"/>">
              </div>
              <div>
                <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
                <input type="password" name="password" class="login-text" value="<c:out value="${user.password}"/>">
              </div>
              <div class="password-message userProfile-text">
                长度不能少于6位
              </div>
              <div>
                <label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
                <input name="trueName" class="login-text" value="<c:out value="${user.trueName}"/>">
              </div>
              <div>
                <label>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</label>
                <input type="text" name="userAge" class="login-text" value="<c:out value="${user.userAge}"/>">
              </div>
              <div>
                <label>电子邮箱：</label>
                <label class="label-text"><c:out value="${user.email}"/></label>
                <input type="hidden" name="email" value="<c:out value="${user.email}"/>">
              </div>
              <div>
                <label>家庭住址：</label>
                <input type="text" name="address" class="login-text" value="<c:out value="${user.address}"/>">
              </div>
            </div>
            <div class="submit">
              <input type="submit" value="保存" class="button normal" id="update-userProfile">
              <a href="/"><input type="button" value="退出" class="button normal" id="logout"></a>
            </div>
          </form>
          <%--<div class="show-product-button">--%>
            <%--<button class="button">商品</button>--%>
          <%--</div>--%>
        </div>

        <div id="product">
          <div class="product">
            <div class="product-head">
              商品显示
            </div>
            <c:forEach var="product" items="${products}">
              <form action="/addOrder" method="post">
                <div>
                  <c:out value="${product.id}"/>
                  <input type="hidden" name="userId" value="<c:out value="${user.id}"/>">
                  <label class="product-font">商品名称：</label><c:out value="${product.productName}"/>
                  <input type="hidden" name="productName" value="<c:out value="${product.productName}"/>">
                  <label class="product-font">商品价格：</label><c:out value="${product.productPrice}"/>
                  <input type="hidden" name="productPrice" value="<c:out value="${product.productPrice}"/>">
                  <input type="submit" value="添加" class="button product-button">
                </div>
                <hr>
              </form>
            </c:forEach>
            <form action="/userOrder" method="get">
              <input type="submit" value="订单" class="button product-button order-return"></a>
              <input type="hidden" name="userId" value="<c:out value="${user.id}"/>">
            </form>
          </div>
        </div>
      </div>
    </div>
  </body>
</html>
