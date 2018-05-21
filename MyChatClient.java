import java.io.*;
import java.util.*;
import java.net.*;
class MyChatClient{
	public static void main(String[] args)throws Exception{
		System.out.println("Welcome to my chat client.");
		Socket client=new Socket("192.168.1.103",2234);

		InputStream is=client.getInputStream();
		OutputStream os=client.getOutputStream();
			

		PrintWriter pw=new PrintWriter(os);
						
		Scanner sc = new Scanner(is);
		String srt=null,str=null;
			while(true){
				System.out.print(">");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				str = br.readLine();
				pw.println(str);
				pw.flush();
				if((srt=sc.nextLine())!=null)
					System.out.println(srt);
			}
	}
}
