package strategy;

/**
 * Created by Administrator on 2017/5/11 0011.
 */
public class Price {

    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    public double quote(double booksPrice) {
        return memberStrategy.calcPrice(booksPrice);
    }

}
