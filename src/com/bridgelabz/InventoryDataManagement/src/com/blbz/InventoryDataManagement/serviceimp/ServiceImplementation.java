package com.blbz.InventoryDataManagement.serviceimp;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.InventoryDataManagement.service.Service;
import com.bridgelabz.InventoryDataManagement.Repository.InventoryDataManagementReader;

public class ServiceImplementation implements Service {

	@Override
	public void add(String item, String name, int price, int weight) {

		JSONObject obj = new JSONObject();
		JSONObject obj1 = new JSONObject();
		JSONObject tmp = new JSONObject();

		obj = InventoryDataManagementReader.json();
		//we know that the object
		obj1 = (JSONObject) obj.get("inventory data base");
		JSONArray jsonArray = (JSONArray) obj1.get(item);
		tmp.put(item, name);
		tmp.put("price", price);
		tmp.put("weight", weight);
		jsonArray.add(tmp);
		try (FileWriter fr = new FileWriter("inventoryfiles/simple.json")) {
			fr.write(obj.toString());
			fr.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(obj.toString());
	}

	@Override
	public  long calculateInventory(String item) {
		long total = 0;

		JSONObject obj = new JSONObject();
		JSONObject obj1 = new JSONObject();
		JSONObject tmp = new JSONObject();

		obj = InventoryDataManagementReader.json();
		obj1 = (JSONObject) obj.get("inventory data base");
		JSONArray jsonArray = (JSONArray) obj1.get(item);
		Iterator it = jsonArray.iterator();
		while (it.hasNext()) {
			tmp = (JSONObject) it.next();
			//System.out.println(tmp);
			long price = (long) tmp.get("price");
			long weight = (long) tmp.get("weight");
			total = total + (price * weight);
		}
		//System.out.println(total);
		return total;
	}

	
}
