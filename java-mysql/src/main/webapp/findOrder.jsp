<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
    <%
        String driverName = "com.mysql.jdbc.Driver";
        String userName = "root";
        String userPassword = "";
        String dbName = "threeDB";
        String tableName = "orders";
        String url = "jdbc:mysql://localhost:3306/" +
                dbName + "?user=" + userName + "&password" +
                userPassword;
        Class.forName(driverName).newInstance();
        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();
        String sql = "select * from "+tableName;
        ResultSet rs = statement.executeQuery(sql);
    %>
    <div class="product">
        <div>
            <table>
                <tr>
                    <th>订单ID</th>
                    <th>商品名称</th>
                    <th>商品价格</th>
                    <th>用户ID</th>
                </tr>
                <%
                    while (rs.next()){
                %>

                <tr>
                    <td><%= rs.getString("id")%></td>
                    <td><%= rs.getString("orderName")%></td>
                    <td><%= rs.getString("orderPrice")%></td>
                    <td><%= rs.getString("user_id")%></td>
                </tr>

                <% }
                    rs.close();
                    statement.close();
                    connection.close();
                %>
            </table>
        </div>
    </div>
<%@include file="footer.jsp"%>