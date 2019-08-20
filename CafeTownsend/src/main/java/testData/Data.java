package testData;

import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Data {

	String dataPath = "./CafeTownsendData.json";
	
	public String getUrl() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("Data");
			String url = (String) oli.get("URL");
			return url;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";

	}

}
