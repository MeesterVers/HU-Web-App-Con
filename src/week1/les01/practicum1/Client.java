package week1.les01.practicum1;
import java.net.Socket;
import java.io.OutputStream;

class Client {
  public static void main(String[] arg) throws Exception {
    Socket s = new Socket("localhost", 4711);
    OutputStream os = s.getOutputStream();
    os.write("HOLENDRECHT\n".getBytes());
    s.close();
  }
}