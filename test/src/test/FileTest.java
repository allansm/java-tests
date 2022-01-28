package test;

import  java.io.FileOutputStream;
import  java.nio.file.Files;
import  java.nio.file.Paths;
import  java.util.List;
//import  java.io.File;
import  java.util.Arrays;
import 	java.nio.file.Path;
import  java.util.Scanner;
import  allansm.file.File;

public class FileTest{
	public static void main(String[]args) throws Exception{
		File test = new File("test.txt");
		test.write("helloworld");
		Path test1 = Paths.get("test.txt");
		Files.move(test1, test1.resolveSibling("test1.txt"));
		test = new File("test1.txt");
		System.out.println(test.path());
		test.remove();
	}
}
