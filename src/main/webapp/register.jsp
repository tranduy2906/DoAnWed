<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script>
	function validateform(){
		//Lấy thông tin người dùng
	var id = document.forms["addfrm"]["id"].value;
	var name = document.forms["addfrm"]["name"].value;
	var email = document.forms["addfrm"]["email"].value;
	var country = document.forms["addfrm"]["country"].value;
	var err = document.getElementById("err");
	var mess = "";
		
	//Kiểm tra thông tin
	if(id=="" || name =="" || email =="" || country ==""){
		mess = "Vui long nhap day du thong tin";
		err.innerHTML= mess;
		return false;
	}
}
</script>

</head>
<body>
	<div class="table" style="margin-left: 20%; margin-right: 20%" >
		<h1>Add User</h1>
		<p style="color:red; text-align: center" id ="err"></p>
		<form action="RegisterController" method="post" name="addfrm" onsubmit="return validateform()">
		
			<br /> <input style="width: 100%; height: 23px" type="text"
				name="username" id="username" placeholder="User name"  /><br /><br />
		
			<br /> <input style="width: 100%; height: 23px" type="text"
				name="email" id="email" placeholder="E-mail"/><br /><br />
				
			 <br /> <input style="width: 100%; height: 23px"
				type="text" name="password" id="password" placeholder="Password"/><br /><br/>
				
			<br /> <input style="width: 100%; height: 23px"
				type="text" name="repassword" id="repassword" placeholder="Re-Password"/><br />
			<br />
			<button id="button" type="submit" class="button">Register</button>
		</form>
		
	</div>
</body>
</html>