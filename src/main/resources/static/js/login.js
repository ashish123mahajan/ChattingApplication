$(document).ready(function(){
	$("#login").click(function(){
		var user={};
		user.email=$('#email').val();
		user.password=$('#password').val();
		$.ajax({
			  type: "POST",
			  url: baseurl+"/login",
			  contentType:"application/json; charset=utf-8",
			  data: JSON.stringify(user),
			  dataType : 'json',
			  success: function(result){
				 
				  document.cookie = "globalUserId=" + result.id;
				
			        window.location=baseurl+"/index.html";
			  },
			  error: function(XMLHttpRequest, textStatus, errorThrown) {
			     alert("Invalid email or password");
				  window.location=baseurl+"login.html";
			  }
			});
	    
	  });
	
	console.log(getCookieValue("globalUserId"));
	});