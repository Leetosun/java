package test;

/**
 * Created by LeeToSun on 2017/8/17 0017
 * 自增问题
 */
public class ZiZengDemo {

    public static void main(String[] args) {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            //The Value changed at 'a++' is never used
            a = a++;
            System.out.println(a);
        }
        System.out.println(a);// 0
    }

}
