package call_back_eazy;

/**
 * Created by Administrator on 2017/5/9 0009.
 */
public class A {

    public void a() {
        B b = new B();
        b.b();
    }

    public void callBack(){
        System.out.println("A的回调");
    }

}
