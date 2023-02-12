package pl.edu.agh.hangman;

public class PrintWord {
    public static String[] writeWord(String s){
        String[] word = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            word[i] = "_";
        }
        return word;
    }
}
