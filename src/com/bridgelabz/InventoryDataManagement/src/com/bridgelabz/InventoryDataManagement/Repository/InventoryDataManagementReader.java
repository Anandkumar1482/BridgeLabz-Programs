package com.bridgelabz.InventoryDataManagement.Repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class InventoryDataManagementReader {
	public static JSONObject json() {
		// first we create JSONParse
		JSONParser jsonparse = new JSONParser();

		try (FileReader fr = new FileReader("inventoryfiles/simple.json"); BufferedReader br = new BufferedReader(fr)) {
			return (JSONObject) jsonparse.parse(br);

		} catch (IOException | ParseException e) {
			e.printStackTrace();

		}
		return null;

	}
}
