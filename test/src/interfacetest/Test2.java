package interfacetest;

public class Test2{
	
	public static void test(Test t){
		t.action("hello");
	}

	public static void main(String[]args){
		test((String txt)->{
				txt+="world";
				System.out.println(txt);
			}
		);
	}
}
