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
  <link rel="stylesheet" href="../common/css/item.css">
  <title>常驻用户添加</title>
</head>

<body>
<div id="content">
  <div id="search">
    <c:if test="${user.type == '篮球场'}">
      <form action="<%=basePath%>user/updateUser?id=${user.id}&item=0&stadium=${user.site_no}" method="post" id="form-submit">
    </c:if>
    <c:if test="${user.type == '羽毛球场'}">
      <form action="<%=basePath%>user/updateUser?id=${user.id}&item=1&badminton=${user.site_no}" method="post" id="form-submit">
    </c:if>
      <p class="info-list">
        用户名：<input type="text" name="userName" placeholder="请输入用户名" value="${user.name}">
      </p>
      <p class="info-list">
        手机号：<input type="text" name="phone" placeholder="请输入用户手机号" value="${user.phone}">
      </p>
      <p class="info-list">
        紧急联系人手机号：<input type="text" name="emergencycall" placeholder="请输入紧急联系人手机号" value="${user.emergencycall}">
      </p>
      <p class="info-list">星期选择：
        <select name="week" id="week">
          <option value="1">星期一</option>
          <option value="2">星期二</option>
          <option value="3">星期三</option>
          <option value="4">星期四</option>
          <option value="5">星期五</option>
          <option value="6">星期六</option>
          <option value="0">星期天</option>
        </select>
      </p>
      <p class="info-list">
        预约时段：<select name="start_time" id="select-time">
      </select>
        <span>--</span>
        <select name="end_time" id="select-time2">
        </select>
      </p>
      <p class="info-list">
        家庭住址：<input type="text" name="address" placeholder="请输入用户住址" value="${user.address}">
      </p>
      <p class="info-list">
        金额：<input type="text" name="money" id="money" placeholder="请输入所需的费用" value="${user.money}">
      </p>
      <p class="info-list">
        当前场地：${user.site_no}号${user.type}
      </p>
      <p class="info-list">修改当前场地：
          <input type="radio" name="item" value="0" id="item1"/>篮球馆
          <input type="radio" name="item" value="1" id="item2"/>羽毛球馆
      </p>
      <p class="info-list">
      </p>
      <div id="info-ground">
        <div class="basketball active">
          <p><input type="checkbox" name="stadium" value="1" id="site1"/>01号场地</p>
          <p><input type="checkbox" name="stadium" value="2" id="site2"/> 02号场地</p>
        </div>
        <div class="basketball">
          <p><input type="checkbox" name="stadium" value="3" id="site3"/>03号场地</p>
          <p><input type="checkbox" name="stadium" value="4" id="site4"/> 04号场地</p>
        </div>
        <div class="basketball">
          <p><input type="checkbox" name="stadium" value="5" id="site5"/>05号场地</p>
          <p><input type="checkbox" name="stadium" value="6" id="site6"/> 06号场地</p>
        </div>
        <div class="basketball">
          <p><input type="checkbox" name="stadium" value="7" id="site7"/>07号场地</p>
          <p><input type="checkbox" name="stadium" value="8" id="site8"/> 08号场地</p>
        </div>
        <p class="info-list hint-info"> 注意：每人最多可预定一个全场，两个全场</p>
      </div>
      <div id="info-badmin">
        <div class="badminton active">
          <p><input type="radio" name="badminton" value="1" id="ground1"/>01号场地</p>
        </div>
        <div class="badminton">
          <p><input type="radio" name="badminton" value="2" id="ground2"/> 02号场地</p>
        </div>
        <div class="badminton">
          <p><input type="radio" name="badminton" value="3" id="ground3"/>03号场地</p>
        </div>
        <div class="badminton active">
          <p><input type="radio" name="badminton" value="4" id="ground4"/>04号场地</p>
        </div>
        <div class="badminton">
          <p><input type="radio" name="badminton" value="5" id="ground5"/>05号场地</p>
        </div>
        <div class="badminton">
          <p><input type="radio" name="badminton" value="6" id="ground6"/>06号场地</p>
        </div>
      </div>
      <p class="info-textarea" id="info-textarea">
        <span>备注：</span></br><textarea name="remark" rows="10">${user.remark}</textarea>
      </p>
      <p class="sub"><input  type="submit" value="修改"><input  type="button" value="返回" onclick="window.history.back(-1);"></p>
      <%--<p class="sub"></p>--%>
    </form>
  </div>
</div>

