<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加宠物</title>
</head>
<body>

<form action="/tj" name="tj">
    类型：<input type="text" name="category_id">
    名称：<input type="text" name="Pet_name">
    图片：<input type="text" name="Pet_photoUrls">
    标签：<input type="text" name="tag_id">
    位置：<input type="text" name="status">
    <input type="submit" name="sub" value="添加"/>
</form>

</body>
</html>
