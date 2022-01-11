package servertest;

import allansm.socket.SocketHandle;
import allansm.image.ImageHandle;

public class Test2{
	public static void main(String[]args){
		SocketHandle sock = new SocketHandle();
		ImageHandle img = new ImageHandle();

		while(true){
			sock.server(8080,(s)->{
				img.screenshot(640,480,0,0);

				sock.send(sock.httpHeader("image/png"));
				sock.send(img.bytes());
			});
		}
	}
}
