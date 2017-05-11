package strategy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    public double calcPrice(double booksPrice) {
        System.out.println("初级会员没有折扣");
        return booksPrice;
    }
}
