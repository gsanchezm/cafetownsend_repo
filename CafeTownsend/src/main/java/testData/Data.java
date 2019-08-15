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

	public String getUsername() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("UserCreds");
			String username = (String) oli.get("Username");
			return username;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	public String getPassword() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("UserCreds");
			String password = (String) oli.get("Password");
			return password;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public String getGreeting() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("Data");
			String greeting = (String) oli.get("Greeting");
			return greeting;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public String getFirstName() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("CreateUser");
			String firstName = (String) oli.get("First_Name");
			return firstName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public String getLastName() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("CreateUser");
			String lasttName = (String) oli.get("Last_Name");
			return lasttName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public String getStartdate() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("CreateUser");
			String startDate = (String) oli.get("Start_Date");
			return startDate;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public String getEmail() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("CreateUser");
			String email = (String) oli.get("Email");
			return email;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
	
	public String getEditFirstName() {

		try {
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader(dataPath);
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONObject oli = (JSONObject) jsonObject.get("EditUser");
			String editFirstName = (String) oli.get("Edit_First_Name");
			return editFirstName;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
