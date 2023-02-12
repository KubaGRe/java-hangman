package pl.edu.agh.hangman;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class drawWord {

    public static ArrayList<String> czytaj() throws FileNotFoundException {
        int t = 0, l = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to pass word length? [y/n]");
        if(scan.nextLine().equals("y")){
            t = 1;
            System.out.println("Pass length");
            l = scan.nextInt();
        }
        else
            t = 0;
        ArrayList<String> words = new ArrayList<>();
        try {
            File czytaj= new File(drawWord.class.getResource("/slowa.txt").toURI());
            Scanner odczyt = new Scanner(czytaj);
            while (odczyt.hasNextLine()) {
                String data = odczyt.nextLine();
                if(t == 0){
                    words.add(data);
                }
                if(t == 1){
                    if(data.length()==l)
                        words.add(data);
                }
                //System.out.println(data);
            }
            odczyt.close();
        } catch (FileNotFoundException | URISyntaxException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        return words;
    }
    public static String losuj(ArrayList<String> s){
        int x = s.size();
        Random generator = new Random();
        int y = generator.nextInt(x-1);
        return s.get(y).toLowerCase(Locale.ROOT);
    }

}


