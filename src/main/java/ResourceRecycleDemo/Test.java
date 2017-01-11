package ResourceRecycleDemo;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by yangzhec on 2017/1/10.
 */
public class Test {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(20);
        Random r = new Random();
        for(int i = 0;i<100;i++){

            es.execute(new SubmitInstance());
            es.execute(new SubmitInstance());
            es.execute(new SubmitInstance());

        }
        es.shutdown();
    }
}
