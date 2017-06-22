package lambda;

/**
 * Created by LeeToSun on 2017/6/21
 */
@FunctionalInterface
public interface DemoFI<T, S> {
    void test(T t, S s);

    default void t() {
        System.out.println("t");
    }

    default void s() {
        System.out.println("s");
    }

}
