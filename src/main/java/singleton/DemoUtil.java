package singleton;

/**
 * Created by Administrator on 2017/6/22 0022.
 */
public class DemoUtil {

    private static DemoUtil instance;

    private DemoUtil() {
    }

    public static DemoUtil getInstance() {
        if (instance == null) {
            instance = new DemoUtil();
        }
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(Demo5.INSTANCE.getClass().getName());
        Demo4.getInstance();
        Demo3.getInstance();
        Demo2.getInstance();
    }

}

class Demo1 {

    private Demo1() {
    }

    private static Demo1 instance;

    public static synchronized Demo1 getInstance() {
        if (instance == null) {
            instance = new Demo1();
        }
        return instance;
    }

}

class Demo2 {

    private Demo2() {
    }

    private static Demo2 instance = new Demo2();

    public static Demo2 getInstance() {
        return instance;
    }

}

class Demo3 {

    private Demo3() {
    }

    private static Demo3 instance = null;

    static {
        instance = new Demo3();
    }

    public static Demo3 getInstance() {
        return instance;
    }

}

class Demo4 {

    private static class Demo4Holder {
        private static final Demo4 INSTANCE = new Demo4();
    }

    private Demo4() {
    }

    public static Demo4 getInstance() {
        return Demo4Holder.INSTANCE;
    }

}

enum Demo5 {

    INSTANCE;

    public void method() {

    }

}