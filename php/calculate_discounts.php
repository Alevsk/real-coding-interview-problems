<?php 

function calculateDiscounts($prices) {

	$total = count($prices):
	$cost = 0;
	$nonDiscountItems = "";

	for($i = 0; $i < $total; $i++) {
		if($i <= ($total - 2) ) {

			if($prices[$i + 1] <= $prices[$i]) {
				$d = $prices[$i + 1];
			}
			else {
				$d = 0;
				$nonDiscountItems .= $i . " ";
			}
			
		} else {
			$d = 0;
			$nonDiscountItems .= $i . " ";
		}

		$cost += $prices[$i] - $d;
	}

	echo $cost ."\n";
	echo trim($nonDiscountItems);

}

?>