<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/1 0001
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <table>
        <form action="some.do">
            姓名：<input type="text" name="name"/><br/>
            年龄：<input type="taxt" name="age"/><br/>
            <input type="submit" value="提交"/>
        </form>
    </table>
</body>
</html>
