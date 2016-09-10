<?php 

/*

Write a method that for a given input string, reverse all the characters inside parentheses. Consider nested parentheses.

Sample input => output,

foobarbaz => foobarbaz
foo(bar)baz => foorabbaz
foo(bar(baz))blim => foo(barzab)blim => foobazrabblim
foo(bar(baz)abc)blim => foo(barzababc)blim => foocbabazrabblim

*/

function reverse($input) {

	//echo $input;

	$output = "";
	$total = strlen($input);
	$bracket = 0;
	$tempBuffer = array();

	for($i = 0; $i < $total; $i++) {

		switch($input[$i]) {
			case '(':
				$tempBuffer[$bracket]['word'] .= '#';
				$bracket++;
			break;

			case ')':
				$bracket--;
			break;

			default:
				if($bracket > 0)
					$tempBuffer[$bracket]['rev'] = true;

				$tempBuffer[$bracket]['word'] .= $input[$i];
		}
	}

	$repTotal = count($tempBuffer);

	//print_r($tempBuffer);
	
	for($j = ($repTotal - 1); $j >= 0; $j--) {

		if(strpos($tempBuffer[$j] , '#') !== false) {
			$tempBuffer[$j]['word'] = str_replace('#', $tempBuffer[$j+1]['word'], $tempBuffer[$j]['word']);	
		}

		if(isset($tempBuffer[$j]['rev']))
			$tempBuffer[$j]['word'] = strrev($tempBuffer[$j]['word']);
	}

	//print_r($tempBuffer);

	return $tempBuffer[0]['word'];

}

//$string = "foo(bar(baz))blim";
//$string = "foo(bar(baz)abc)blim";

$output = "";

if(isset($_GET['input']))
	$output = @reverse($_GET['input']);

?>

<form method="get">
  String <input type="text" name="input"><br/>
  <input type="submit" value="Submit"><br/><br/>

  <?php echo (!empty($_GET['input'])) ? "input: " . htmlentities($_GET['input']) : ""; ?><br/>
  <?php echo (!empty($output)) ? "output: " . htmlentities($output) : ""; ?>

</form>