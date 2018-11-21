package RyanMcGovern;

public class CodeWordChecker implements StringChecker {
    private int max;
    private int min;
    private String word;

    public CodeWordChecker(int min, int max, String word){
        this.min = min;
        this.max = max;
        this.word = word;
    }

    public CodeWordChecker(String word){
        this.word = word;
        this.min = 6;
        this.max = 20;
    }

    public boolean isValid(String str){
        if (min<=str.length() && str.length()<=max && str.indexOf(word)<1){
            return true;
        }
        else{
            return false;
        }
    }
}
