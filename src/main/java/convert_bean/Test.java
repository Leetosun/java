package convert_bean;

/**
 * Created by LeeToSun on 2017/5/6
 */
public class Test {

    public static void main(String[] args) {
        DemoInputDTO demoInputDTO = new DemoInputDTO();
        demoInputDTO.setName("何侦探");
        demoInputDTO.setAge("24");
        Demo demo = demoInputDTO.convertToDemo();
        System.out.println(demo.getName() + "," + demo.getAge());
    }

}
