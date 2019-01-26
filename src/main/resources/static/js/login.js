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
			  success: function(msg){
			        alert( "Data Saved: " + msg );
			        window.location=baseurl+"/index.html";
			  },
			  error: function(XMLHttpRequest, textStatus, errorThrown) {
			     alert("some error");
			  }
			});
	    
	  });
	});