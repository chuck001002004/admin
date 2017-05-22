<%--
  Created by IntelliJ IDEA.
  User: Boqi-Hu
  Date: 2017/5/22
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <link rel="stylesheet" href="../common/css/home.css">
  <title>首页</title>
</head>

<body>
<div id="content">
  <div id="search">
    <form action="<%=basePath%>user/addUser" method="post">
      <p class="info-list">场地类型：<input type="radio" name="stadium" value="0" />篮球馆<input type="radio" name="stadium" value="1"/>羽毛球馆
      <p class="info-list">
        用户名：<input type="text" name="userName" placeholder="请输入用户名" value="">
      </p>
      <p class="info-list">
        联系方式：<input type="text" name="phone" placeholder="请输入联系方式" value="">
      </p>
      <p class="info-list">
        紧急联系方式：<input type="text" name="emergencycall" placeholder="请输入紧急联系方式" value="">
      </p>
      <p class="info-list">星期选择：<select name="week" id="week">
        <option value="1">星期一</option>
        <option value="2">星期二</option>
        <option value="3">星期三</option>
        <option value="4">星期四</option>
        <option value="5">星期五</option>
        <option value="6">星期六</option>
        <option value="7">星期天</option>

      </select></p>
      <p class="info-list">
        预约时段：<select name="start_time" id="select-time">
      </select>
        <span>--</span>
        <select name="end_time" id="select-time2">
        </select>
      </p>
      <p class="info-list">
        联系地址：<input type="text" name="address" placeholder="请输入联系地址" value="">
      </p>
      <p class="info-list">
        金额：<input type="text" name="money" placeholder="请输入所需的费用" value="">
      </p>
      <p class="info-textarea">
        <span>备注：</span></br><textarea name="remark" rows="10"></textarea>
      </p>
      <p class="sub"><input  type="submit" value="添加"></p>
    </form>
  </div>
</div>

<script src="../common/js/jquery-1.12.3.min.js"></script>
<script src="../common/js/bootstrap.min.js"></script>
<script src="../common/js/user.js"></script>
<script src="../common/js/addItem.js"></script>
</body>
</html>
