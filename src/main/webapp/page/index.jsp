<%--
  Created by IntelliJ IDEA.
  User: Boqi-Hu
  Date: 2017/5/20
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
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
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <meta name="keywords" content="scclui框架">
  <meta name="description" content="scclui为轻量级的网站后台管理系统模版。">
  <title>东北林业大学体育馆后台管理系统</title>

  <link rel="stylesheet" href="<%=basePath%>common/css/sccl.css">
  <link rel="stylesheet" type="text/css" href="<%=basePath%>common/skin/qingxin/skin.css" id="layout-skin"/>

</head>

<body>
<div class="layout-admin">
  <header class="layout-header">
    <span class="header-logo">东北林业大学体育馆后台管理系统</span>
    <a class="header-menu-btn" href="javascript:;"><i class="icon-font">&#xe600;</i></a>
    <ul class="header-bar">
      <li class="header-bar-role"><a href="javascript:;">管理员</a></li>
      <li class="header-bar-nav">
        <a href="javascript:;">${admin.name}<i class="icon-font" style="margin-left:5px;">&#xe60c;</i></a>
        <ul class="header-dropdown-menu">
          <li><a href="<%=basePath%>admin/adminInfo?id=${admin.id}">个人信息</a></li>
          <li><a href="<%=basePath%>admin/logout">切换账户</a></li>
          <li><a href="<%=basePath%>admin/logout">退出</a></li>
        </ul>
      </li>
      <li class="header-bar-nav">
        <a href="javascript:;" title="换肤"><i class="icon-font">&#xe608;</i></a>
        <ul class="header-dropdown-menu right dropdown-skin">
          <li><a href="javascript:;" data-val="qingxin" title="清新">清新</a></li>
          <li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
          <li><a href="javascript:;" data-val="molv" title="墨绿">墨绿</a></li>

        </ul>
      </li>
    </ul>
  </header>
  <aside class="layout-side">
    <ul class="side-menu">

    </ul>
  </aside>

  <div class="layout-side-arrow"><div class="layout-side-arrow-icon"><i class="icon-font">&#xe60d;</i></div></div>

  <section class="layout-main">
    <div class="layout-main-tab">
      <button class="tab-btn btn-left"><i class="icon-font">&#xe60e;</i></button>
      <nav class="tab-nav">
        <div class="tab-nav-content">
          <a href="javascript:;" class="content-tab active" data-id="home.html">首页</a>
        </div>
      </nav>
      <button class="tab-btn btn-right"><i class="icon-font">&#xe60f;</i></button>
    </div>
    <div class="layout-main-body">
      <iframe class="body-iframe" name="iframe0" width="100%" height="99%" src="page/welcome.html" frameborder="0" data-id="<%=basePath%>home.html" seamless></iframe>
    </div>
  </section>
</div>
<script type="text/javascript" src="<%=basePath%>common/lib/jquery-1.9.0.min.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/sccl.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/sccl-util.js"></script>
</body>
</html>
