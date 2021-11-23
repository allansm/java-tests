package test;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.util.Scanner;

public class SocketTest{
	public static void main(String[]args) throws Exception{
		ServerSocket server = new ServerSocket(80);
		Socket sock;
		while(true){
	        	sock = server.accept();
			PrintWriter w = new PrintWriter(sock.getOutputStream());
			w.write("hello");
			w.flush();
			w.close();
			sock.close();
		}
		
	}
}
