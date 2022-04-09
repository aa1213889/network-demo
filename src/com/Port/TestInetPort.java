
import java.net.InetSocketAddress;

public class TestInetPort {
  public static void main(String[] args) {
    try {
      InetSocketAddress socketAddress = new InetSocketAddress("localhost", 3000);
      System.out.println(socketAddress); // localhost/127.0.0.1:3000

      System.out.println(socketAddress.getPort()); // 3000
      System.out.println(socketAddress.getHostName()); // localhost
      System.out.println(socketAddress.getAddress()); // localhost/127.0.0.1

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}