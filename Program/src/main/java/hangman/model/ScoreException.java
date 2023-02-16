package hangman.model;

public class ScoreException extends Exception {
    public static String BAD_PARAMETERS = "The parameters doesnt are in the spected ones";
    public ScoreException(String e){
        super(e);
    }
}
