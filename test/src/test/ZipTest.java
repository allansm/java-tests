package test;

import java.util.zip.*;
import java.io.File;
import java.io.FileOutputStream;

public class ZipTest{
	public static void main(String[]args) throws Exception{	
		File f = new File("test.zip");
		
		ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(f));
		ZipEntry entry = new ZipEntry("hello.txt");
		zip.putNextEntry(entry);

		byte[] data = "helloworld".getBytes();
		
		zip.write(data, 0, data.length);
		zip.closeEntry();

		zip.close();
	}
}
