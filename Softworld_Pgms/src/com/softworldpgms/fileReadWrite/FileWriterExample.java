package com.softworldpgms.fileReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class FileWriterExample {

	public static void main(String[] args) {
	
		try {
			BufferedWriter bf = new BufferedWriter(new FileWriter("output.txt"));
			bf.write("File IO operations  ");
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
