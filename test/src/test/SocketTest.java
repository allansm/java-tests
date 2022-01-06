package test;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.util.Scanner;

public class SocketTest{
	private static PrintWriter w;
	private static Scanner s;
	
	public static void test(int port,SocketTest2 st){
		try{
			ServerSocket server = new ServerSocket(port);	
			st.action(server.accept());
			
			w.close();
			s.close();
			server.close();
		}catch(Exception e){}		
	}

	public static void test2(Socket sock,String txt){
		try{
			w = new PrintWriter(sock.getOutputStream());
			w.write(txt);
			w.flush();	
		}catch(Exception e){}	
	}

	public static String test3(Socket sock){
		String txt = "";
		
		try{
			s = new Scanner(sock.getInputStream());
			
			while(true){
				String tmp = s.nextLine();
				txt+=tmp;
				if(tmp.contains("Cache")){
					break;
				}
			}

		}catch(Exception e){}

		return txt;
	}

	public static String test4(){
		String header = "HTTP/1.1 200 OK";
		header+="\nContent-Type: text/html;charset=utf-8";
		header+="\n\n";	

		return header;
	}

	public static void main(String[]args) throws Exception{
		while(true){
			test(8080,(s) ->{	
				System.out.println(test3(s));
				
				System.out.println("sending...");	
				
				test2(s,test4());
				test2(s,"helloworld<br/>");
				test2(s,"<div style=\"width:100px;height:100px;background:red\"></div>");
				test2(s,"<div style=\"width:100px;height:100px;background:green\"></div>");
				test2(s,"<div style=\"width:100px;height:100px;background:blue\"></div>");
			});
		}
	}
}
