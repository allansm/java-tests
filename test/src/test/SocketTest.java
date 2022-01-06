package test;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.util.Scanner;

public class SocketTest{
	public static void test(int port,SocketTest2 st){
		try{
			ServerSocket server = new ServerSocket(port);	
			st.action(server.accept());
			server.close();
		}catch(Exception e){}		
	}

	public static void test2(Socket sock,String txt){
		try{
			PrintWriter w = new PrintWriter(sock.getOutputStream());
			w.write(txt);
			w.flush();
			w.close();	
		}catch(Exception e){}	
	}

	public static void test3(Socket sock){
		try{
			Scanner s = new Scanner(sock.getInputStream());
			
			while(s.hasNextLine()){
				System.out.println(s.nextLine());
			}

			s.close();
		}catch(Exception e){}
	}

	public static void main(String[]args) throws Exception{
		while(true){
			test(8080,(Socket s) ->{	
				//test3(s);
				System.out.println("sending...");
				test2(s,"helloworld");
			});
		}
	}
}
