package buffer;

/**
 * Created by jszeligowski on 2018-03-25.
 */
public class ProducerThread extends Thread {

    private Buffer buffer;

    public ProducerThread(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.flush();
            buffer.insert(i);
        }
    }
}
