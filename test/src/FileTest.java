package test;

import  java.io.FileOutputStream;
import  java.nio.file.Files;
import  java.nio.file.Paths;
import java.util.List;

public class FileTest{
	public static void main(String[]args){
		try{
			FileOutputStream writer = new FileOutputStream("test");
			
			writer.write("helloworld".getBytes());
			writer.close();

			List<String> text = Files.readAllLines(Paths.get("test"));
			
			for(String line : text){
				System.out.println(line);
			}
		}catch(Exception e){}
	}
}
