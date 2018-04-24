package week1.les01.practicum3;

import java.net.Socket;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

class Client {
	public static void main(String[] arg) throws Exception {
		String message = "";
		Scanner keyboard = new Scanner(System.in);
		Socket s = new Socket("localhost", 4711);
		PrintWriter out = null;

		while(true){
			System.out.println("message: ");
			message = keyboard.nextLine();

			out = new PrintWriter( s.getOutputStream() );
			out.write(message + "\n");
			out.flush();

			if (message.equals("close chat")) {
				break;
			}
		}
		keyboard.close();
		s.close();
	}
}