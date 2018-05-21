import java.io.*;
import java.net.*;
import java.util.*;
class MyChatServer{
	public static void main(String[] args)throws Exception{
		System.out.println("Welcome to my chat server");
		ServerSocket server=new ServerSocket(2234);
		
			Socket client=server.accept();
			System.out.println("client arrived from :"+client.getInetAddress().getHostAddress());
			InputStream is = client.getInputStream();
			OutputStream os= client.getOutputStream();
			PrintWriter pw = new PrintWriter(os);
			
			Scanner sc = new Scanner(is);
			while(true){
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				String sendStr = "raju";
				String rcvStr=null;
				if((rcvStr=sc.nextLine())!=null)
					System.out.println(rcvStr);

				System.out.print(">");
				sendStr=br.readLine();
				pw.println(sendStr);
				pw.flush();

			}
	}
}
