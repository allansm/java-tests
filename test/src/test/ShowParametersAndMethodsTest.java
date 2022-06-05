package test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ShowParametersAndMethodsTest{
	public String message = "helloworld";
	
	public int x = 2;
	public int y = 4;
	public int z = 7;

	public void test() throws Exception{
		System.out.println("class: "+getClass().getName()+"\n");
		
		System.out.println("parameters:\n");	
		
		for(Field field : getClass().getDeclaredFields()){
			System.out.println("\t"+field.getName()+"="+field.get(this));
		}
		
		System.out.println("\nmethods:\n");

		for(Method method : getClass().getMethods()){
			System.out.println("\t"+method.getName());
		}
	}

	public static void main(String[]args) throws Exception{
		new ShowParametersAndMethodsTest().test();
	}
}
