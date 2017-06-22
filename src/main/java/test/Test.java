package test;

/**
 * Created by LeeToSun on 2017/6/5
 */
public class Test {

    public static void main(String[] args) {
        ServiceProxy serviceProxy = new ServiceProxy(new ServiceImpl());
        Service service = (Service) serviceProxy.getObject();
        System.out.println(service.hello());
    }

}
