<%--
  Created by IntelliJ IDEA.
  User: com.neuedu
  Date: 2021/3/18
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录</title>
</head>
<body>
  <form action="/loginServer02" method="post">
      用户名:<input type="text" name="username"><br/>
      密码：<input type="text" name="password"/><br/>
      <input type="submit" value="登录"/>

  </form>
</body>
</html>
