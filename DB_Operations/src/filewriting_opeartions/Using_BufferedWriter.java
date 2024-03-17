package filewriting_opeartions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Using_BufferedWriter {

	public static void main(String[] args) throws IOException {
		String Location = "BufferedWriter_.txt";
		String content = "This file is to create and stroe this content using buffered writer";
		
		FileWriter filewriter = new FileWriter(Location);
		BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
		bufferedwriter.write(content);
		bufferedwriter.close();
		
	}

}
