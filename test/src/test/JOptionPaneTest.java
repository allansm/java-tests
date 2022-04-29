package test;

import javax.swing.*;
import static allansm.util.Util.*;

public class JOptionPaneTest{
	public static void main(String[]args){
		JOptionPane.showMessageDialog(null, "helloworld", "testing", -1);
		JOptionPane.showMessageDialog(null, "helloworld");

		if(JOptionPane.showConfirmDialog(null, "test") == 0){
			println(JOptionPane.showInputDialog(null, "text"));
		}
	}	
}
