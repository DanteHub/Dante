<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/12/1 0001
  Time: 18:14
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
    <title>首页通知书</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <div align="center">
        <img src="images/方程成是sb.jpg"/>
        <table>
            <tr>
                <td><a href="addStudent.jsp">注册学生</a></td>
            </tr>
            <tr>
                <td>浏览学生</td>
            </tr>
        </table>
    </div>
</body>
</html>
