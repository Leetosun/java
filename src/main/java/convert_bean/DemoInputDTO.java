package convert_bean;

import org.springframework.beans.BeanUtils;

/**
 * Created by LeeToSun on 2017/5/6
 * 来源
 */
public class DemoInputDTO {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Demo convertToDemo() {
        DemoInputDTOConvert demoInputDTOConvert = new DemoInputDTOConvert();
        Demo demo = demoInputDTOConvert.convert(this);
        return demo;
    }

    /**
     * 实现接口
     */
    public static class DemoInputDTOConvert implements DTOConvert<DemoInputDTO, Demo> {
        public Demo convert(DemoInputDTO demoInputDTO) {
            Demo demo = new Demo();
            //Spring的bean包
            BeanUtils.copyProperties(demoInputDTO, demo);
            return demo;
        }
    }

}
