package com.softworldpgms.fileReadWrite;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try {
			BufferedReader bf = new BufferedReader(new FileReader("Reader.txt"));
			String line;
			while((line=bf.readLine())!=null)
			{
				System.out.println(line);
			}
		
		bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
