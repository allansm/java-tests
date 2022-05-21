package test;

import java.awt.*;
import java.awt.image.*;
import java.awt.TrayIcon.*;

public class ToastTest{
	public static void main(String[]args) throws Exception{
		BufferedImage img = new BufferedImage(1, 1, BufferedImage.TYPE_INT_RGB);
		
		SystemTray tray = SystemTray.getSystemTray();
		
		TrayIcon trayIcon = new TrayIcon(img);        
		trayIcon.setToolTip("Testing");
		
		tray.add(trayIcon);
			
		trayIcon.displayMessage("Message:", "helloworld", MessageType.NONE);
		
		Thread.sleep(7000);
		
		tray.remove(trayIcon);
	}
}
