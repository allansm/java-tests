package test;

import java.util.zip.Deflater;

public class ZlibTest{
	public static void main(String[]args){
		String big = "";

		for(int i =0;i<9999;i++){
			big+="12";
		}

		System.out.println(big.length());

		byte[] b = big.getBytes();

		Deflater d = new Deflater();
		d.setInput(b);
		d.finish();
		
		byte[] cbyte = new byte[Short.MAX_VALUE];
		int size = d.deflate(cbyte);
		byte[] compressed = new byte[size];

		System.arraycopy(cbyte,0,compressed,0,size);
		
		String o = new String(compressed);
		
		System.out.println(o.length());

		System.out.println(o);
	}
}
