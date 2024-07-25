package com.softworldpgms.binaryfilewriteread;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class BinaryFileWriter 
{

	public static void main(String[] args) 
	{
		FileOutputStream fileOutputStream;
		try {
			fileOutputStream = new FileOutputStream("example.bin");
			DataOutputStream dataOutputStream= new DataOutputStream(fileOutputStream);
			
			int intValue = 123;
            double doubleValue = 45.67;
            boolean booleanValue = true;
            String stringValue = "Hello, Binary World!";
            dataOutputStream.writeInt(intValue);
            dataOutputStream.writeDouble(doubleValue);
            dataOutputStream.writeBoolean(booleanValue);
            dataOutputStream.writeUTF(stringValue);

            // Close the output streams
            dataOutputStream.close();
            fileOutputStream.close();
            
            System.out.println("Data has been written");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
