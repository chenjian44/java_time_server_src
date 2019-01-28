package nio;

import java.io.IOException;

/**
 * @author: 陈健
 * @date: 2019/1/28 14:29
 * @description:
 */
public class TimeServer {

    public static void main(String[] args) throws IOException {
        int port = 8080;
        if (args != null && args.length > 0) {
            try {
                port = Integer.valueOf(args[0]);
            } catch (NumberFormatException e) {

            }
        }

        MultiplexerTimeServer timeServer = new MultiplexerTimeServer(port);

        new Thread(timeServer, "NIO-MutiplexerTimeServer-001").start();

    }

}
