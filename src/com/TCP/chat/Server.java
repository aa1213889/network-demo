import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

//服务端
public class Server {
  public static void main(String[] args) {

    ServerSocket serverSocket = null;
    Socket socket = null;
    InputStream is = null;
    ByteArrayOutputStream baos = null;
    try {

      // 1.创建服务
      serverSocket = new ServerSocket(8088);

      // 2.等待连接
      socket = serverSocket.accept();

      // 3.读取消息
      is = socket.getInputStream();

      // 管道流
      baos = new ByteArrayOutputStream();
      byte[] bytes = new byte[1024];
      int len;
      while ((len = is.read(bytes)) != -1) {
        baos.write(buffer, 0, len);
      }

      System.out.println(baos.toByteArray());

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      baos.close();
      is.close();
      socket.close();
      serverSocket.close();
    }
  }
}