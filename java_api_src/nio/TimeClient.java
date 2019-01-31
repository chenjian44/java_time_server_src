package nio;

/**
 * @author: 陈健
 * @date: 2019/1/28 15:24
 * @description:
 */
public class TimeClient {

    public static void main(String[] args) {
        int port = 8080;
        try {
            port = Integer.valueOf(port);
        } catch (NumberFormatException e) {

        }

        new Thread(new TimeClientHandle("127.0.0.1", port), "Time-Client-001").start();
    }

}
