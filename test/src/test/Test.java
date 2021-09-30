package test;

import  java.lang.Runtime;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import  java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.File;
import  java.io.OutputStream;
import  java.net.URL;

public class Test{
	public static List<String> exec(String command){
		List<String> lines = new ArrayList<>();
		try{
			Scanner s = new Scanner(Runtime.getRuntime().exec(command).getInputStream());

			while(s.hasNextLine()){	
				lines.add(s.nextLine());
			}
		}catch(Exception e){e.printStackTrace();}

		return lines;
	}

	public static boolean download(String link,String filepath) {
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new URL(link).openStream());
			
			if(!new File(filepath).exists()) {
				FileOutputStream fileOS = new FileOutputStream(filepath); 
			    	byte data[] = new byte[1024];
			    	int byteContent;
			    	
			    	while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
			        	fileOS.write(data, 0, byteContent);
			    	}
			    
			    	fileOS.close();
			    	System.gc();

				return true;

			}else {
				return false;	
			}
		}catch(Exception e){ 
			e.printStackTrace();
			
			return false;
		}
	}

	public static String getContent(String link) {
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new URL(link).openStream());
		
			byte data[] = new byte[1024];
			int byteContent;
			String tmp = "";	
			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				tmp+=new String(data);
			}
		    
			System.gc();

			return tmp;	
		}catch(Exception e){ 
			e.printStackTrace();
			
			return "";
		}
	}

	public static void main(String[]args){
		for(String n : exec("tasklist")){
			System.out.println(n);
		
		}
		String txt = getContent("https://www.w3.org/TR/PNG/iso_8859-1.txt");

		System.out.println(txt);
	}
}
