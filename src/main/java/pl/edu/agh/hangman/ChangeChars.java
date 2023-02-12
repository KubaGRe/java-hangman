package pl.edu.agh.hangman;

public class ChangeChars {
    public static String[] change(String s, String[] word, String c){
        String[] toCheck = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            toCheck[i] = Character.toString(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
            if(toCheck[i].equals(c)){
                word[i] = c;
            }
        }
        return word;
    }
}
