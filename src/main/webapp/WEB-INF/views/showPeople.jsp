<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>展示用户信息</title>
</head>
<body>
<table border="1px" style="border-collapse: collapse;" >
    <tr>
        <td>id</td>
        <td>name</td>
        <td>gender</td>
        <td>delete</td>

    </tr>
    <c:forEach var="row" items="${data}">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
            <td>${row.gender}</td>
            <td><a href="javascript:removePeople(${row.id})">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
<script type="text/javascript">
    function removePeople(id){

        if(confirm("请问你真的要删除吗?")){
            window.location="deletePeople.do?id="+id;
        }
    }
</script>
</html>