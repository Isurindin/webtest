<%--
  Created by IntelliJ IDEA.
  User: 郑智伟
  Date: 2025/6/23
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>页面布局</title>
    <link rel="stylesheet" href="./css/main.css" type="text/css" />
    <link rel="icon" href="./image/logo.png" />
    <style>
        #content {
            width: 100%;
            height: 100%;
        }
        #left {
            background-color: lightcyan;
        }
        #left div{
            text-align: center;
            line-height: 30px;
            background-color: #9FB8F7;
            cursor: pointer;
            border-bottom: 1px solid black;
        }
        #left div:hover{
            background-color: gainsboro;
        }
        #left a{
            text-decoration: none;
        }
    </style>
</head>
<body>
<div id="total">
    <div id="banner">
        <img src="image/banner.jpg" />
    </div>
    <div id="middle">
        <div id="left">
            <div>
                用户: ${sessionScope.userInfo.username}
            </div>
            <div>
                <a href="./index.jsp" target="content">首页</a>
            </div>
            <div>
                <a href="./user_list.action" target="content">用户管理</a>
            </div>
            <div>
                <a href="./apple.jsp" target="content">苹果之乡</a>
            </div>
            <div>
                <a href="./apple.jsp" target="content">经济论坛</a>
            </div>
            <div>
                <a href="./login_out.action">退出登录</a>
            </div>
        </div>
        <div id="right">
            <iframe src="./index.jsp" id="content" name="content" frameborder="0">

            </iframe>
        </div>
    </div>
    <div id="bottom">
        <div>
            工业和信息化部备案管理系统网站 粤B2-20090191-18
        </div>
        <div>
            主办单位：广州网易计算机系统有限公司
        </div>
        <div>
            Operated by Guangzhou NetEase Computer System Co., Ltd.
        </div>
    </div>
</div>
</body>
</html>
