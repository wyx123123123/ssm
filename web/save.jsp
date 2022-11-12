<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/18
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/F/gosave">
  <table align="center" border="1px" width="400px">
    <tr hidden >
      <td> id:  <input name="id" value="${pp.id}" type="text" hidden></td>
    </tr>
    <tr>
      <td> 颜色：<input name="colour" value="${pp.colour}" type="text"></td>
    </tr>
    <tr>
       <td>品牌：<input name="brank" value="${pp.brank}" type="text"></td>
    </tr>
    <tr>
      <td><input type="submit" value="吊我">提交</td>
    </tr>
  </table>
</form>
</body>
</html>
