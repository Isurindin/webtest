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
        #queryDiv{
            margin-bottom: 10px;
            line-height: 34px;
        }
        #username {
            height: 30px;
            border: 1px solid black;
            outline: none;
        }
        #queryBtn,#addBtn{
            cursor: pointer;
            height: 30px;
            width: 80px;
            background-color: #9FB8F7;
            border: 1px solid #9FB8F7;
            position: relative;
            top: 1px;
        }
        #addBtn {
            background-color: lawngreen;
            border: 1px solid lawngreen;
        }
    </style>
    <script type="application/javascript">
        function queryUser() {
            document.getElementById("queryForm").submit();
        }
        function addUser() {
            // 通过JS的语法，完成页面跳转
            location.href = "./user_add.jsp";
        }
        function deleteUser(id) {
            let flag = confirm("删除操作不可恢复，是否确认删除此数据？");
            if (flag){
                location.href = "./user_delete.action?id="+id;
            }
        }
    </script>
</head>
<body>
<div id="queryDiv">
    <form id="queryForm" action="./user_list.action" method="post">
        用户名：<input type="text" id="username" name="username" value="${requestScope.username}"/>
        <input type="button" id="queryBtn" value="查询" onclick="queryUser()">
        <input type="button" id="addBtn" value="新增" onclick="addUser()">
    </form>
</div>
<table>
    <tr><th>序号</th><th>用户名</th><th>性别</th><th>工号</th><th>部门</th><th>岗位</th><th>联系电话</th><th>邮箱</th><th>操作</th></tr>
    <c:forEach var="user" items="${requestScope.userList}" varStatus="status">
        <tr><td>${status.count}</td><td>${user.username}</td><td>${user.gender}</td><td>${user.workCode}</td>
            <td>${applicationScope.departMap[user.department]}</td>
            <td>${applicationScope.jobMap[user.post]}</td><td>${user.telephone}</td><td>${user.email}</td>
            <td><img src="./image/del_button.png" onclick="deleteUser('${user.id}')"/></td>
        </tr>
    </c:forEach>

</table>

</body>
</html>