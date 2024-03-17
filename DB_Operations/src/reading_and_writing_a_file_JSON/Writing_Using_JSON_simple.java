package reading_and_writing_a_file_JSON;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Writing_Using_JSON_simple {

	public static void main(String[] args) throws IOException {
		
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("Name", "Prakalyan");
		jsonobject.put("Nick Name", "Jana");
		
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("Prakalyan");
		jsonArray.add("Prahalya");
		
		jsonobject.put("RP", jsonArray);
		
		
		FileWriter filewriter = new FileWriter("jsonwriting.json");
		
		filewriter.write(jsonobject.toJSONString());
		filewriter.close();

	}

}
 