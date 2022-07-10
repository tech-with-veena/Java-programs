<DOCTYPE html>
    <html>
        <h1>ASSIOCAIATIVE ARRAY</h1>
        <style>
            table,th,td{
                border:1px solid;
                border-collapse:collapse;

            }
            th,td{
                padding:20px;
            }
        </style>
    <body>
        <?php
             function Associative(){
                $arr=array("a"=>"1","b"=>"2","c"=>"3","D"=>"4");
                echo"<h2>Array inside function<br></h2>";
                foreach($arr as $x=>$y){
                    echo $x."=>".$y.",";
                }
                echo"<br>";
                return $arr;
      }
      $arr1=associative();
      echo"<h2>associative array in main</h2>" ;
      echo"<table><tr><th>KEY</th><th>VALUE</th></tr>";
      foreach($arr1 as $x=>$y) {
        echo"<tr><td>".$x."</td><td>".$y."</td></tr>";


      }   
      echo"</table>"
    ?>  
    </body>
    </html>     