package com.blbz.stockaccountmanagement.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StockJsonRead {
	// jsonfile reader
	public static JSONObject json() {
		// first we create JSONparse
		JSONParser jsonparse = new JSONParser();
		try (FileReader fr = new FileReader("stockjson/stockjson.json");
				BufferedReader br = new BufferedReader(fr)) {
			return (JSONObject) jsonparse.parse(br);
			//it will parse JSONObject
		} catch (IOException | ParseException e) {
			e.printStackTrace();

		}
		return null;

	}
}