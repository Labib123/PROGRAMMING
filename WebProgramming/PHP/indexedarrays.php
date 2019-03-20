
<?php 
		// Arrays
		echo ("<h3> Indexed array</h3>");
		echo ( " <h4> Creating arrays and initialize upon creation </h4>") ;
		$daysArray = array("Sunday", "Monday", "Tuesday",    "Wednesday" ,"Thursday", "Friday" , "Saturday");
		var_dump($daysArray);

		// Accessing elements
		// . used for concatenation [ like + is used in Java]
		 echo ( "<h4>");
		 // First element of array is at index 0 
		 $fi = 0;
		 // Last element is at length of array -1
		 $li = count($daysArray) -1 ;

		 echo ( " Array elements can be accessed using either [] or {} . ");
		 echo ( "<br>");
		 printf("  First day of week is : " .$daysArray{$fi} ." and last day is: " .$daysArray[$li]);
		 echo ( "<br>");
		 echo ( " Use count or sizeof functions to get array length");
		 echo ( "<br>");
		 echo ( "Total number of days: " .count($daysArray));
		 echo ( "<br>");
		 echo ( "Total number of days: " .sizeof($daysArray));

		 echo ( "<br>");
		 echo ( "Traverse array using for loop" );
		 echo ( "<br>");

		for($i=0 ; $i < count($daysArray)  ; $i++){

		 	echo($daysArray[$i]);
		 	echo ( "<br>");
		 }

		 echo ( "Traverse array using foreach loop" );
		 echo ( "<br>");

		foreach ($daysArray as $val) {
			echo($val);
		 	echo ( "<br>");
		}

		 echo ( "</h4>"); 
		 echo "<br>";
?>