<%--
  Created by IntelliJ IDEA.
  User: PJM
  Date: 2025/6/23
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>第一个Web应用</title>
    <link rel="stylesheet" href="./css/main.css" type="text/css" />
    <link rel="icon" href="./image/logo.png" />
    <script type="application/javascript">
        function changeColor() {
            // 获取页面元素，需要借助于js引擎内容提供的功能
            // document let局部 var全局
            let p = document.getElementById("p1");
            p.style.color = "red";
        }
    </script>
</head>
<body>
<h1 align="center" title="鼠标悬浮到标签上，可以出现提示信息">Java Web</h1>
<input type="button" value="更改段落文本颜色" onclick="changeColor()">
<p id="p1">
    Java Web 内容学习！！   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     正在学习！！！！
</p>
<p id="p2">
    第二个段落p的内容！！
</p>
<a href="https://www.163.com" target="_blank">
    <img src="image/apple-one.jpg" width="300px"/>
</a>
<br/>
<!-- 页面中的注释内容 -->
<a href="https://www.baidu.com" target="_blank">访问百度</a>

<table>
    <tr><th>序号</th><th>名称</th><th>产地</th><th>供应商</th><th>联系电话</th><th>商品样例</th></tr>
    <tr><td>1</td><td>苹果</td><td class="txt_right">陕西洛川县</td><td class="txt_right">陕西果品销售有限公司</td><td>13888888888</td>
        <td><img src="image/apple-one.jpg" width="100px"/></td></tr>
    <tr class="bg_color"><td>2</td><td>苹果</td><td class="txt_right">陕西洛川县</td><td class="txt_right">陕西果品销售有限公司</td><td>13888888888</td>
        <td><img src="image/apple-one.jpg" width="100px"/></td></tr>
    <tr><td>3</td><td>苹果</td><td class="txt_right">陕西洛川县</td><td class="txt_right">陕西果品销售有限公司</td><td>13888888888</td>
        <td><img src="image/apple-one.jpg" width="100px"/></td></tr>
    <tr class="bg_color"><td>4</td><td>苹果</td><td class="txt_right">陕西洛川县</td><td class="txt_right">陕西果品销售有限公司</td><td>13888888888</td>
        <td><img src="image/apple-one.jpg" width="100px"/></td></tr>
    <tr><td>5</td><td>苹果</td><td class="txt_right">陕西洛川县</td><td class="txt_right">陕西果品销售有限公司</td><td>13888888888</td>
        <td><img src="image/apple-one.jpg" width="100px"/></td></tr>
</table>

</body>
</html>
