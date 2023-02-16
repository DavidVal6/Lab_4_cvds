package hangman.model;

/*
* This method implements GameScore 
*/
public class OriginalScore implements GameScore{
    /*
     *@pre The base Points is 100 
     *@param this are the correct letters selected and the incorrect ones
     *@return the calculate of how many points we got 
     */
    public int calculateScore(int correctCount, int incorrectCount) throws ScoreException{
        if(correctCount < 0 || incorrectCount < 0){
            throw new ScoreException(ScoreException.BAD_PARAMETERS);
        }
        int accum = 10 * incorrectCount;
        int total = 100 - accum;
        if(total > 0){
            return total;
        }else{
            return 0;
        }
    }
}
