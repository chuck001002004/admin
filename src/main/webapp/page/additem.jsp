<%--
  Created by IntelliJ IDEA.
  User: Boqi-Hu
  Date: 2017/5/21
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
  <link rel="stylesheet" href="<%=basePath%>common/css/item.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/css/datedropper.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/css/timedropper.min.css">
  <link rel="stylesheet" href="<%=basePath%>common/css/bootstrap.css">
  <title>添加订单</title>
</head>

<body>
<div id="content">
  <form action="<%=basePath%>/order/addOrder" method="post">
    <div id="search">
      <p class="info-list">
        预约人：<input type="text" name="userName" placeholder="请输入用户的姓名" value="">
      </p>
      <p class="info-list">
        手机号：<input type="text" name="phone" placeholder="请输入用户的手机号" value="">
      <p class="info-list">日期选择：<input type="text" class="input" id="pickdate" placeholder="请选择日期" name="date"/></p>
      <p class="info-list">
        预约时段：<select name="start_time" id="select-time">
      </select>
        <span>--</span>
        <select name="end_time" id="select-time2">
        </select>
      </p>
      <p class="info-list">场地类型：
        <input type="radio" name="item" value="0"/>篮球场
        <input type="radio" name="item" value="1"/>羽毛球场
        <input type="radio" name="item" value="2"/>乒乓球场
      </p>
    </div>
    <div class="space"></div>
    <div id="info-ground">
      <div class="basketball active">
        <p><input type="checkbox" name="stadium" value="1" />01号场地</p>
        <p><input type="checkbox" name="stadium" value="2" /> 02号场地</p>
      </div>
      <div class="basketball">
        <p><input type="checkbox" name="stadium" value="3" />03号场地</p>
        <p><input type="checkbox" name="stadium" value="4" /> 04号场地</p>
      </div>
      <div class="basketball">
        <p><input type="checkbox" name="stadium" value="5" />05号场地</p>
        <p><input type="checkbox" name="stadium" value="6" /> 06号场地</p>
      </div>
      <div class="basketball">
        <p><input type="checkbox" name="stadium" value="7" />07号场地</p>
        <p><input type="checkbox" name="stadium" value="8" /> 08号场地</p>
      </div>
      <p class="info-list hint-info"> 注意：每人最多可预定一个全场，两个全场</p>
    </div>
    <div id="info-badmin">
      <div class="badminton active">
        <p><input type="radio" name="site_no" value="" />01号场地</p>
      </div>
      <div class="badminton">
        <p><input type="radio" name="site_no" value="" /> 02号场地</p>
      </div>
      <div class="badminton">
        <p><input type="radio" name="site_no" value="" />03号场地</p>
      </div>
      <div class="badminton active">
        <p><input type="radio" name="site_no" value="" />04号场地</p>
      </div>
      <div class="badminton">
        <p><input type="radio" name="site_no" value="" />05号场地</p>
      </div>
      <div class="badminton">
        <p><input type="radio" name="site_no" value="" />06号场地</p>
      </div>
    </div>
    <p class="sub"><input  type="submit" value="提交"></p>
  </form>
</div>
<script src="<%=basePath%>common/js/user.js"></script>
<script src="<%=basePath%>common/js/jquery-1.12.3.min.js"></script>
<script src="<%=basePath%>common/js/bootstrap.min.js"></script>
<script src="<%=basePath%>common/js/datedropper.min.js"></script>
<script src="<%=basePath%>common/js/timedropper.min.js"></script>
<script src="<%=basePath%>common/js/addItem.js"></script>
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
<!--<script type="text/javascript">-->
<!--function check(){alert("click");-->
<!--var type = document.getElementsByName("item");-->
<!--var i = 0;-->
<!--for(i = 0; i < type.length; i++){-->
<!--if(type[i].checked){-->
<!--alert(type[i].value);-->
<!--}-->
<!--}-->
<!--return false;-->
<!--}-->
<!--</script>-->
</html>
