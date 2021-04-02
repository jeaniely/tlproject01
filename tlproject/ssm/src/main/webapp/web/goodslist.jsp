<%--
  Created by IntelliJ IDEA.
  User: neuedu
  Date: 2021/3/18
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息</title>
</head>
<body>
<div>
   <table>
       <tbody id="datacontent">

       </tbody>
       <thead>
       <tr>
           <td>商品编号</td>
           <td>商品名称</td>
           <td>商品单价</td>
       </tr>
       </thead>


   </table>
</div>



    <script src="/ssm/js/jquery-3.6.0.min.js"></script>
<script>
    $(function(){
        $.ajax({
            type:"get",
            url:"/ssm/googslist",
            dataType:"json",
            success:function(data){
               /* console.log(data)*/
                var str="";
                $.each(data,function (){
                    /*console.log(this.gnumber+"  "+this.name+"  "+this.price)*/
                    str+="<tr><td>"+this.gnumber+"</td><td>"+this.name+"</td><td>" +this.price+"</td></tr>"
                })

                $("#datacontent").html(str);
            }
        })
    })

</script>
</body>
</html>
