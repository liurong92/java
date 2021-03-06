<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
  <head>
    <link rel="stylesheet" href="./css/index.css" type="text/css">
    <link rel="stylesheet" href="./css/register.css" type="text/css">
    <link rel="stylesheet" href="./css/userProfile.css" type="text/css">
    <link rel="stylesheet" href="./css/userOrder.css" type="text/css">
    <title>用户注册页面</title>
  </head>
  <body>
    <div>
      <div class="login">
        <div class="head">
          欢迎注册
        </div>
        <form action="/addUser" method="post">
          <div>
            <div>
              <label>用&nbsp;&nbsp;户&nbsp;&nbsp;名：</label>
              <input type="text" name="userName" placeholder="请输入用户名" class="login-text">*
            </div>
            <div>
              <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
              <input type="password" name="password" placeholder="请输入密码" class="login-text">*
            </div>
            <div class="password-message">
              长度不能少于6位
            </div>
            <div>
              <label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
              <input type="text" name="trueName" placeholder="输入姓名" class="login-text">&nbsp;&nbsp;
            </div>
            <div>
              <label>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</label>
              <input type="text" name="userAge" placeholder="请输入年龄" class="login-text">&nbsp;&nbsp;
            </div>
            <div>
              <label>电子邮箱：</label>
              <input type="email" name="email" placeholder="请输入电子邮箱" class="login-text" id="register-email">*
            </div>
            <div>
              <label>家庭住址：</label>
              <input type="text" name="address" placeholder="请输入家庭住址" class="login-text">&nbsp;&nbsp;
            </div>
            <div>
              <input type="submit" value="注册" class="button normal" id="register-button">
              <input type="reset" value="重置" class="button normal">
            </div>
            <div>
              <a href="/" class="register">返回</a>
            </div>
          </div>
        </form>
      </div>
    </div>
  </body>
</html>
<%@include file="footer.jsp"%>
