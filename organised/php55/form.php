<!DOCTYPE html>
<html>
<head>
<title>Form 2</title>
<style>
table,th,td{
border: 1px solid black;
}
th,td{
padding: 15px;
}
</style>
</head>
<body>
<?php
if(isset($_POST["save"])){
 
$name=$_POST["name"];
$age=$_POST["age"];
$gender=$_POST["gender"];
echo "<table><tr><th>Employee name</th><td>".$name. "</td></tr>"; 
echo "<tr><th>Employee age</th><td>".$age. "</td></tr>";
echo "<tr><th>Employee gender</th><td>".$gender. "</td></tr></table>";
}
?>
</body>
</html>