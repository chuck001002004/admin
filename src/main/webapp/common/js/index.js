$(function(){
	var oPsd = $('.modal-body input[name="password"]');
	var oNewPsd = $('.modal-body input[name="newpassword"]');
	var oName = $('.modal-body input[name="username"]');
	var oLastInfo = $('.last-info');
	var isShow = true;
	var timer;

	function init(){
		$("#oldpassword").val("");
		$("#password").attr("disable", "disable");
		$("#newpassword").attr("disable", "disable");
	}
	
	$('.user-info').on('click',function(){
		$('#myModal').modal('show');
	});
	function checkUsername(){
		var name = oName.val();
		if($.trim(name) == ''){
			return false;
		}else{
			return true;
		}
	}
	//function checkPsd(){
	//	var psd = oPsd.val();
	//	console.log(psd);
	//	if($.trim(psd) == ''){
	//		return false;
	//	}else{
	//		return true;
	//	}
	//}
	//function checkNewPsd(){
	//	var newPsd = oNewPsd.val();
	//	if($.trim(newPsd) == ''){
	//		return false;
	//	}else{
	//		return true;
	//	}
	//}
	function checkTwoPsd(){
		var psd = oPsd.val();
		var newPsd = oNewPsd.val();
		if(psd != newPsd){
			return false;
		}else{
			return true;
		}
	}
	$('#update-form').on('submit',function(){
		var oNotice = $("<span class='hint-info'></span>");
		if(!checkUsername()){
	    	oNotice.html('管理员姓名不能为空');
            if(isShow){
                oName.after(oNotice);
                timer = setTimeout(function(){
	            oNotice.css('display','none');
	                isShow = true;
	        	},2000)
            }
            isShow = false;
            return false;
	    }
	    //else if(!checkPsd()){
	    //	oNotice.html('密码不能为空');
         //   if(isShow){
         //       oPsd.after(oNotice);
         //       timer = setTimeout(function(){
	    //        oNotice.css('display','none');
	    //            isShow = true;
	    //    	},2000)
         //   }
         //   isShow = false;
         //   return false;
	    //}else if(!checkNewPsd()){
	    //	oNotice.html('密码不能为空');
         //   if(isShow){
         //       oNewPsd.after(oNotice);
         //       timer = setTimeout(function(){
	    //        oNotice.css('display','none');
	    //            isShow = true;
	    //    	},2000)
         //   }
         //   isShow = false;
         //   return false;
	    //}
		else if(!checkTwoPsd()){
	    	oNotice.html('两次密码输入不一致');
            if(isShow){
                oNewPsd.after(oNotice);
                timer = setTimeout(function(){
	            oNotice.css('display','none');
	                isShow = true;
	        	},2000)
            }
            isShow = false;
            return false;
	    }else{
	    	return true;
	    }
	   
	});

});
