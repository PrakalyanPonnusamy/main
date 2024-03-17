package reading_and_writing_a_file_JSON;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.mysql.cj.xdevapi.JsonParser;

public class Reading_JSON {

	public static void main(String[] args) throws IOException, ParseException {
		JSONParser jsonparser = new JSONParser();
		FileReader filereader = new FileReader("jsonwriting.json");
		Object parsed = jsonparser.parse(filereader);
		JSONObject jsonobject=(JSONObject) parsed; // converting the object to JSON object as we cannot use get to the direct object
		
		
		// in these three lines we are using type casting 
		String name =(String) jsonobject.get("Name");
		String NickName = (String) jsonobject.get("Nick Name"); // if it is number we have to use long , for storing it in a varibale
		JSONArray array = (JSONArray)jsonobject.get("RP");
		
		System.out.println(name);
		System.out.println(NickName);
		// we are using iterator as web have array inside a json file, to get all the details we are using the iterator function
		Iterator iterator = array.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
