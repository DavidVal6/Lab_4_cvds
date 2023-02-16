package hangman.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import org.junit.Assert;
import org.junit.Test;
public class GameScoreTest {
    @Test
    public void ShouldMakeaOriginalCorrectCaseOnlyCorrectLetter(){
        GameScore a = new OriginalScore();
        try {
            int ans = a.calculateScore(3, 0);
            assertEquals(100, ans);
        } catch (ScoreException e) {
            e.getMessage();
        }
        
    }
    @Test
    public void ShouldReturnZeroBecouseTheNumberIsNegative(){
        GameScore a = new OriginalScore();
        try{
            int ans = a.calculateScore(0, 12);
            assertEquals(0, ans);
        }catch(ScoreException e){
            e.getMessage();
        }
    }
    @Test
    public void ShoudBeNoNegativeAndBpnusScore(){
        GameScore a = new BonusScore();
        try{
            int ans = a.calculateScore(5, 12);
            assertEquals(0, ans);
        }catch(ScoreException e){
            e.getMessage();
        }
    }
    @Test
    public void ShouldBeAPositiveBonusScore(){
        GameScore a = new BonusScore();
        try{
            int ans = a.calculateScore(6, 1);
            assertEquals(55, ans);
        }catch(ScoreException e){
            e.getMessage();
        }
    }
    @Test
    public void ShouldWorkWellPowerScore(){
        GameScore a = new PowerScore();
        try{
        int ans = a.calculateScore(3, 1);
        assertEquals(117, ans);
        }catch(ScoreException e){
            e.getMessage();
        }
    }
    @Test
    public void ShouldThrowException(){
        GameScore a = new PowerScore();
        try{
            int ans = a.calculateScore(-3, 1);
        }catch(ScoreException e){
            assertEquals(ScoreException.BAD_PARAMETERS, e.getMessage());
        }
    }
}