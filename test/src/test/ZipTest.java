package test;

import java.util.zip.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileInputStream;

public class ZipTest{
	public static void test() throws Exception{
		File f = new File("test.zip");
		
		ZipOutputStream zip = new ZipOutputStream(new FileOutputStream(f));
		ZipEntry entry = new ZipEntry("hello.txt");
		zip.putNextEntry(entry);

		byte[] data = "helloworld".getBytes();
		
		zip.write(data, 0, data.length);
		zip.closeEntry();

		zip.close();
	}

	public static void test2() throws Exception{
		ZipInputStream zip = new ZipInputStream(new FileInputStream(new File("test.zip")));
		ZipEntry entry = zip.getNextEntry();

		byte[] bytes = new byte[1024];
		
		zip.read(bytes);
		zip.closeEntry();

		zip.close();

		System.out.println(entry.getName());
		System.out.println(new String(bytes));

		new File("test.zip").delete();
	}

	public static void main(String[]args) throws Exception{	
		test();
		test2();
	}
}
