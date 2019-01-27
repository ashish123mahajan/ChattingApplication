$(document).ready(function(){
	$("#signup").click(function(){
		var user={};
		user.email=$('#email').val();
		user.password=$('#password').val();
		user.lname=$('#lname').val();
		user.fname=$('#fname').val();
		user.phone=$('#phone').val();
		$.ajax({
			  type: "POST",
			  url: baseurl+"/signup",
			  contentType:"application/json; charset=utf-8",
			  data: JSON.stringify(user),
			  dataType : 'json',
			  success: function(result){
				
			        window.location=baseurl+"/login.html";
			  },
			  error: function(XMLHttpRequest, textStatus, errorThrown) {
			     alert("please enter valid credentials");
				  window.location=baseurl+"signup.html";
			  }
			});
	    
	  });

	$("#sendTologIn").click(function(){

		window.location=baseurl+"/login.html";
	});
	
	
	//console.log(getCookieValue("globalUserId"));
	});