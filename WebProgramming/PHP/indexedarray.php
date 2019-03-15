<?php

$indexArray = array(1,2,3,4,5);
 for ( $i=0 ; $i< sizeof($indexArray) ; $i++) 
	echo " " . $indexArray[$i];

$asociativeArray = array ( "day1" =>"Monday" , 
 "day2" =>"Tuesday",
 "day3" =>"Wednesday",
  "day3" =>"noday",
 5=> "5");
echo $asociativeArray["day1"]. " " . $asociativeArray[5];

foreach ($asociativeArray as $key => $value) {
	echo $value;
	# code...
}

echo " size of array" .  sizeof($asociativeArray);

$strArray = array( " Ng " , " Lei");
$res = implode("$$$$" , $strArray);
 echo $res;




?>




