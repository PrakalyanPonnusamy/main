package filereading_opeartions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filedreader_ops {

	public static void main(String[] args) throws IOException {
		String location = "BufferedWriter_.txt";
		FileReader filereader = new FileReader(location);
		BufferedReader reader_ = new BufferedReader(filereader);
		String thecontents;
		while((thecontents = reader_.readLine()) != null)
		{
			System.out.println(thecontents);
		}
		
		
		

	}

}
