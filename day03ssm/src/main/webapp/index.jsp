<%--
  Created by IntelliJ IDEA.
  User: Keke
  Date: 2020/1/9
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="account/findAll">测试查询</a>
    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名：<input type="text" name="name"/><br/>
        账户余额：<input type="text" name="money"/><br/>
        <input type="submit" value="保存"/><br/>
    </form>

</body>
</html>
