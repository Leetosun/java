package proxy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class RealSubject implements Subject {
    public void request() {
        System.out.println("RealSubject");
    }
}
