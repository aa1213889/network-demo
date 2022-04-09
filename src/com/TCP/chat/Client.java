
import java.net.InetAddress;
import java.net.Socket;

//客户端
public class Client {
  public static void main(String[] args) {
    try {
      // 1. 服务端的地址和端口号
      InetAddress serverIP = InetAddress.getByName("127.0.0.1");
      int port = 8088;

      // 2. 创建socket链接
      Socket socket = new Socket(serverIP, port);

      // 3. 发送消息 IO流
      OutputStream os = socket.getOutputStream();
      os.write("hello".getBytes());

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}