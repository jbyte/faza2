$(document).ready(function(){
	$(".btn-small").click(function(){
		var text = $(this).text();
		if(text === "Prijava"){
			$(this).text("Odjava");
			$(this).css("background","rgba(255,152,53,1)");
		}else if(text === "Odjava"){
			$(this).text("Prijava");
			$(this).css("background","rgba(42,106,210,0.7)");
		}
	});
	
	$(".input-small").focusout(function(){
		if($(this).val() === ""){
			var regex = /tmp-[a-zA-Z]+/;
			if(!regex.test($(this).attr("name"))){
				$(this).css("border","1px solid #f00");
			}
		}else{
			if($(this).attr("name") === "email"){
				var regex = /^[A-Za-z0-9.-_]+@(?:[A-Za-z0-9]+\.)[A-Za-z]{2,}$/;
				if(!regex.test($(this).val())){
					$(this).css("border","1px solid #f00");
					return;
				}
			}else if($(this).attr("name") === "emso"){
				var regex = /[0-9]{13}/;
				if(!regex.test($(this).val())){
					$(this).css("border","1px solid #f00");
					return;
				}
			}else if($(this).attr("name") === "count"){
				if(parseInt($(this).val()) < 0 || parseInt($(this).val()) > 10){
					$(this).css("border","1px solid #f00");
					return;
				}
			}
			$(this).css("border","1px solid #999");
		}
	});
});

function checkFields(){
	if($(".input-small").val() === ""){
		var regex = /tmp-[A-Za-z]+/;
		if(!regex.test($(".input-small").attr("name"))){
			$(".input-small").css("border","1px solid #f00");
		}
	}else{
		$(".input-small").css("border","1px solid #999")
	}
}

function login(){
	var email = $("[name=email]").val();
	if(email === ""){
		alert("stud@uni.com\nprof@uni.com\nref@uni.com");
	}else{
		if(email === "stud@uni.com"){
			$(".btn-right").attr("href","./overview-student.jsp");
		}else if(email === "prof@uni.com"){
			$(".btn-right").attr("href","./views/overview-professor.jsp");
		}else if(email === "ref@uni.com"){
			$(".btn-right").attr("href","./views/overview-referat.jsp");
		}
	}
}