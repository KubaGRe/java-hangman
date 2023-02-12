package pl.edu.agh.hangman;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class charCheck {
    public static void checkWord(String s, String[] hangman){
        int i = 0;


        String[] word = PrintWord.writeWord(s);
        Scanner scan = new Scanner(System.in);

        while(true) {
            for(String w : word){
                System.out.print(w);
            }
            System.out.println("\n");
            System.out.print(hangman[i]);
            System.out.println("\n");
            String x = scan.nextLine().toLowerCase(Locale.ROOT);
            if (s.indexOf(x.charAt(0)) != -1) {
                ChangeChars.change(s,word,x);
            } else{
                System.out.println("Wrong answer\n");
                i++;
            }
             if(i == 6) {
                 System.out.print(hangman[i]);
                 System.out.print("\n");
                 System.out.println("You lost");
                 System.out.println("The word was:\n" + s);
                 break;
             }
             if(!Arrays.asList(word).contains("_")){
                 System.out.println("Congratulation!");
                 System.out.println("You won!");
                 System.out.println("It was indeed");
                 for(String w : word){
                     System.out.print(w);
                 }
                 break;
             }
        }
    }
}
