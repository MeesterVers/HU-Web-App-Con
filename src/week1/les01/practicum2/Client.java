package week1.les01.practicum2;

import java.net.Socket;
import java.io.PrintWriter;

class Client {
  public static void main(String[] arg) throws Exception {
    Socket s = new Socket("localhost", 4711);
    PrintWriter out = null;
    
    out = new PrintWriter( s.getOutputStream() );
    out.write("This a web-page.");
    out.flush();
    s.close();
  }
}