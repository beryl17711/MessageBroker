package MyQueue;

import java.io.IOException;

public class ProduceClient {
    public static void main(String[] args) throws IOException {
        MqClient client=new MqClient();
        client.produce("Hello new World!");
    }
}
