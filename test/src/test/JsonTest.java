package test;

import org.json.JSONObject;
import allansm.file.FileHandle;

public class JsonTest{	
	public static void main(String[]args){
		JSONObject obj = new JSONObject(new FileHandle().readFile("test.json"));
		
		System.out.println(obj.toString());
		System.out.println(obj.getString("txt"));
		System.out.println(obj.getInt("n")+obj.getInt("n"));
			
	}
}
