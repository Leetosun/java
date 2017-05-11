package proxy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class Proxy implements Subject {
    Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        System.out.println("begin");
        subject.request();
        System.out.println("end");
    }
}
