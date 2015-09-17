<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div>
    <div>
        <form action="/userProfile" method="post">
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
<%@include file="footer.jsp"%>
