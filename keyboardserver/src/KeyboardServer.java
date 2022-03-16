import java.awt.Robot;
import allansm.socket.SocketHandle;

public class KeyboardServer{
	public static int port = 12345;

	public static void getArgs(String[]args){
		for(int i=0;i<args.length;i++){
			if(args[i].equals("--port")){
				port = Integer.parseInt(args[i+1]);
			}
		}
	}

	public static void main(String[]args){
		getArgs(args);

		SocketHandle socket = new SocketHandle();
		
		while(true){
			System.out.println("started on port :"+port);

			socket.server(port, (connection)->{
				try{
					Robot bot = new Robot();
									
					while(true){
						String recv = socket.receive(2);

						if(recv.charAt(0) == 'H'){
							bot.keyPress(recv.charAt(1));
						}else{
							bot.keyRelease(recv.charAt(1));
						}

						System.out.print(recv+" ");
					}
				}catch(Exception e){}
			});
		}
	}
}
