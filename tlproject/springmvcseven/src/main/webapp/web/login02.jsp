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
  <form>
      用户名:<input type="text" name="username"><br/>
      密码：<input type="text" name="password"/><br/>
      <input type="button" value="登录" onclick="return fun();"/>
  </form>
  <script src="/js/jquery-3.6.0.min.js"></script>
<script>
    /*$(function (){
        alert("测试")
    })*/
    function  fun(){
        /* 使用jquer调用name的元素，提取第一个元素，下标为0*/
        var username=$("input[name='username']").get(0).value;
        var password=$("input[name='password']").get(0).value;
       console.log(username+","+password)
        $.ajax({
            type:"post",
            url:"/loginServer03",
            data:{"name":username,"pwd":password},
            dataType:'json',
            success:function(result){
                console.log(result)
            }

        })
        return false;
    }
</script>

</body>
</html>
