package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
/* FileWriter fileWriter = new FileWriter("File.txt");
        fileWriter.write("Name: Nothing else matters" + "\n");
        fileWriter.write("Singer: Metallica" + "\n");
        fileWriter.write("Genre: «Power ballad»" + "\n");
        fileWriter.write("So close, no matter how far\n" +
                "Couldn't be much more from the heart\n" +
                "Forever trusting who we are\n" +
                "And nothing else matters\n" +
                "Never opened myself this way\n" +
                "Life is ours, we live it our way\n" +
                "All these words I don't just say\n" +
                "And nothing else matters\n" +
                "...");
        FileWriter fileWriter1 = new FileWriter("Song.txt");
        FileReader fileReader = new FileReader("File.txt");
        fileWriter.write("\n");
        Scanner sc = new Scanner(fileReader);
        while (sc.hasNextLine()){
            System.out.println(fileReader);
        }
        fileWriter.close();
        fileWriter1.close();*/
//Задание Б
        Song s = new Song("Nothing else matters", "Metallica", "So close, no matter how far", "«Power ballad»");
        FileWriter fileWriter = new FileWriter(s.getTitle());
        fileWriter.write(s.toString());
        fileWriter.close();
    }
}
