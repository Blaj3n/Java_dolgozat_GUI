package modell;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBeolvas {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File emberek = new File("src/modell/emberek.txt");
        
        
        BufferedReader br = new BufferedReader(new FileReader(emberek));
        
        String st;
        while ((st = br.readLine()) !=null) {            
            System.out.println(st);
        }
    }
}
