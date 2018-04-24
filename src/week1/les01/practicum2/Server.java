package week1.les01.practicum2;

import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStream;
import java.util.Scanner;

class Server {
  public static void main(String[] arg) throws Exception {
    String message = "";
    ServerSocket ss = new ServerSocket(4711);
    Socket s = ss.accept();
    Scanner is = new Scanner(s.getInputStream());

    while (is.hasNextLine()) {
     System.out.println(is.nextLine());
    } 
   
    s.close();
    ss.close();
  }
}