package test;

/**
 * Created by LeeToSun on 2017/8/21 0021
 * 不同访问修饰
 */
public class DifferentAccessModifier {

    private static String sPrivate;

    protected static String sProtected;

    public static String sPublic;

    static String sDefault;

    private static void mPrivate() {
        System.out.println("这是一个私有方法");
    }

    protected static void mProtected() {
        System.out.println("这是一个受保护的方法(子类和同包类)");
    }

    public static void mPublic() {
        System.out.println("这是一个公共的方法");
    }

    static void mDefault() {
        System.out.println("这是一个默认修饰的方法(同包类)");
    }

}
