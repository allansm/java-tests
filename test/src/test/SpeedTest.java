package test;

import allansm.image.ImageHandle;
import allansm.time.TimeHandle;

public class SpeedTest{
	public static void main(String[]args){
		TimeHandle elapse = new TimeHandle();
		
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable(){
			public void run(){
				System.out.println(elapse.elapsed());		
			}
		}));

		for(int i=0;i<30;i++){
			new Thread(new Runnable(){
				public void run(){
					ImageHandle img = new ImageHandle();
					img.screenshot(640, 480, 0, 0);
					img.rescale(480, 480);
					img.base64("jpg");			
				}
			}).start();
		}
	}
}
