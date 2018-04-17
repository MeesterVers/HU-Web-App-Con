package week1.les01.simpleclientserver;
import java.net.Socket;
import java.io.OutputStream;

class Client {
  public static void main(String[] arg) throws Exception {
    Socket s = new Socket("145.89.103.142", 4711);
    OutputStream os = s.getOutputStream();
    os.write("HOLENDRECHT\n".getBytes());
    s.close();
  }
}