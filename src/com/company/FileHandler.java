package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

    public class FileHandler {

        public FileHandler() {

        }


        public static void writeFile(String path, Object serializableObject){
            try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get(path)))) {
                System.out.println("I writeFile");
                oos.writeObject(serializableObject);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static Object readFile(String path){
            try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(path)))) {
                System.out.println("I readFile");
                Object o = null;
                try {
                    o = ois.readObject();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return o;
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    }

