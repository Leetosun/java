package strategy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class Test {
    public static void main(String[] args) {
        Price price = new Price(new IntermediateMemberStrategy());
        System.out.println(price.quote(100));
    }
}
