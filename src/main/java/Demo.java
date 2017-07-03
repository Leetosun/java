import lambda.DemoFI;
import org.junit.Test;

/**
 * Created by LeeToSun on 2017/5/5 demo
 */
public class Demo {

    @Test
    public void stringBuilderTest() {
        System.out.println(new StringBuilder(1).append(2).toString());
        String s = "1";
        s = "2";
        s = new StringBuilder(s).append("3").toString();
        s = new StringBuilder(s).append("4").toString();
        System.out.println(s);
    }

    @Test
    public void lambdaTest() {
        int i = (int) (Math.random() * 10);
        int j = (int) (Math.random() * 10);
        System.out.print(i + "x" + j + "=");
        fun(i, j, Demo::getX);
        fun(i, j, (a, b) -> getX(i, j));
    }

    private static void getX(int i, int j) {
        System.out.println(i * j);
    }

    private void fun(int i, int j, DemoFI<Integer, Integer> demoFI) {
        demoFI.test(i, j);
    }

    @Test
    public void test1() {
        // System.out.println("Hello GitHub");
        String s = "";
        System.out.println(Integer.valueOf("127") == Integer.valueOf("127"));
        System.out.println(Integer.valueOf("128") == Integer.valueOf("128"));
        System.out.println(Integer.parseInt("128") == Integer.valueOf("128"));

        // SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        // Date date1 = sdf.parse("20:00:00");
        // System.out.println(date1.getTime());

        // Date date2 = sdf.parse("7:00:00");
        // System.out.println(date2.getTime());

        // Date date3 = sdf.parse("2017-05-15 19:30:00".substring("2017-05-15 14:39:00".indexOf(" ")));
        // System.out.println(date3.getTime());

        // if (date2.getTime() < date1.getTime()) {
        // System.out.println(date2.getTime() >= date3.getTime() || date3.getTime() >= date1.getTime());
        // }else{
        // System.out.println(date2.getTime() >= date3.getTime() && date3.getTime() >= date1.getTime());
        // }

        // System.out.println("220603199305150012".length());
        // DemoEnum[] demoEnums = DemoEnum.values();
        // for (DemoEnum d : demoEnums) {
        // System.out.println(d.getCode());
        // }

        // int [][] f1 = {{1,2},{4,5}} ;
        // Object oo = f1 ;
        // f1[1] = oo;
        // System.out.println("Best Wishes "+f1[1]);
    }

}
