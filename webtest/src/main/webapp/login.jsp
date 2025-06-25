<%--
  Created by IntelliJ IDEA.
  User: 郑智伟
  Date: 2025/6/23
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
    <style type="text/css">
        body {
            margin: 0;
        }
        #loginDiv {
            border: 1px solid black;
            width: 460px;
            height: 280px;
            margin: -140px auto 0;
            position: relative;
            top: 50%;
            background-color: aliceblue;
            box-sizing: border-box;
            padding: 50px 20px;
        }
        .text_right{
            text-align: right;
        }
        td{
            line-height: 50px;
        }
        td input {
            height: 34px;
            width: 100%;
            border: 1px solid black;
            outline: none;
            border-radius: 5px;
        }

        #btnDiv {
            text-align: center;
        }
        #btnDiv input{
            width: 100px;
            height: 40px;
            margin: 20px 20px;
            background: #9FB8F7;
            border-radius: 20px;
            cursor: pointer;
        }
        #tipDiv {
            height: 30px;
            width: 100%;
            position: absolute;
            color: red;
            text-align: center;
            top: 20px;
        }
    </style>
    <script type="application/javascript">
        function userLogin() {
            let username = document.getElementById("username").value;
            let password = document.getElementById("password").value;
            if (username==="" || password===""){
                document.getElementById("tipDiv").textContent = "用户名或密码不能为空";
            }else {
                document.getElementById("tipDiv").textContent = "";
                document.getElementById("loginForm").submit();
            }
        }
    </script>
</head>
<body onload="init()">
<div id="loginDiv">
    <div id="tipDiv">
        ${requestScope.loginErr}
    </div>
    <form action="./login.action" method="post" id="loginForm" name="loginForm">
        <table width="100%">
            <tr><td width="120px" class="text_right">用户名：</td>
                <td><input type="text" id="username" name="username" /></td></tr>
            <tr><td class="text_right">密码：</td>
                <td><input type="password" id="password" name="password" /></td></tr>
        </table>
        <div id="btnDiv">
            <input type="button" value="登录" onclick="userLogin()">
            <input type="button" style="background-color: chartreuse" value="注册">
        </div>
    </form>
</div>
</body>
</html>
