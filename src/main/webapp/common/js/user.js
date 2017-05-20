// function(){
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







// }();