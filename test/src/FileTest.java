package test;

import  java.io.FileOutputStream;
import  java.nio.file.Files;
import  java.nio.file.Paths;
import  java.util.List;
import  java.io.File;
import  java.util.Arrays;

public class FileTest{
	public static void writeFile(String fname,String txt){
		try{
			FileOutputStream writer = new FileOutputStream(fname);
				
			writer.write(txt.getBytes());
			writer.close();
		}catch(Exception e){}
	
	}

	public static List<String> readFile(String fname){
		List<String> text = null;
		
		try{
			text = Files.readAllLines(Paths.get(fname));
		}catch(Exception e){}

		return text;
	}

	public static List<String> dir(String path){
		return Arrays.asList(new File(path).list());
	}

	public static void main(String[]args){	
		writeFile("test","helloworld");
		
		for(String line : readFile("test")){
			System.out.println(line);
		}

		for(String fn : dir("../..")){
			System.out.println(fn);
		}	
	}
}
