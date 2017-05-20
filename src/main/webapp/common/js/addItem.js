var oInfoBadmin = $('#info-badmin');
var oInfoGround = $('#info-ground');
$('#search input[name="item"]').on('click',function(){
	var itemVal = parseInt($('#search input[name="item"]:checked').val());
	console.log(itemVal);
	if(itemVal == 0){
		oInfoGround.css('display','block');
		oInfoBadmin.css('display','none');
	}else if(itemVal == 1){
		oInfoBadmin.css('display','block');
		oInfoGround.css('display','none');
	}else if(itemVal == 2){
		oInfoBadmin.css('display','none');
		oInfoGround.css('display','none');
	}
})

  	