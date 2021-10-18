<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%         String basePath= request.getScheme()+"://"+
                            request.getServerName()+":"+
                            request.getServerPort()+
                            request.getContextPath()+"/";
%>
<html>
<head>
    <title>Title</title>
    <base href="<%=basePath%>"/>
</head>
<body>
    <p>注册学生</p>
    <form action="reg" method="post">
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="name"/></td>
            </tr>
            <tr>
                <td>邮箱</td>
                <td><input type="text" name="email"/></td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="age"/></td>
            </tr>
            <tr>
                <td>提交</td>
                <td><input type="submit" value="注册"/></td>
            </tr>
        </table>
    </form>
</body>
</html>
