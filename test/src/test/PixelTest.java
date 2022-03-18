package test;

import java.awt.Robot;
import java.awt.Color;
import allansm.time.TimeHandle;

public class PixelTest{
	public static void main(String[]args){
		TimeHandle elapse = new TimeHandle();
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(){
			public void run(){
				System.out.println(elapse.elapsed());		
			}
		}));

		try{
			Robot bot = new Robot();
			Color[] colors = new Color[100];
			
			for(int i = 0;i<100;i++){
				colors[i] = bot.getPixelColor(i,0);
			}
		}catch(Exception e){
		
		}
	}	
}
