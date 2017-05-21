<%--
  Created by IntelliJ IDEA.
  User: Boqi-Hu
  Date: 2017/5/21
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<base href="<%=basePath%>">
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
  <meta name="renderer" content="webkit|ie-comp|ie-stand">
  <meta name="keywords" content="scclui框架">
  <meta name="description" content="scclui为轻量级的网站后台管理系统模版。">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="stylesheet" href="<%=basePath%>common/css/sccl.css">
  <link rel="stylesheet" href="<%=basePath%>common/css/order.css">
  <title>已完成</title>

</head>

<body>
<div id="content">
  <table class="am-table">
    <thead>
    <tr>
      <th></th><th>订单号</th><th>预约人</th><th>场地</th><th>日期</th><th>时段</th><th>操作</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${list}" var="order">
      <tr>
        <td><input type="checkbox" name="teacher"></td>
        <td>${order.id}</td>
        <td>${order.name}</td>
        <td>${order.type}</td>
        <td><fmt:formatDate value="${order.date}" pattern="yyyy-MM-dd"/></td>
        <td>${order.start_time}--${order.end_time}</td>
        <td><a class="edit" href="javascript:;">详情</a>&nbsp;<a class="delete" href="">删除</a></td>
      </tr>
    </c:forEach>
    <!-- <tr>
      <td><input type="checkbox" name="teacher"></td>
      <td>1</td>
      <td>胡瑞坤</td>
      <td>篮球场</td>
      <td>2016-02-06</td>
      <td><a class="edit" href="javascript:;">详情</a>&nbsp;<a class="delete" href="">删除</a></td>
    </tr> -->
    </tbody>
  </table>
  <div class="row">
    <div class="row-left">
      <div class="dataTables_info">共6条记录</div>
    </div>
    <div class="row-right">
      <ul>
        <li class="active"><a href="">1</a></li><li><a href="">2</a></li>
      </ul>
    </div>
  </div>
</div>

</body>
</html>
