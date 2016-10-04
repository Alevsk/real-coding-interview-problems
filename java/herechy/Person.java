class Student extends Person{
    private int[] testScores;
    Student(String firstName, String lastName, int id, int[] testScores) {
        super(firstName,lastName,id);
        this.testScores = testScores;
    }
    
    char calculate() {
        int total = 0;
        char score = ' ';
        for(int i = 0; i < testScores.length; i++)
            total += testScores[i];
        
        total = total / testScores.length;
        
        if(total >= 90 && total <= 100) {
            score = 'O';
        } else if(total >= 80 && total < 90) {
            score = 'E';
        } else if(total >= 70 && total < 80) {
            score = 'A';
        } else if(total >= 55 && total < 70) {
            score = 'P';
        } else if(total >= 40 && total < 55) {
            score = 'D';
        } else {
            score = 'T';
        }
        
        return score;
    }
   
}