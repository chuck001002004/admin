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
  <link rel="stylesheet" href="<%=basePath%>common/css/bootstrap.css">
  <link rel="stylesheet" href="<%=basePath%>common/css/index.css">

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
          <li class='user-info'><a href="javascript:;">个人信息</a></li>
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
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <form action="<%=basePath%>admin/updateAdminInfo" id="update-form">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
          <h4 class="modal-title" id="myModalLabel">个人信息</h4>
        </div>
        <div class="modal-body">
          <input type="hidden" value="${admin.id}" name="id">
          <p><span class="info-name">管理员姓名：</span><input type="text" name="username" value="${admin.name}"></p>
          <h5>修改密码</h5>
          <p><span class="info-name">原密码：</span><input type="password" name="oldpassword" id="oldpassword"><span class="checked" id="yanzheng">验证</span></p>
          <p><span class="info-name">新密码：</span><input type="password" name="password" id="password" disabled = disabled></p>
          <p class="last-info"><span class="info-name">确认密码：</span><input type="password" name="newpassword" id="newpassword" disabled = disabled></p>
        </div>
        <div class="modal-footer">
          <input type="submit" class="btn btn-primary" id="btn-ok" value="确认修改">
          <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
        </div>
      </div>
    </form>
  </div>
</div>
<%--<script type="text/javascript" src="<%=basePath%>common/lib/jquery-1.9.0.min.js"></script>--%>
<script type="text/javascript" src="<%=basePath%>common/lib/jquery-1.12.3.min.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/sccl.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/sccl-util.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=basePath%>common/js/index.js"></script>
</body>
<script type="text/javascript">
  $("#yanzheng").click(function(){
    <%--$.get("<%=basePath%>admin/checkBeforeUpdate", {id : ${admin.id}, "password" : $("#oldpassword").val()}), function(data){alert(data);}--%>
    var pwd = $("#oldpassword").val();
    $.ajax({
      type: "GET",
      url: "<%=basePath%>admin/checkBeforeUpdate",
      data: "id=${admin.id}&password=" + pwd,
      success: function(data){
        if(data == "1"){
          $("#password").removeAttr("disabled");
          $("#newpassword").removeAttr("disabled");
        }else{
          $("#password").attr("disable", "disabled");
          $("#newpassword").attr("disable", "disabled");
        }
      }
    });
  });
</script>
</html>
