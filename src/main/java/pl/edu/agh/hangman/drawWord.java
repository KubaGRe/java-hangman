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
        ArrayList<String> words = new ArrayList<>();
        try {
            File czytaj= new File(drawWord.class.getResource("/slowa.txt").toURI());
            Scanner odczyt = new Scanner(czytaj);
            while (odczyt.hasNextLine()) {
                String data = odczyt.nextLine();
                words.add(data);
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


