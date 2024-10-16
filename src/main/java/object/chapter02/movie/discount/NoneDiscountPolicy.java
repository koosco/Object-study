package object.chapter02.movie.discount;

import object.chapter02.common.Money;
import object.chapter02.movie.Screening;

public class NoneDiscountPolicy implements DiscountPolicy {

    @Override
    public Money calculateDiscountAmount(Screening screening) {
        return Money.ZERO;
    }
}
