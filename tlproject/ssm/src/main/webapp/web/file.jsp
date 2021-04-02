<%--
  Created by IntelliJ IDEA.
  User: neuedu
  Date: 2021/3/19
  Time: 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>上传文件</title>
</head>
<body>
<%--上传文件使用请求方式post--%>
<form action="/ssm/upload" method="post" enctype="multipart/form-data">
    单个文件上传文件<input type="file" name="imgfile"/>
    <br/>
    多个文件上传文件<%--<input type="file" name="ifiles" multiple/>--%>
    <input type="button" onclick="fun()" value="+添加图片"/>
    <div id="uploadstyle">
    <br/>文件上传<input type="file" name="ifiles" />
    </div>
    <br/><input type="submit" value="上传图片"/>
</form>
<script src="/ssm/js/jquery-3.6.0.min.js"></script>

<script>
        function  fun(){
            $("#uploadstyle").append('<br/>文件上传<input type="file" name="ifiles" />')
        }
</script>
</body>
</html>
