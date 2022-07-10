
<!DOCTYPE html>
<html lang="en">
<head>
<title>Form 1</title>
</head>
<body>
<form action="form3.php" method="POST">
<h1>Insert Employee form</h1>
<label>Number:</label>
<input type="text" name="number" size="10" placeholder="Enter Number"><br><br>
<label >Name:</label>
<input type="text" name="name" placeholder="Enter Name"> <br><br>
<label >Salary:</label>
<input type="text" name="salary" size="10" placeholder="Enter Salary"><br><br>
<input type="submit" name="save" value="Submit">
<input type="reset" name="reset" value='Reset'>
</form>


<style>
table,th,td{
border: 1px solid black;
}
th,td{
padding: 10px;
}
</style>
</head>
<body>
<?php
$host="localhost";
$username="root";
$password="";
$dbname="sample";
$conn = new mysqli($host,$username,$password,$dbname); if($conn->connect_error){
die("connection failed" .$conn->connect_error);
}
else{
if(isset($_POST["save"])){
$number=$_POST["number"];
$name=$_POST["name"];
$salary=$_POST["salary"];
$sql="INSERT INTO employee(number,name,salary) values ('$number','$name','$salary')";
if($conn->query($sql)){
echo "<table><tr><th>Employee Number</th><td>".$number. "</td></tr><tr><th>Employee Name</th><td>".$name. "</td></tr><tr><th>Employee Salary</th><td>".$salary. "</td></tr></table>";
}else{
echo "Error" .$sql. "<br>" .$conn->error;
}
$conn->close();
}
}
?>
</body>
</html>
