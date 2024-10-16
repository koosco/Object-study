package object.chapter02.movie.discount;

import object.chapter02.common.Money;
import object.chapter02.movie.Screening;

public class NoneDiscountPolicy extends DiscountPolicy {

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
