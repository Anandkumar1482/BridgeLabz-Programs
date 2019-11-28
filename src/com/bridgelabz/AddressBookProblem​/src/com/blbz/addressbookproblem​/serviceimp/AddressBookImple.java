package com.blbz.addressbookproblem.serviceimp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.blbz.addressbookproblem​.model.AddressBookModel;
import com.blbz.addressbookproblem​.repository.AdressBookReader;
import com.blbz.addressbookproblem​.service.AddressBookService;
import com.blbz.addressbookproblem​.util.Utility;

public class AddressBookImple implements AddressBookService {
	public AddressBookImple() {
		AddressBookModel.setFileName("simplebookjson/book.json");
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addUser(String person, String first, String last, String city, String state, long zip, long phone) {
		JSONObject jsonobject = new JSONObject();
		jsonobject = AdressBookReader.reader();
		JSONArray jsonarray = new JSONArray();
		jsonarray = (JSONArray) jsonobject.get("address book");
		// creating jsonobject put the key and value
		JSONObject ob1 = new JSONObject();
		ob1.put("person", person);
		ob1.put("person first name", first);
		ob1.put("person last name", last);
		ob1.put("city", city);
		ob1.put("state", state);
		ob1.put("zip", zip);
		ob1.put("phone number", phone);
		JSONObject ob2 = new JSONObject();
		// obj2 having key and value
		ob2.put(person, ob1);
		jsonarray.add(ob2);

		try (PrintWriter pw = new PrintWriter(AddressBookModel.getFileName())) {
			pw.write(jsonobject.toString());
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			// System.out.println("trace");
		}
		System.out.println(jsonobject.toJSONString());
	}

	@SuppressWarnings("unchecked")
	@Override
	public void editUser(String person) {
		JSONObject ob2 = new JSONObject();
		Utility utility = new Utility();
		JSONObject jsonobject = new JSONObject();
		jsonobject = AdressBookReader.reader();
		JSONArray jsonarray = new JSONArray();
		jsonarray = (JSONArray) jsonobject.get("address book");
		JSONObject ob1 = new JSONObject();
		JSONObject temp = new JSONObject();
		Iterator it = jsonarray.iterator();
		while (it.hasNext()) {
			ob1 = (JSONObject) it.next();
			ob2 = (JSONObject) ob1.get(person);

			if (ob2 != null) {
				ob2.forEach((k, v) -> {
					System.out.println(k + "\t:\t" + v);
					System.out.println("if you want to edit this press 'y'. any key to skip.");
					String tmp = utility.inputStringLine();
					if (tmp.equals("y")) {
						System.out.println("Enter the value for " + k);
						utility.reset();
						temp.put(k, utility.inputStringLine());

					} else {
						temp.put(k, v);

					}
				});
				ob1.put(person, temp);
			}

		}
		try (PrintWriter pw = new PrintWriter(AddressBookModel.getFileName())) {
			pw.write(jsonobject.toString());
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
			// System.out.println("trace");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean search(String person) {
		JSONObject jsonobject = new JSONObject();
		jsonobject = AdressBookReader.reader();
		JSONArray jsonarray = new JSONArray();
		jsonarray = (JSONArray) jsonobject.get("address book");
		JSONObject ob1 = new JSONObject();
		Iterator it = jsonarray.iterator();
		while (it.hasNext()) {
			ob1 = (JSONObject) it.next();
			JSONObject ob2 = new JSONObject();
			ob2 = (JSONObject) ob1.get(person);
			if (ob2 != null) {
				// System.out.println("data is found " + ob2.toString());
				ob2.forEach((k, v) -> System.out.println(k + ":" + v));
				/*
				 * print (String key,String value){ System.out.println(key+""+value); }
				 */
				return true;
			}
		}
		return false;

	}

	@Override
	public void deleteUser(String person) {
		boolean is = false;
		JSONObject jsonobject = new JSONObject();
		jsonobject = AdressBookReader.reader();
		JSONArray jsonarray = new JSONArray();
		jsonarray = (JSONArray) jsonobject.get("address book");
		JSONObject ob1 = new JSONObject();
		// JSONArray jsonarry=new JSONArray();
		Iterator it = jsonarray.iterator();
		while (it.hasNext()) {
			ob1 = (JSONObject) it.next();
			JSONObject ob2 = new JSONObject();
			ob2 = (JSONObject) ob1.get(person);
			if (ob2 != null) {
				jsonarray.remove(ob1);
				// ob1.remove(person);
				is = true;
				break;
			}
		}
		if (is) {
			try (FileWriter fw = new FileWriter(AddressBookModel.getFileName())) {
				fw.write(jsonobject.toString());
				fw.flush();
				System.out.println("person Data is removed");
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("No data found");
		}

	}

	@Override
	public void saveAs(String fileName) {
		// boolean isFile=false;
		JSONObject jsonobject = new JSONObject();
		jsonobject = AdressBookReader.reader();
		try (FileWriter fw = new FileWriter("simplebookjson/" + fileName + ".json")) {
			fw.write(jsonobject.toString());
			fw.flush();
			AddressBookModel.setFileName("simplebookjson/" + fileName + ".json");
			System.out.println("File is created");

		} catch (IOException e) {
			e.printStackTrace();
		}
		// System.out.println(jsonobject.toString());
	}

	@SuppressWarnings("unused")
	@Override
	public void addJson(String fileName) {

		try {
			FileWriter fw = new FileWriter("simplebookjson/" + fileName + ".json");
			fw.write("{}");
			fw.flush();
			AddressBookModel.setFileName("simplebookjson/" + fileName + ".json");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteJson(String fileName) {
		File file = new File("simplebookjson/" + fileName + ".json");

		if (file.delete()) {
			System.out.println("file is found and deleted");
		} else {
			System.out.println("file is not found");
		}
	}

	@Override
	public void selectJson() {
		Utility utility=new Utility();
		List<String> f=new ArrayList<>();
		int pos=0;
		 try (Stream<Path> paths = Files.walk(Paths.get("simplebookjson/"))) {
		      f=paths.filter(Files::isRegularFile).map(Path->Path.getFileName().toString()).collect(Collectors.toList());
		      for(String s:f) {
		    	  ++pos;
		    	  System.out.println(pos+"."+s);
		      }
		     System.out.println("Please select file you want to work with");
		     pos=0;
		     do {
		    	 if(pos!=0) {System.out.println("Enter valid file number");}
		    	 pos=utility.inputInteger();
		     }while(pos>f.size());
		     AddressBookModel.setFileName("simplebookjson/" + f.get(pos-1));
		     System.out.println( f.get(pos-1)+" is selected");
		 } catch (IOException e) {
		      e.printStackTrace();
		    }
		  
		

}
}
