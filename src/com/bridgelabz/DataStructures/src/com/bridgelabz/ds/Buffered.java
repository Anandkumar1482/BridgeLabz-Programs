package com.bridgelabz.ds;

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;
	
	public class Buffered {
	public static void main(String[] args) throws IOException
	{
		File file=new File("/home/anand/Documents/abc.txt");
		FileWriter fw=new FileWriter(file);
		BufferedWriter writer=new BufferedWriter(fw); 
		String  message = ("anand");
		writer.write(message);
	   // writer= new PrintWriter(new File("D:\\testout.txt"));  
	    //writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");                                                   
	    writer.flush();  
	    writer.close();  
		
		
	}

	}
