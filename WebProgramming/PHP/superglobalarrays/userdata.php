<!DOCTYPE html>
<html>
<head>
	<title> User Input </title>
</head>
<body>

	<form action="userprocess.php"  method="POST"> 
		<input type="text" name="sname">
		<input type="text" name="subject">

		<label> <input type="radio" name="ratings" value="1"> One  </label>
		<label> <input type="radio" name="ratings" value="2"> Two </label>
		<label> <input type="radio" name="ratings" value="3"> Three  </label>
		<label> <input type="radio" name="ratings" value="4"> Four </label>
		<label> <input type="radio" name="ratings" value="5"> Five </label>

		<input type="submit" >


	</form>

</body>
</html>