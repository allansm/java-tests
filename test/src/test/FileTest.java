package test;

import  java.io.FileOutputStream;
import  java.nio.file.Files;
import  java.nio.file.Paths;
import  java.util.List;
import  java.io.File;
import  java.util.Arrays;
import 	java.nio.file.Path;

public class FileTest{
	public static void writeFile(String fname,String txt){
		try{
			FileOutputStream writer = new FileOutputStream(fname);
				
			writer.write(txt.getBytes());
			writer.close();
		}catch(Exception e){}
	
	}

	public static List<String> getLines(String fname){
		List<String> text = null;
		
		try{
			text = Files.readAllLines(Paths.get(fname));
		}catch(Exception e){}

		return text;
	}

	public static String readFile(String fname){
		boolean flag = false;
		String tmp = "";
		
		for(String line : getLines(fname)){
			if(flag){
				tmp+="\n";
			}else{
				flag = true;
			}

			tmp+=line;
		}

		return tmp;
	}

	public static List<String> dir(String path){
		return Arrays.asList(new File(path).list());
	}

	public static boolean remove(String fname){
		return new File(fname).delete();
	}

	public static String getcwd(){
		Path cp = Paths.get("");
		return cp.toAbsolutePath().toString();	
	}

	public static boolean isFile(String path){
		return new File(path).isFile();
	}

	public static boolean isDir(String path){
		return new File(path).isDirectory();
	}

	public static boolean exists(String path){
		return new File(path).exists();
	}

	public static void main(String[]args){	
		writeFile("test","helloworld");
		
		System.out.println("--------------");	

		System.out.println(readFile("test"));
		
		System.out.println("--------------");	
		
		for(String fn : dir(".")){
			System.out.println(fn);
		}
		System.out.println("--------------");
		System.out.println("test isfile:"+isFile("test"));
		System.out.println("test isdir:"+isDir("test"));
		System.out.println("test exists:"+exists("test"));
		remove("test");
		System.out.println("test exists:"+exists("test"));	
		System.out.println("--------------");
		
		for(String fn : dir(".")){
			System.out.println(fn);
		}

		System.out.println("");
		System.out.println("current dir:"+getcwd());
	}
}
