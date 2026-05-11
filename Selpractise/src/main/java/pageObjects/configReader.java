package pageObjects;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

public class configReader {
	
	public static List<Map<String, String>> readJson() throws FileNotFoundException {
	FileInputStream fis=new FileInputStream("C:\\Users\\savit\\eclipse-workspace\\Selpractise\\src\\test\\java\\com\\org\\seleniumown\\Selpractise\\data\\data.json");
	ObjectMapper mapper=new ObjectMapper();
	List<Map<String,String>> data=mapper.readValue(fis, new TypeReference <List<Map<String,String>>>() {
	});
	return data;
}
}
