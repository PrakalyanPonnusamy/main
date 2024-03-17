package filewriting_opeartions;

import java.io.FileOutputStream;
import java.io.IOException;

public class Using_ByteArray_FileOutputStream {

	public static void main(String[] args) throws IOException {
		String Location = "ByteArray_.txt";
		String content = "This is to store the contents in the RAW format, without encrypting kind of stuffs";
		FileOutputStream fileoutputstream_ = new FileOutputStream(Location);
		byte[] writethis = content.getBytes();
		fileoutputstream_.write(writethis);
		fileoutputstream_.close();



	}

}
