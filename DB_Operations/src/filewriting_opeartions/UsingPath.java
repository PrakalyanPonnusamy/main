package filewriting_opeartions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UsingPath {

	public static void main(String[] args) throws IOException {
		String location = "Usingpath.txt";
		String content = "This type of think is used to store the contents in the txt document using path type";
		Path path = Paths.get(location);
		Files.write(path, content.getBytes());
	}

}
