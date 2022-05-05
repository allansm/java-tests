package test;

import java.awt.Toolkit;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class ClipboardTest{
	public static void main(String[]args){
		StringSelection s = new StringSelection("this is a test");
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(s, s);
	}
}
