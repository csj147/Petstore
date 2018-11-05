<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>宠物店</title>
</head>

<style>
    table{
        border: 2px solid black;
        border-collapse: collapse;
        width: 60%;
    }

    table tr td{
        border: 2px solid black;
        text-align: center;
    }

    body{
        text-align: center;
    }
</style>

<body>
<h1 align="center">宠物物表</h1>

<%--<form action="/" method="post">--%>
    <c:forEach var="cate" items="${categorys}">
        <a href="/select_where/${cate.c_id}">${cate.c_name}</a>
        <%--<input type="submit" value="${cate.c_name}" name="id">--%>
    </c:forEach>
<%--</form>--%>


<table align="center">
    <tr>
        <th>编号</th>
        <th>类型</th>
        <th>名字</th>
        <th>标签</th>
        <th>图片</th>
        <th>位置</th>
        <th>操作</th>
    </tr>
    <div id="lx_div">
        <c:forEach var="pet" items="${pets}">
            <tr>
                <td>${pet.pet_id}</td>
                <td>${pet.category.c_name}</td>
                <td>${pet.pet_name}</td>
                <td>${pet.tag.t_name}</td>
                <td>${pet.pet_photoUrls}</td>
                <td>${pet.status}</td>
                <td><a href="/del/${pet.pet_id}">删除</a></td>
            </tr>
        </c:forEach>
    </div>
</table>
<a href="/tz">添加</a>

<script src="../js/jquery.js"></script>
<script>

</script>
</body>
</html>
