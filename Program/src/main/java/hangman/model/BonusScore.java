package hangman.model;
/*
 * @implements GameScore
 */
public class BonusScore implements GameScore{
    /*
     * Every correct letter plus ten to the points and every incorrect letter is minus five points
     * @pre The base Points is 0 
     *@param this are the correct letters selected and the incorrect ones
     * @return the calculate of how many points we got 
     */
    public int calculateScore(int correctCount, int incorrectCount){
        int base = 0;
        int corrects = 10 * correctCount;
        int incorrect = 5 * incorrectCount;
        int total = base + corrects - incorrect;
        if(total > 0){
            return total;
        }else{
            return 0;
        }
    }
}
