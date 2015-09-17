<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<div>
  <div>
    <div class="useProfile">
      <form action="/update" method="post">
        <div class="head">
          用户信息页面
        </div>
        <div class="format">
          <div>
            <label>用&nbsp;&nbsp;户&nbsp;&nbsp;ID：</label>
            <label class="label-text"></label>
          </div>
          <div>
            <label>用&nbsp;&nbsp;户&nbsp;&nbsp;名：</label>
            <label class="label-text"></label>
          </div>
          <div>
            <label>密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码：</label>
            <input type="password" name="password" class="login-text" id="userProfile-password">
          </div>
          <div class="password-message userProfile-text">
            长度不能少于6位
          </div>
          <div>
            <label>姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：</label>
            <input type="text" name="trueName" class="login-text">
          </div>
          <div>
            <label>年&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;龄：</label>
            <input type="text" name="userAge" class="login-text">
          </div>
          <div>
            <label>电子邮箱：</label>
            <label class="label-text"></label>
          </div>
          <div>
            <label>家庭住址：</label>
            <input type="text" name="address" class="login-text">
          </div>
        </div>
        <div class="submit">
          <input type="submit" value="保存" class="button normal" id="update-userProfile">
          <a href="/"><input type="button" value="退出" class="button normal" id="logout"></a>
        </div>
      </form>
      <div class="show-product-button">
        <button class="button">商品</button>
      </div>
    </div>

    <div id="product">
      <div class="product">
        <div class="product-head">
          商品显示
        </div>
        <div class="product-show">
          <form action="/add" method="post">
            <div>
              <label class="product-font">商品名称：</label>

              <label class="product-font">商品价格：</label>
              <input type="submit" value="添加" class="button product-button">
            </div>
            <hr>
          </form>
        </div>
        <form action="/userOrder" method="get">
          <input type="submit" value="订单" class="button product-button order-return"></a>
        </form>
      </div>
    </div>
  </div>
</div>
<%@include file="footer.jsp"%>