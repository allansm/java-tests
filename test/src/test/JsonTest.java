package test;

import org.json.JSONObject;
import org.json.JSONArray;
import allansm.file.FileHandle;

public class JsonTest{	
	public static void main(String[]args){
		JSONObject obj = new JSONObject(new FileHandle().readFile("test.json"));
		
		System.out.println(obj.toString());
		System.out.println(obj.getString("txt"));
		System.out.println(obj.getInt("n")+obj.getInt("n"));
		
		System.out.println(obj.getJSONArray("arr").getInt(2));
		
		JSONObject o = obj.getJSONObject("object");
		System.out.println(o.getString("msg"));
		System.out.println(o.getString("msg2"));
		
		JSONArray a = o.getJSONArray("arr");
		System.out.println(a.getInt(2)+a.getInt(0));	
		for(int i=0;i<a.length();i++){
			System.out.println(a.getInt(i));
		}	
	}
}
