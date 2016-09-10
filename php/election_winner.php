<?php 

function electionWinner($votes) {

    $candidates = array();
    $total = count($votes);
    $maxVotes = 0;
    $tiedCandidates = array();
    
    //storing votes on an asociative array and increasing its value when find a coincidence
    for($i = 0; $i < $total; $i++) {
        $candidates[$votes[$i]]++;
    }
    
    foreach($candidates as $name => $votes) {
        
        //When we get a candidate with more votes than the ones we previusly store reset the tied list
        if($votes > $maxVotes) {
            $tiedCandidates = array(); 
        }
        //Now check for other candidates with the same number of votes and add them to the tied list
        if($votes >= $maxVotes) {
            $maxVotes = $votes;
            $tiedCandidates[] = $name;
        }
    }
    //sorting the list
    sort($tiedCandidates);
    return $tiedCandidates[count($tiedCandidates) - 1];
}

?>