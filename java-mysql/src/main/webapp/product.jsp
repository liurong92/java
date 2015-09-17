<%@page contentType="text/html; charset=utf-8" language="java" %>
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
