<html>
    <h1>Chess board</h1>
<body>
    <table width="400px" border="5px">
        <?php
        for($i=1;$i<=8;$i++){
            echo "<tr>";
            for($j=1;$j<=8;$j++){
                if(($i+$j)%2==0){
                    echo "<td height=40px weight=40px bgcolor=#ffffff></td>";
                }
                else{
                    echo "<td height=40px weight=40px bgcolor=#000000></td>";
                }   
               
                
            }
            echo "</tr>"; 
            
        }
         ?>
   </table>
    </body>
</html>            



