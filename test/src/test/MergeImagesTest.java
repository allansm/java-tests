package test;

import javax.swing.*;
import static allansm.util.Util.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class MergeImagesTest{
	public static void main(String[]args) throws Exception{
		JFileChooser fc = new JFileChooser();
		JFrame frame = new JFrame();
		
		fc.showOpenDialog(frame);
		String p1 = fc.getSelectedFile().getCanonicalPath();
		
		fc.showOpenDialog(frame);
		String p2 = fc.getSelectedFile().getCanonicalPath();
		
		frame.dispose();
		
		BufferedImage img = ImageIO.read(new File(p1));
		BufferedImage img2 = ImageIO.read(new File(p2));

		img.getGraphics().drawImage(img2, 0, 0, null);

		ImageIO.write(img, "PNG", new File("test.png"));
	}	
}
