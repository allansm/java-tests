package test;

import java.util.Base64;

public class Base64test{
	public static void main(String[]args){
		String test = "helloworld";
		test = Base64.getEncoder().encodeToString(test.getBytes());

		System.out.println(test);

		System.out.println(new String(Base64.getDecoder().decode(test)));
	}
}
