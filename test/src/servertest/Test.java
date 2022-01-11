package servertest;

import allansm.socket.SocketHandle;
import allansm.image.ImageHandle;

public class Test{
	public static void main(String[]args){
		SocketHandle sock = new SocketHandle();
		ImageHandle img = new ImageHandle();

		while(true){
			sock.server(8080,(s)->{
				sock.send(sock.httpHeader());
				
				sock.send("<style> *{ padding:0px;margin:0px } </style>");

				sock.send("<img id='ss' src='' style='display:block;margin:auto' width='100%' height='100%'>");
				
				String format = "jpg";

				while(true){
					img.screenshot(640,480,0,0);
					
					img.rescale(480,480);

					sock.send("<script>document.getElementById('ss').src = 'data:image/"+format+";base64,' + '");
					sock.send(img.base64(format));
					sock.send("';</script>");
				}
			});
		}
	}
}
