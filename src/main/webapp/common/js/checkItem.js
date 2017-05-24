(function(){
	var oSelect = document.getElementById('select-time');
	var hour = 8;
	var minute = 0;
	var arr = ['00'];
	for(var i=0; i<23; i++){
		var oOption = document.createElement('option');
		minute += 30;
		if(minute == 60){
			hour += 1;
			minute = 0;
		}
		if(minute == 30){
			oOption.innerHTML = hour + " : " + minute;
			var iVal = oOption.innerHTML;
			//console.log(parseInt(iVal));
			oOption.value = parseInt(iVal) + ".5";
			// console.log("aa"+oOption.value);
		}else{
			oOption.innerHTML = hour + " : " + arr[0];
			var iVal = oOption.innerHTML;
			oOption.value = parseInt(iVal);	
			// console.log(oOption.value);
		}
		oSelect.appendChild(oOption);
	}

	//当没选时间事他的值为空
	var value1 = 0;
	oSelect.onchange = function(){
		var index = oSelect.selectedIndex; // 选中索引
		value1 = parseInt(oSelect.options[index].value); // 选中值	
	}

	var oSelect2 = document.getElementById('select-time2');
	var hour = 9;
	var minute = 0;
	var arr = ['00'];
	for(var i=0; i<23; i++){
		var oOption = document.createElement('option');
		minute += 30;
		if(minute == 60){
			hour += 1;
			minute = 0;
		}
		if(minute == 30){
			oOption.innerHTML = hour + " : " + minute;
			var iVal = oOption.innerHTML;
			//console.log(parseInt(iVal));
			oOption.value = parseInt(iVal) + ".5";
			// console.log("aa"+oOption.value);
		}else{
			oOption.innerHTML = hour + " : " + arr[0];
			var iVal = oOption.innerHTML;
			oOption.value = parseInt(iVal);	
			// console.log(oOption.value);
		}
		oSelect2.appendChild(oOption);

	}
	var value2 = 0;
	oSelect2.onchange = function(){
		var index = oSelect2.selectedIndex; // 选中索引
		value2 = parseInt(oSelect2.options[index].value); // 选中值
	}
	oSelect2.onchange();

	//提交验证
	var oSubmit = document.getElementById('form-submit');
	var aFormList = oSubmit.getElementsByTagName('p');
	var oInfoName = document.getElementById('info-name');
	var oInfoPhone = document.getElementById('info-phone');
	var oInfoDate = document.getElementById('info-date');
	var oInfoTime = document.getElementById('info-time');
	var oInfoAdd = document.getElementById('info-add');
	var oInfoGround= document.getElementById('info-ground');
	var oSpace = document.getElementById('space');
	//检查用户名
	function checkName(){
		var aName = document.getElementsByName("userName")[0];
		if (aName.value == "") {
			return false;
		}else{
			return true;
		}
	}
	//检查电话号码
	function checkPhone(){
		var aPhone = document.getElementsByName("phone")[0];
		var re = /(^[0-9]{3,4}\-[0-9]{3,8}$)|(\d)/;
		if (aPhone.value == "" || !(re.test(aPhone.value))) {
			return false;
		}else{
			return true;
		}
	}
	// 检查日期
    var isShow = true;
    var timer; 
    function checkDate(){
        var oDate = document.getElementById("pickdate");
        var checkedArr = oDate.value.split('-');
        console.log(checkedArr);
        var checkDate  =  new  Date(checkedArr[1]  +  '-'  +  checkedArr[2]  +  '-'  +  checkedArr[0]);
        //选中的时间
        var now = new Date();
        //现在的时间
        var year = now.getFullYear();
        var month = now.getMonth() + 1;
        var date = now.getDate();
        now  =  new  Date(month  +  '-'  +  date  +  '-'  +  year)
        console.log(checkDate);
        console.log(now);
        iDays  =  parseInt((checkDate  -  now)  /  1000  /  60  /  60  /24);
        console.log(iDays);
        if((iDays < 0) || (iDays > 7) || (oDate.value == '')){
        	return false;
        }else{
        	return true;
        }    
    }
    //检查时段
    function checkTime(){
    	oSelect.onchange();
		oSelect2.onchange();
		var nGap = value2 - value1;
		if(value2 <= value1 || value1 == 0 || value2 == 0 || nGap < 1){
			return false;
		}else{
			return true;
		}
    }  
     //检查篮球场
    function checkBasketball(){
    	var aSite = document.getElementsByName("stadium");
		var list = [];
		for(var i=0;i<aSite.length;i++){
			if(aSite[i].checked){
				list.push(parseInt(aSite[i].value));
			}
		}
		if(list.length == 0 || list.length > 2){
			// alert("请正确选择场地");
			return false;
			
		}else if(list.length == 2){
			if(list[0] % 2 == 0 || list[1] != list[0] + 1){
				return false;
			}else{
				return true;
			}
			
    	}else{
    		return	true;
    	}
    	
	}
	//检查羽毛球场
	function cheeckBadminton(){
		var aSite = document.getElementsByName("badminton");
		var list = [];
		for(var i=0;i<aSite.length;i++){
			if(aSite[i].checked){
				list.push(parseInt(aSite[i].value));
			}
		}
		if(list.length == 0 || list.length > 1){
			// alert("请正确选择场地");
			return false;
			
		}else{
    		return	true;
    	}

	}
	function checkPing(){
		var itemVal = parseInt($('#search input[name="item"]:checked').val());
		if(itemVal){
			return true;
		}else{
			return false;
		}
	}
	function checkGround(){
		var itemVal = parseInt($('#search input[name="item"]:checked').val());
		if(itemVal == 0){
			if(checkBasketball()){
				return true;
			}else{
				return false;
			}	
		}else if(itemVal == 1){
			if(cheeckBadminton()){
				return true;
			}else{
				return false;
			}	
			console.log(cheeckBadminton());
		}else if(itemVal == 2){
			if(checkPing()){
				return true;
			}else{
				return false;
			}
			console.log(checkPing());
		}else{
			return false;
		}
	}
    oSubmit.onsubmit = function(){
    	var oNotice = document.createElement('p');
		oNotice.className = "info-list";
	    oNotice.style.color = 'red';
	    oNotice.style.clear = "both";
	    oNotice.style.marginLeft = "2.5%"
	    if(!checkName()){
	    	oNotice.innerHTML = '请输入用户名';
            if(isShow){
                oSubmit.insertBefore(oNotice,oSpace);
                timer = setTimeout(function(){
	            oNotice.style.display = 'none';
	                isShow = true;
	        	},2000)
            }
            isShow = false;
            return false;
	    }else if(!checkPhone()){
	    	oNotice.innerHTML = '请输入电话号码';
            if(isShow){
                oSubmit.insertBefore(oNotice,oSpace);
                timer = setTimeout(function(){
	            oNotice.style.display = 'none';
	                isShow = true;
	        	},2000)
            }
            isShow = false;
            return false;
	    }
	    else if(!checkDate()){
            oNotice.innerHTML = '请选择有效日期（早于现在且在一周之内）';
            if(isShow){
                oSubmit.insertBefore(oNotice,oSpace);
                timer = setTimeout(function(){
	            oNotice.style.display = 'none';
	                isShow = true;
	        	},2000)
            }
            isShow = false;
            return false;
        }else if(!checkTime()){
            oNotice.innerHTML = '请选择有有效地时段（至少一小时）';
            if(isShow){
                oSubmit.insertBefore(oNotice,oSpace);
                timer = setTimeout(function(){
                    oNotice.style.display = 'none'; 
                        isShow = true;     
                },2000)
            }
            isShow = false;
            return false;
        }else if(!checkGround()){
        	oNotice.innerHTML = '请正确选择场地';
            if(isShow){
                oSubmit.insertBefore(oNotice,oInfoGround);
                timer = setTimeout(function(){
                    oNotice.style.display = 'none'; 
                        isShow = true;     
                },2000)
            }
            isShow = false;
            return false;
        }else{
        	return	true;
        }
       
        return false;
    }


})();
	















