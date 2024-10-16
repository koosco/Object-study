package object.chapter02.movie.discount;

import object.chapter02.movie.discount.condition.DiscountCondition;
import object.chapter02.common.Money;
import object.chapter02.movie.Screening;

public class AmountDiscountPolicy extends DefaultDiscountPolicy {
    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition...conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
