package strategy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    public double calcPrice(double booksPrice) {
        System.out.println("高级会员享受8折优惠");
        return booksPrice * 0.8;
    }
}
