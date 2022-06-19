package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        readFromFile2();
    }

    private  static  void writeInFile() throws IOException{
        FileWriter fileWriter = new FileWriter("output.txt");

        int countofNummber = 5;
         fileWriter.write(countofNummber + "\n");

        for (int i = 0; i < 5; i++) {
        fileWriter.write(i +"\n");
        }
        fileWriter.close();
    }

    private static  void readFromFile () throws  IOException{
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("output.txt");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        int c;

        while ((c = fileReader.read()) != -1){
            System.out.println((char) c);
        }
        fileReader.close();
    }

    private static void readFromFile2 () throws FileNotFoundException {

            File file = new File("output.txt");
           Scanner scanner = new Scanner(file);
           while (scanner.hasNext()){
               System.out.println(scanner.nextLine());
           }

           scanner.close();

    }


}
