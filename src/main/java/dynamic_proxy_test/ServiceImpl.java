package dynamic_proxy_test;

/**
 * Created by LeeToSun on 2017/6/5
 */
public class ServiceImpl implements Service {

    public String hello() {
        System.out.println("中午好");
        return "end";
    }

}
