<%--
  Created by IntelliJ IDEA.
  User: PJM
  Date: 2025/6/25
  Time: 14:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加用户</title>
    <style type="text/css">
        body {
            margin: 10px 0 0 10px;
            font-size: 13px;
        }
        a {
            text-decoration: none;
            color: blue;
        }
        a:visited {
            color: blue;
        }
        a:hover {
            color: red;
        }
        #head {
            margin-bottom: 5px;
        }
        #content div{
            line-height: 25px;
            margin: 5px;
        }
        .container{
            display: flex;
        }
        .left{
            width: 160px;
            text-align: right;
        }
        .right{
            width: 400px;
            box-sizing: border-box;
            padding-left: 5px;
        }
        .right input[des]{
            outline: none;
            height: 25px;
            border: 1px solid black;
            border-radius: 5px;
            width: 300px;
        }
        .right input:focus {
            box-shadow: 0 0 5px #9FB8F7;
        }
        select{
            height: 25px;
            width: 300px;
            border: 1px solid black;
            border-radius: 5px;
        }
        select:focus {
            box-shadow: 0 0 5px #9FB8F7;
        }
        .btnDiv {
            box-sizing: border-box;
            padding: 10px 0;
            width: 500px;
            text-align: center;
        }
        .btnDiv input{
            border: 1px solid black;
            width: 80px;
            height: 25px;
        }
    </style>
    <script type="application/javascript">
        function saveUser() {
            let flag = true;
            if (document.getElementById("workCode").value==""){
                flag = false;
            }
            if (document.getElementById("username").value==""){
                flag = false;
            }
            if (document.getElementById("password").value==""){
                flag = false;
            }
            if (flag){
                document.getElementById("addForm").submit();
            }else {
                alert("请填写完整表单信息！！");
            }
        }
        function cancel() {
            location.href = "./user_list.action";
        }
    </script>
</head>
<body>
<div id="head">
    <a href="./user_list.action">返回列表</a>
</div>
<div id="content">
    <div id="errDiv" style="height: 30px;color: red">
        ${requestScope.addErr}
    </div>
    <form id="addForm" method="post" action="./user_insert.action">
        <div class="container">
            <div class="left">员工工号：</div>
            <div class="right"><input des type="text" id="workCode" name="workCode" /></div>
        </div>
        <div class="container">
            <div class="left">员工姓名：</div>
            <div class="right"><input des type="text" id="username" name="username" /></div>
        </div>
        <div class="container">
            <div class="left">账号密码：</div>
            <div class="right"><input des type="password" id="password" name="password" /></div>
        </div>
        <div class="container">
            <div class="left">选择部门：</div>
            <div class="right">
                <select id="department" name="department">
                    <option value="">请选择</option>
                    <c:forEach var="entry" items="${applicationScope.departMap}">
                        <option value="${entry.key}">${entry.value}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="container">
            <div class="left">选择岗位：</div>
            <div class="right">
                <select id="post" name="post">
                    <option value="">请选择</option>
                    <c:forEach var="entry" items="${applicationScope.jobMap}">
                        <option value="${entry.key}">${entry.value}</option>
                    </c:forEach>
                </select>
            </div>
        </div>
        <div class="container">
            <div class="left">选择性别：</div>
            <div class="right">
                <input type="radio" style="width: 15px;height: 15px" value="男" name="gender" checked/> 男
                <input type="radio" style="width: 15px;height: 15px" value="女" name="gender"> 女
            </div>
        </div>
        <div class="container">
            <div class="left">联系电话：</div>
            <div class="right"><input des type="text" id="telephone" name="telephone" /></div>
        </div>
        <div class="container">
            <div class="left">出生日期：</div>
            <div class="right"><input des type="date" id="birthDate" name="birthDate" /></div>
        </div>
        <div class="container">
            <div class="left">邮箱：</div>
            <div class="right"><input des type="text" id="email" name="email" /></div>
        </div>
        <div class="btnDiv">
            <input type="button" value="保存" onclick="saveUser()" style="background-color: cornflowerblue"/>
            <input type="button" value="返回" onclick="cancel()" />
        </div>
    </form>
</div>
</body>
</html>
