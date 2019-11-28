package com.blbz.addressbookproblem​.repository;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.blbz.addressbookproblem​.model.AddressBookModel;

public class AdressBookReader {
public static JSONObject reader()
{
	JSONParser jsonparser =new JSONParser();
	try(FileReader fr=new FileReader(AddressBookModel.getFileName());
			BufferedReader br =new BufferedReader(fr)){
		 return (JSONObject) jsonparser.parse(br);
		
	} catch (IOException| ParseException e) {
		
		e.printStackTrace();
	} 
	return null;
}
	
}
