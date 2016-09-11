<?php 

function verifyItems($origItems, $origPrices, $items, $prices) {

    $total = count($origItems);
    $itemsList = array();
    //Preparing our item/price array
    for($i = 0; $i < $total; $i++) {
        $itemsList[$origItems[$i]] = $origPrices[$i]; 
    }
    
    $errors = 0;
    $totalSold = count($items); 
    
    //checking the manager prices vs the actual prices we previously store in our list
    for($i = 0; $i < $totalSold; $i++) {
        if($itemsList[$items[$i]] != $prices[$i]) {
            $errors++;
        }
    }
    
    return $errors;

}

?>