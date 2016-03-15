import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by xie on 15/12/31.
 */
public class Server {
    public static void main(String[] arg) {
        try{
            ServerSocket server = new ServerSocket(9000);
            Socket socket = server.accept();
            FileInputStream in = new FileInputStream("/Users/xie/work/mine/src/main/java/aa.html");
            OutputStream out = socket.getOutputStream();

            int len = 0;
            byte[] bytes = new byte[1024];
            while((len = in.read()) > 0){
                out.write(bytes,0,len);
            }

            out.flush();
            in.close();
            out.close();
            socket.close();
            server.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
