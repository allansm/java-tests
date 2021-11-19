package test;

import  java.lang.Runtime;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import  java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.File;
import  java.io.OutputStream;
import  java.net.URL;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Robot;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Collections;

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

	public static boolean download(String link,String filepath) {
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new URL(link).openStream());
			
			if(!new File(filepath).exists()) {
				FileOutputStream fileOS = new FileOutputStream(filepath); 
			    	byte data[] = new byte[1024];
			    	int byteContent;
			    	
			    	while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
			        	fileOS.write(data, 0, byteContent);
			    	}
			    
			    	fileOS.close();
			    	System.gc();

				return true;

			}else {
				return false;	
			}
		}catch(Exception e){ 
			e.printStackTrace();
			
			return false;
		}
	}

	public static String getContent(String link) {
		try {
			BufferedInputStream inputStream = new BufferedInputStream(new URL(link).openStream());
		
			byte data[] = new byte[1024];
			int byteContent;
			String tmp = "";	
			while ((byteContent = inputStream.read(data, 0, 1024)) != -1) {
				tmp+=new String(data);
			}
		    
			System.gc();

			return tmp;	
		}catch(Exception e){ 
			e.printStackTrace();
			
			return "";
		}
	}

	public static BufferedImage screenshot() throws Exception{
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage capture = new Robot().createScreenCapture(screenRect);
		
		return capture;	
	}

	public static void saveImage(String name,String extension,BufferedImage capture) throws Exception{
		File imageFile = new File(name+"."+extension);
		ImageIO.write(capture, extension, imageFile );
		System.out.println(name+"."+extension);	
	}

	public static void shuffleTest(List<Integer> list){
		Collections.shuffle(list);
		for(int n : list){
			System.out.println(n);	
		}
	}

	public static void main(String[]args){
		for(String n : exec("tasklist")){
			System.out.println(n);
		
		}
		String txt = getContent("https://www.w3.org/TR/PNG/iso_8859-1.txt");

		System.out.println(txt);
		try{
			saveImage("ss","bmp",screenshot());
		}catch(Exception e){}

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		shuffleTest(list);
	}
}
