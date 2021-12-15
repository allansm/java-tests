package test;

import  java.io.FileOutputStream;
import  java.nio.file.Files;
import  java.nio.file.Paths;
import  java.util.List;
import  java.io.File;
import  java.util.Arrays;
import 	java.nio.file.Path;
import java.util.Scanner;

public class FileTest{
	public static void main(String[]args) throws Exception{
		System.out.print("file:");
		
		long b = Files.size(Paths.get(new Scanner(System.in).nextLine()));
		long kb = b/1024;
		long mb = kb/1024;
		long gb = mb/1024;

		System.out.println(b);
		System.out.println(kb);
		System.out.println(mb);
		System.out.println(gb);
	}
}
