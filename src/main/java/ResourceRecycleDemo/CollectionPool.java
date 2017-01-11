package ResourceRecycleDemo;

import java.util.*;

/**
 * Created by yangzhec on 2017/1/10.
 */
public class CollectionPool {
    static Map<String,Boolean> map = Collections.synchronizedMap(new HashMap<String,Boolean>());
    static Object lock = new Object();

}
