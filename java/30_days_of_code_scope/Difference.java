class Difference {
    private int[] elements;
    public int maximumDifference;

    // Add your code here

    Difference(int[] array) {
        this.elements = array;
    }

    void computeDifference() {
        int maxdiff = 0;
        int total = elements.length;
        for(int i = 0; i < total; i++) {
            for(int j = 0; j < total; j++) {
                
                if(elements[i] < 0)
                    elements[i] = elements[i] * -1;
                
                if(elements[j] < 0)
                    elements[j] = elements[j] * -1;
                
                if( ((elements[i]) - (elements[j])) >= maxdiff) {
                    maxdiff = (elements[i]) - (elements[j]);
                }
            } 
        }    
        this.maximumDifference = maxdiff; 
    }

}