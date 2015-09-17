<%@include file="header.jsp"%>
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

        <form action="/deleteOrder" method="get">
          <tr>
            <td>
              <input type="hidden" name="orderId" >
              <input type="hidden" name="userId" >
            </td>
            <td>

            </td>
            <td>

            </td>
            <td>
              <input type="submit" value="删除" class="button product-button">
            </td>
          </tr>
        </form>

      </table>
    </div>

    <div>
      <form action="/returnUserProfile" method="get">
        <input type="submit" value="返回" class="button product-button order-return">
        <input type="hidden" name="userId">
      </form>
    </div>
  </div>
</div>
<%@include file="footer.jsp"%>