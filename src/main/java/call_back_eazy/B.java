package call_back_eazy;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class B {

    public void b() {
        System.out.println("这是b方法");
        A a = new A();
        a.callBack();
    }

}
