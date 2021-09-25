package test;

public class TextTest{
	public static boolean has(String fulltxt,String txt){
		return fulltxt.contains(txt);
	}

	public static void main(String[]args){
		String text = "helloworld";

		if(has(text,"world")){
			System.out.println("contain");
		}
	}
}
