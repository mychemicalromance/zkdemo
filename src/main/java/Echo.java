/**
 * Created by yangzhec on 2017/1/9.
 */
public class Echo {
    public static void main(String[] args) {
        while(true){
            System.out.println("hello world你好啊");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.err.println("error");
            }
        }
    }
}
