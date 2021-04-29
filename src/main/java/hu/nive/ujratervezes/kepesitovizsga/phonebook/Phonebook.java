package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Map;


public class Phonebook {

//    private Map<String,String> phonebook = new TreeMap<>();


    public void exportPhonebook(Map<String, String> contacts, String output) {
        if (output == null) {
            throw new IllegalArgumentException("Parameters are invalid");
        }
        if (contacts == null) {
            throw new IllegalArgumentException("Contacts is empty");
        }
        try {
            BufferedWriter writer = Files.newBufferedWriter(Path.of(output));
            for (Map.Entry entry : contacts.entrySet()) {
                String row = entry.getKey() + ": " + entry.getValue();
                writer.write(row);
                writer.flush();
            }
        } catch (IOException e) {
            throw new IllegalArgumentException("Can not write file");
        }

    }
}
