<%--
  Created by IntelliJ IDEA.
  User: Boqi-Hu
  Date: 2017/5/20
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
  <meta name="renderer" content="webkit|ie-comp|ie-stand">
  <meta name="keywords" content="scclui框架">
  <meta name="description" content="scclui为轻量级的网站后台管理系统模版。">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="stylesheet" href="<%=basePath%>common/css/home.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/css/datedropper.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/css/timedropper.min.css">
  <title>首页</title>
</head>

<body>
<div id="content">
  <div id="search">
    <form action="<%=basePath%>" method="post">
      <!-- <p class="info-list">
          订单号：<input type="text" name="address" placeholder="请输入查找的订单号" value="">
      </p> -->
      <p class="info-list">场地类型：<input type="radio" name="stadium" value="1" checked="checked"/>篮球馆<input type="radio" name="stadium" value="2"/>羽毛球馆<input type="radio" name="stadium" value="3" />乒乓球馆</p>
      <p class="info-list">
        预约人：<input type="text" name="userName" placeholder="请输入查找的用户名" value="">
      </p>
      <p class="info-list">
        手机号：<input type="text" name="phone" placeholder="请输入查找的手机号" value="">
      <p class="info-list">日期选择：<input type="text" class="input" id="pickdate" placeholder="请选择日期"/></p>
      <p class="info-list">
        预约时段：<select name="catalogs" id="select-time">
        <option value="0" selected="selected">起始</option>
      </select>
        <span>--</span>
        <select name="catalogs" id="select-time2">
          <option value="0" selected="selected">结束</option>
        </select>
      </p>
      <p class="sub"><input  type="submit" value="查询"></p>
    </form>
  </div>
  <div id="sch-result">
    <table class="am-table">
      <thead>
      <tr>
        <th>订单号</th><th>预约人</th><th>场地</th><th>时间</th><th>订单状态</th><th>操作</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${list}" var="order">
        <td>${order.id}</td>
        <td>${order.name}</td>
        <td>${order.site_no}号${order.type}</td>
        <td>${order.start_time}--${order.end_time}</td>
        <c:if test="${order.iscomplete == '1'}">
          <td>已完成</td>
        </c:if>
        <c:if test="${order.ispay == '0'}">
          <td>未支付</td>
        </c:if>
        <c:if test="${order.ispay == '1'} && ${order.iscomplete == '0'}">
          <td>未完成</td>
        </c:if>
        <td></td>
      </c:forEach>
      <!-- <tr>
        <td>1</td>
        <td>Chuck</td>
        <td>篮球场</td>
        <td>2016-02-06</td>
        <td>已完成</td>
        <td><a class="edit" href="javascript:;">详情</a>&nbsp;<a class="delete" href="">删除</a></td>
      </tr> -->

      </tbody>
    </table>
  </div>
</div>

<script src="<%=basePath%>common/js/user.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/jquery-1.12.3.min.js"></script>
<script src="<%=basePath%>common/js/datedropper.min.js"></script>
<script src="<%=basePath%>common/js/timedropper.min.js"></script>
<script>
  $("#pickdate").dateDropper({
    animate: false,
    format: 'Y-m-d',
    maxYear: '2020'
  });
  $("#picktime").timeDropper({
    meridians: false,
    format: 'HH:mm',
  });

</script>

<div style="display:none"></div>

</body>
</html>
