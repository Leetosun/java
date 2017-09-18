package build;

/**
 * Created by MingYngLee on 2017/9/5 0005
 */
public class HappyBean {

    private String name;
    private int age;
    private String status;

    public HappyBean() {
    }

    public HappyBean(HappyBean happyBean) {
        this.name = happyBean.name;
        this.age = happyBean.age;
        this.status = happyBean.status;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStatus() {
        return status;
    }

    public static class Build {

        HappyBean happyBean;

        public Build() {
            happyBean = new HappyBean();
        }

        public Build name(String name) {
            happyBean.name = name;
            return this;
        }

        public Build age(int age) {
            happyBean.age = age;
            return this;
        }

        public Build status(String status) {
            happyBean.status = status;
            return this;
        }

        public HappyBean build() {
            return new HappyBean(happyBean);
        }

    }

}