<script src="../common/js/jquery-1.12.3.min.js"></script>
<script src="../common/js/bootstrap.min.js"></script>
<script src="../common/js/edituser.js"></script>
<script src="../common/js/addItem.js"></script>
</body>
<script type="text/javascript">
  $(function(){

    //初始化填入用户信息
    function init(){
      //初始化星期
      var week = $("#week option");
      var i = 0;
      for(i = 0; i < week.length; i++){
        if(week[i].value == ${user.week}){
          week[i].selected = true;
        }
      }
      //初始化开始时间
      var start_time = $("#select-time option");
      for(i = 0; i < start_time.length; i++){
        if(start_time[i].value == ${user.st}){
          start_time[i].selected = true;
        }
      }
      //初始化结束时间
      var end_time = $("#select-time2 option");
      for(i = 0; i < end_time.length; i++){
        if(end_time[i].value == ${user.et}){
          end_time[i].selected = true;
        }
      }
    }

    //篮球场地被重选
    $("input[name='stadium']").change(function(){
      var s = $("input[name='stadium']:checked");
//      var i = 0;
//      var site = "";
//      for(i = 0; i < s.length - 1; i++){
//        site += s[i].value + ",";
//      }
//      if(s.length != 0){
//        site += s[i].value;
//      }
      if(s.length != 0){
        $("#form-submit").attr("action", "<%=basePath%>user/updateUser?id=${user.id}&item=0");
      }else{
        $("#form-submit").attr("action", "<%=basePath%>user/updateUser?id=${user.id}&item=0&stadium=${user.site_no}");
      }
    });

    //羽毛球场地被重选
    $("input[name='badminton']").change(function(){
      var s = $("input[name='badminton']:checked");
//      var i = 0;
//      var site = "";
//      for(i = 0; i < s.length - 1; i++){
//        site += s[i].value + ",";
//      }
//      if(s.length != 0){
//        site += s[i].value;
//      }
      if(s.length != 0){
        $("#form-submit").attr("action", "<%=basePath%>user/updateUser?id=${user.id}&item=1");
      }else{
        $("#form-submit").attr("action", "<%=basePath%>user/updateUser?id=${user.id}&item=1&badminton=${user.site_no}");
      }
    });

    //所有篮球场地checkbox可选
    function ableAllCheckbox(){
      for(var i = 1; i<= 8; i++){
        var site = "#site" + i;
        $(site).attr('disabled',false);
      }
    }

    //所有羽毛球场地radio可选
    function ableAllRadio(){
      for(var i = 1; i<= 6; i++){
        var site = "#ground" + i;
        $(site).attr('disabled',false);
      }
    }

    //开始时间变化
    $("#select-time").change(function(){
      if($("#select-time2").val() != "0" && $("#week").val() != "0" && $("input[name='item']:checked").val()!=null){
        canBook();
      }
    });

    //结束时间变化
    $("#select-time2").change(function(){
      if($("#select-time").val() != "0" && $("#week").val() != "0" && $("input[name='item']:checked").val()!=null){
        canBook();
      }
    });

    //日期变化
    $("#week").change(function(){
      if($("#select-time").val() != "0" && $("#select-time2").val() != "0" && $("input[name='item']:checked").val()!=null){
        canBook();
      }
    });

    //场地类型变化
    $("input[name='item']").change(function(){
      if($("#select-time").val() != "0" && $("#select-time2").val() != "0" && $("#week").val() != "0"){
        canBook();
      }
    });

    //获取场地情况
    function canBook(){
      var start = $("#select-time").val();
      var end = $("#select-time2").val();
      var week = $("#week").val();
      var type = $("input[name='item']:checked").val();
      if(type == 0){
        $.get(
                "<%=basePath%>basketball/getUnbookedSiteByLong",
                {week : week,start_time : start, end_time : end},
                function(data){
                  //alert(data);
                  ableAllCheckbox();
                  var arr = data.split(",");
                  for(var i = 0; i < arr.length; i++){
                    var site = "#site" + arr[i];
                    $(site).attr("disabled","disabled");
                  }
                }
        );
      }else if(type == 1){
        $.get(
                "<%=basePath%>badminton/getUnbookedSiteByLong",
                {week : week,start_time : start, end_time : end},
                function(data){
                  //alert(data);
                  ableAllRadio();
                  var arr = data.split(",");
                  for(var i = 0; i < arr.length; i++){
                    var site = "#ground" + arr[i];
                    $(site).attr("disabled","disabled");
                  }
                }
        );
      }
    }

    init();

  });
</script>
</html>
<!--
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
-->