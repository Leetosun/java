package strategy;

/**
 * Created by LeoToSun on 2017/5/11
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    public double calcPrice(double booksPrice) {
        System.out.println("中级会员享受9折优惠");
        return booksPrice * 0.9;
    }
}
