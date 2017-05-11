package dynamic_proxy;

/**
 * Created by LeeToSun on 2017/5/11
 */
public class Test {

    public static void main(String[] args) {
        MyInvocation myInvocation = new MyInvocation(new ServiceImpl());
        Service service = (Service) myInvocation.getProxy();
        service.add();
    }

}
