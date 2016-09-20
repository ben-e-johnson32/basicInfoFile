package com.Ben;

import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        // Try opening the file and writing to it.
        try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("info.txt")))
        {
            bufWriter.write("Ben\n");
            bufWriter.write("Green\n");
            bufWriter.write("2545\n");
            bufWriter.close();
        }

        // If something goes wrong, display a message.
        catch (IOException ioe)
        {
            System.out.println("Error writing file.");
        }

        // Try opening the file and reading each line.
        try (BufferedReader bufReader = new BufferedReader(new FileReader("info.txt")))
        {
            String line = bufReader.readLine();

            while (line != null)
            {
                System.out.println(line);
                line = bufReader.readLine();
            }

            bufReader.close();
        }

        // If something goes wrong, display a message.
        catch (IOException ioe)
        {
            System.out.println("Error reading file.");
        }
    }
}
