
package com.bridgelabz.clinicmanagement.repository;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.clinicmanagement.model.DoctorDetails;

public class CliniqueRepository {

	
	public static void writeData(String filePath, JSONArray jsonArray) {
		try (FileWriter fileWriter = new FileWriter(filePath)) {
			fileWriter.write(jsonArray.toJSONString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static JSONArray readData(String filePath) {
		JSONArray jsonArray;
		try (FileReader fileReader = new FileReader(filePath)) {
			JSONParser jsonParser = new JSONParser();
			jsonArray = (JSONArray) jsonParser.parse(fileReader);
			return jsonArray;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
