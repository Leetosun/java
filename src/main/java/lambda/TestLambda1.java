package lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by LeeToSun on 2017/6/21
 */
public class TestLambda1 {

    // ---------------------Consumer<T> 消费型接口-------------------------
    @Test
    public void testConsumer() {
        happy(1000, m -> System.out.println(m));
    }

    public void happy(double money, Consumer<Double> con) {
        con.accept(money);
    }

    // ---------------------Supplier<T> 供给型接口--------------------------
    @Test
    public void testSupplier() {
        List<Long> list = getNumList(10, System::currentTimeMillis);
        list.forEach(System.out::println);
    }

    public List<Long> getNumList(int num, Supplier<Long> sup) {
        List<Long> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            list.add(sup.get());
        }
        return list;
    }

    // ---------------------Function<T> 函数型接口---------------------------
    @Test
    public void testFunction() {
        Integer index = strHandler("LeeToSun", s -> s.indexOf("S"));
        System.out.println(index);
    }

    public Integer strHandler(String str, Function<String, Integer> fun) {
        return fun.apply(str);
    }

    // ---------------------Predicate<T> 断言型接口--------------------------
    @Test
    public void testPredicate() {
        List<String> stringList = Arrays.asList("Hello", "Lambda", "Go", "Java");
        List<String> list = filterStr(stringList, s -> s.contains("a"));
        list.forEach(System.out::println);
    }

    public List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> stringList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)) {
                stringList.add(str);
            }
        }
        return stringList;
    }

}
