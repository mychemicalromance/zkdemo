package ResourceRecycleDemo;

import java.util.*;

/**
 * Created by yangzhec on 2017/1/10.
 */
public class SubmitInstance implements Runnable{
    boolean firstPassenger = false;
    public void run() {
        String instanceId = UUID.randomUUID().toString();
        Map<String,Boolean> t = null;
        synchronized (CollectionPool.lock){
            if(CollectionPool.map.size() == 0){
                this.firstPassenger = true;
            }
            int current = 0;
            CollectionPool.map.put(instanceId,false);
            if(this.firstPassenger){
                int i;
                do{
                    i = CollectionPool.map.size();
                    try {
                        CollectionPool.lock.wait(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }while ((current = CollectionPool.map.size()) > i && current <= 15);
                synchronized (CollectionPool.map){
                    t = new HashMap<String,Boolean>(CollectionPool.map);
                    CollectionPool.map.clear();
                }
            }else{
                CollectionPool.lock.notifyAll();
            }
        }

        if(t != null){
            System.out.println(t.size());
        }
    }
}
