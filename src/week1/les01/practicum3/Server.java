package week1.les01.practicum3;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.io.PrintWriter;

class Server {
  public static void main(String[] arg) throws Exception {
  String message = "";
  PrintWriter out = null;
    ServerSocket ss = new ServerSocket(4712);
    Socket s = ss.accept();
    out = new PrintWriter(s.getOutputStream(), true);
    InputStream in = s.getInputStream();

    int c = in.read();
    while (c != -1) {
      System.out.println((char) c);
      c = in.read();
      if (message.equals("close chat")) {
        break;
      }
    }
    
    s.close();
    ss.close();
  }
}