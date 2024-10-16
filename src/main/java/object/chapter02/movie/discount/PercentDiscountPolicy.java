package object.chapter02.movie.discount;

import object.chapter02.movie.discount.condition.DiscountCondition;
import object.chapter02.common.Money;
import object.chapter02.movie.Screening;

public class PercentDiscountPolicy extends DiscountPolicy {

    private double percent;

    public PercentDiscountPolicy(double percent, DiscountCondition... conditions) {
        super(conditions);
        this.percent = percent;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return screening.getMovieFee().times(percent);
    }
}
