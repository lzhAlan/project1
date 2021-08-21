<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: 12629
  Date: 2021/2/5
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page
        contentType="text/html;charset=UTF-8"
        language="java" %>
<html>
<head>
    <title>Users</title>
    <!--Bootstrap CSS-->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <!--jQuery first,then Popper.js,then Bootstrap JS-->
    <script src="js/jquery-3.5.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
    <table class="table table-bordered table-striped">
        <thead>
            <tr>
                <th>id</th>
                <th>username</th>
                <th>password</th>
                <th>gender</th>
                <th>register_time</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${requestScope.users}" var="user">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.password}</td>
                    <td>${user.gender}</td>
                    <td>
                        <fmt:formatDate value="${user.register_time}" pattern="yyyy-MM-dd"/>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
