package week1.les01.practicum3;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintWriter;

class Server {
 public static void main(String[] arg) throws Exception {
   String message = "";
   int counter = 0;
   ServerSocket ss = new ServerSocket(4711);
   Socket s = ss.accept();
   Scanner is = new Scanner(s.getInputStream());


   while (is.hasNextLine()) {
    message = is.next();
    System.out.println(message);
    
    if (message.equals("close chat")) {
      break;
    }
  }
  is.close();
  s.close();
  ss.close();
}
}