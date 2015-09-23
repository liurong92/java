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
        <div>
            <div>
                <form action="userProfile" method="get">
                    <div class="login">
                        <div class="head">
                            欢迎登录
                        </div>
                        <div>
                            <label>用户名：</label>
                            <input type="text" name="userName" placeholder="请输入用户名" class="login-text" id="userName">
                        </div>
                        <div>
                            <label>密&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
                            <input type="password" name="password" placeholder="请输入用户名" class="login-text" id="password">
                        </div>
                        <div>
                            <div>
                                <a href="register" class="register">免费注册</a>
                            </div>
                            <div>
                                <input type="submit" class="button" value="登陆" id="login">
                            </div>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
