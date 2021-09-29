package test;

import java.util.Arrays;
import java.util.List;

public class TextTest{
	public static boolean has(String fulltxt,String txt){
		return fulltxt.contains(txt);
	}

	public static List<String> explode(String txt,String del){
		return Arrays.asList(txt.split(del));
	}

	public static String replace(String fulltxt,String toreplace,String newtxt){
		return fulltxt.replace(toreplace,newtxt);
	}

	public static void main(String[]args){
		String text = "hello-world";

		if(has(text,"world")){
			System.out.println("contain");
		}

		for(String n : explode(text,"-")){
			System.out.println(n);
		}

		System.out.println(replace(text,"-",""));
	}
}
