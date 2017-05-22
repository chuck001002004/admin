<%--
  Created by IntelliJ IDEA.
  User: Boqi-Hu
  Date: 2017/5/22
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  int i = 1;
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
  <link rel="stylesheet" href="<%=basePath%>common/css/sccl.css">
  <link rel="stylesheet" href="<%=basePath%>common/css/home.css">
  <link rel="stylesheet" href="<%=basePath%>common/css/order.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/css/datedropper.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/css/timedropper.min.css">
  <title>查看常驻用户</title>

</head>
<style>
  table{
    margin-top: 25px;
  }
</style>

<body>
<div id="content">
  <div id="search">
    <form action="<%=basePath%>user/getAllUser" method="">
      <input type="hidden" value="1" name="start">
      <p class="info-list">场地类型：
        <input type="radio" name="stadium" value="1" />篮球馆
        <input type="radio" name="stadium" value="2"/>羽毛球馆
        <input type="radio" hidden="hidden" name="stadium" value="0" checked="checked">
      <p class="info-list">
        预约人：<input type="text" name="userName" placeholder="请输入查找的用户名" value="">
      </p>
      <p class="info-list">
        手机号：<input type="text" name="phone" placeholder="请输入查找的手机号" value="">
      <p class="info-list">星期选择：<select name="week" id="week">
        <option value="1">星期一</option>
        <option value="2">星期二</option>
        <option value="3">星期三</option>
        <option value="4">星期四</option>
        <option value="5">星期五</option>
        <option value="6">星期六</option>
        <option value="0">星期日</option>
        <option value="7" selected="selected">请选择</option>
      </select></p>
      <p class="info-list">
        预约时段：<select name="start_time" id="select-time">
        <option value="0" selected="selected">请选择</option>
      </select>
        <span>--</span>
        <select name="end_time" id="select-time2">
          <option value="0" selected="selected">请选择</option>
        </select>
      </p>
      <p class="sub"><input  type="submit" value="查询"></p>
    </form>
  </div>
  <table class="am-table">
    <thead>
    <tr>
      <th>序号</th><th>预约人</th><th>场地</th><th>时间</th><th>操作</th>
    </tr>
    </thead>
    <tbody>
      <c:forEach items="${list}" var="user">
        <tr>
          <td><%=i++%></td>
          <td>${user.name}</td>
          <td>${user.site_no}号${user.type}</td>
          <c:if test="${user.week == 1}"><td>星期一${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.week == 2}"><td>星期二${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.week == 3}"><td>星期三${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.week == 4}"><td>星期四${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.week == 5}"><td>星期五${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.week == 6}"><td>星期六${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.week == 0}"><td>星期日${user.start_time}--${user.end_time}</td></c:if>
          <c:if test="${user.type == '篮球场'}">
            <td>
              <a class="edit" href="<%=basePath%>user/getUserById?id=${user.id}&type=1">编辑</a>&nbsp;
              <a class="delete" href="<%=basePath%>user/deleteUserById?id=${user.id}&type=1">删除</a>
            </td>
          </c:if>
          <c:if test="${user.type == '羽毛球场'}">
            <td>
              <a class="edit" href="<%=basePath%>user/getUserById?id=${user.id}&type=2">编辑</a>&nbsp;
              <a class="delete" href="<%=basePath%>user/deleteUserById?id=${user.id}&type=2">删除</a>
            </td>
          </c:if>
        </tr>
      </c:forEach>
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
