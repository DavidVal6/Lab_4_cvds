package hangman.model;

public class PowerScore implements GameScore{
    /*
     * Every correct letter is plus 5 ^correctCount to the points and every incorrect letter is minus eight
     *@pre The base Points is 0 
     *@param this are the correct letters selected and the incorrect ones
     *@return the calculate of how many points we got 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        int base = 0;
        double corrects = Math.pow((double)correctCount, (double)5);
        int incorrect = 8 * incorrectCount;
        double total = (double)base + corrects - (double)incorrect;
        if(total > 0 && total < 500){
            return (int)total;
        }else if (total >= 500){
            return 500;
        }else{
            return 0;
        }
    }
}
