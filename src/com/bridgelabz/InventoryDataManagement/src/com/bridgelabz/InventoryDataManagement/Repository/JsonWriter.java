package com.bridgelabz.InventoryDataManagement.Repository;


import java.io.IOException;
import java.io.PrintWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriter {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		// first rice
		JSONObject inventorydetails = new JSONObject();
		inventorydetails.put("rice", "jira ");
		inventorydetails.put("weight ", 50);
		inventorydetails.put("price ", 80);

		// creating inventory object
		JSONObject inventoryObject = new JSONObject();
		inventoryObject.put("Rice", inventorydetails);

		// second pulses
		JSONObject inventorydetails1 = new JSONObject();
		inventorydetails1.put("pulses ", "ragi ");
		inventorydetails1.put("weight ", 60);
		inventorydetails1.put("price ", 100);

		// creating inventory object2
		JSONObject inventoryObject1 = new JSONObject();
		inventoryObject.put("pulses", inventorydetails1);

		// third wheat
		JSONObject inventorydetails2 = new JSONObject();
		inventorydetails2.put("wheat", " Soft Red");
		inventorydetails2.put("weight ", 30);
		inventorydetails2.put("price ", 40);

		// creating inventory object
		JSONObject inventoryObject2 = new JSONObject();
		inventoryObject.put("Wheat", inventorydetails2);

		// Add inventorydetails to list
		JSONArray inventorylist = new JSONArray();
		inventorylist.add(inventoryObject);

		// Write JSON file
		try (PrintWriter pw = new PrintWriter("inventoryfiles/simple.json")) {
			System.out.println(inventorylist);
			pw.write(inventorylist.toJSONString());
			pw.flush();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
