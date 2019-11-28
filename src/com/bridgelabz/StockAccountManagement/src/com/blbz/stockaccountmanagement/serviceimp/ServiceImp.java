package com.blbz.stockaccountmanagement.serviceimp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.blbz.stockaccountmanagement.repository.StockJsonRead;
import com.blbz.stockaccountmanagement.service.StockInterface;

public class ServiceImp implements StockInterface {

	@SuppressWarnings("unchecked")
	@Override
	public void add(String name, double price, double share) {
		JSONObject object = new JSONObject();

		// write data here
		object = StockJsonRead.json();
		JSONArray arr = new JSONArray();

		arr = (JSONArray) object.get("Stock management");
     	//	arr.add(obj2);
		JSONObject obj2 = new JSONObject();
		obj2.put("name", name);
		obj2.put("number of shares", price);
		obj2.put("share price", share);
		obj2.put("total", (price * share));
		arr.add(obj2);
		try (PrintWriter pw = new PrintWriter("stockjson/stockjson.json")) {
			pw.write(object.toString());
			pw.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(object.toString());
	}

	@Override
	public void stockreport() {
		JSONObject jsonobject=new JSONObject();
		//to read jsonobject 
		jsonobject=StockJsonRead.json();
		
		JSONArray array=new JSONArray();
		array=(JSONArray)jsonobject.get("Stock management");
		JSONObject obj = new JSONObject();
		Iterator itr=array.iterator();
		while(itr.hasNext())
		{
			System.out.println("Stock Name\tNo.of Stock\tStock Price\tTotal Value");
		obj=(JSONObject)itr.next();
	     System.out.print(obj.get("name").toString()+"\t");
	     System.out.print(obj.get("number of shares").toString()+"\t");
	     System.out.print(obj.get("share price").toString()+"\t");
	     System.out.print(obj.get("total").toString()+"\t\n");
		}

	}
}
