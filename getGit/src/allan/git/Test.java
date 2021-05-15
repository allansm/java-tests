package allan.git;

import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Test extends JFrame{
	//public static Graphics2D g = this.getGraphics();

	public Test()throws Exception{
		setSize(640,480);
		//setVisible(true);
		//setFocusable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);


	}
	public void paint(Graphics2D g)throws Exception{
		//BufferedImage img = ImageIO.read(new URL("http://ghchart.rshah.org/00ff00/allansm").openStream());
		ImageIcon img = new ImageIcon(new URL("https://ghchart.rshah.org/allansm"));
		g.drawImage(img.getImage(),1366,768,null);
	}
	public static void main(String[]args)throws Exception{
		Test t = new Test();
		Graphics2D g = (Graphics2D)t.getGraphics(); 
		t.paint(g);
		t.setVisible(true);
	}
}
