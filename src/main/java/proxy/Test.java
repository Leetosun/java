package proxy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class Test {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
