package filewriting_opeartions;

import java.io.FileWriter;
import java.io.IOException;

public class Using_FileWriter {

	public static void main(String[] args) throws IOException {
		String location = "Filewriter_.txt";
		String content = "This is Written by prakalyan on ASUS Vivobook's Eclipse";
		
		FileWriter filewriter = new FileWriter(location);
		filewriter.write(content);
		filewriter.close();
	}

}
