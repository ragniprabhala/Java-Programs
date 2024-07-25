package com.softworldpgms.binaryfilewriteread;

import java.io.*;

public class BinaryFileReader {
    public static void main(String[] args) {
        try {
            
            FileInputStream fileInputStream = new FileInputStream("example.bin");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            // Read from the binary file
            int intValue = dataInputStream.readInt();
            double doubleValue = dataInputStream.readDouble();
            boolean booleanValue = dataInputStream.readBoolean();
            String stringValue = dataInputStream.readUTF();

            
            System.out.println("Int value: " + intValue);
            System.out.println("Double value: " + doubleValue);
            System.out.println("Boolean value: " + booleanValue);
            System.out.println("String value: " + stringValue);

            
            dataInputStream.close();
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}