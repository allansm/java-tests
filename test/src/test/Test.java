package test;

import  java.lang.Runtime;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

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

	public static void main(String[]args){
		for(String n : exec("a.bat")){
			System.out.println(n);
		}
	}
}
