<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/8/16
  Time: 14:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="userServlet" method="post">
        <span style="color: red">${msg}</span>
        <P>
            <input type="text" name="uname">
        </P>
        <p>
            <input type="text" name="upwd">
        </p>
        <p>
            <input type="submit" value="登录">
        </p>
    </form>
</body>
</html>
