import java.net.*;

public class UDPC {
    public static void main(String[] args) {
        DatagramSocket ds = null;
        DatagramPacket dp = null, reply;
        try {
            ds = new DatagramSocket(1234);
            byte[] buffer = new byte[1000];
            dp = new DatagramPacket(buffer, buffer.length);
            ds.receive(dp);
            System.out.println("From Client : " + (new String(dp.getData())).trim());
            reply = new DatagramPacket("From server ok".getBytes(), "From server ok".length(), dp.getAddress(),
                    dp.getPort());
            ds.send(reply);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (ds != null)
                ds.close();
        }
    }

}
