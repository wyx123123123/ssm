<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/6/18
  Time: 16:57
  To change this template use File | Settings | File Templates.
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form >
    <table align="center" border="1px" width="800px">
        <tr>
            <th>id</th>
            <th>颜色</th>
            <th>品牌</th>
            <th>操作<a href="/save.jsp">添加</a></th>

        </tr>
       <c:forEach items="${all}" var="al">
           <tr>
               <td>${al.id}</td>
               <td>${al.colour}</td>
               <td>${al.brank}</td>
               <td align="center"><a href="/F/one?id=${al.id}">修改</a>
                   <a href="/F/d?id=${al.id}">删除</a>
               </td>
           </tr>
       </c:forEach>
    </table>
</form>

</body>
</html>
