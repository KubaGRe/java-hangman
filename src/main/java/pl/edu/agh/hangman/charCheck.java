package pl.edu.agh.hangman;

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
            System.out.print(hangman[i]);
            String x = scan.nextLine();
            if (s.indexOf(x.charAt(0)) != -1) {
                ChangeChars.change(s,word,x);
            } else{
                System.out.println("Wrong answer\n");
                i++;
            }
             if(i == 6) {
                 System.out.println("You lost\n");
                 System.out.print(hangman[i]);
                 break;
             }
        }
    }
}
