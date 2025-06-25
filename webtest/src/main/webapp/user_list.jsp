<%--
  Created by IntelliJ IDEA.
  User: PJM
  Date: 2025/6/23
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>用户列表</title>
    <link rel="icon" href="./image/logo.png" />
    <style type="text/css">
        body {
            margin: 10px 0 0 10px;
        }
        table,td,th{
            border: 1px solid black;
            border-collapse: collapse;
        }
        td{
            height: 30px;
        }
        table{
            font-size: 13px;
            text-align: center;
            width: 100%;
        }

        th{
            height: 50px;
            background-color: #9FB8F7;
            font-size: 16px;
        }

        .txt_right{
            text-align: left;
            text-indent: 2em;
        }

        .bg_color{
            background-color: rgb(208,220,251);
        }

        tr:hover{
            background-color: darkgrey;
            cursor: pointer;
        }

    </style>
    <script type="application/javascript">

    </script>
</head>
<body>

<table>
    <tr><th>序号</th><th>用户名</th><th>性别</th><th>工号</th><th>部门</th><th>岗位</th><th>联系电话</th><th>邮箱</th></tr>
    <c:forEach var="user" items="${requestScope.userList}" varStatus="status">
        <tr><td>${status.count}</td><td>${user.username}</td><td>${user.gender}</td><td>${user.workCode}</td><td>${user.department}</td>
            <td>${user.post}</td><td>${user.telephone}</td><td>${user.email}</td></tr>
    </c:forEach>

</table>

</body>
</html>