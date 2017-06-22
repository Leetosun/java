package convert_test;

import org.springframework.beans.BeanUtils;

/**
 * Created by Administrator on 2017/5/15 0015.
 */
public class Test {
    public static void main(String[] args) {
        Request request = new Request();
        request.setName("张三");
        request.setAge("26");
        Bean b = new Bean();
        BeanUtils.copyProperties(request, b);
        System.out.println(b.getId() + "," + b.getName() + "," + b.getAge());
    }
}
