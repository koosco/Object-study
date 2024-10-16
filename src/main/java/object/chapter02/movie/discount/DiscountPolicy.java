package object.chapter02.movie.discount;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import object.chapter02.movie.discount.condition.DiscountCondition;
import object.chapter02.common.Money;
import object.chapter02.movie.Screening;

public abstract class DiscountPolicy {

    private List<DiscountCondition> conditions = new ArrayList<>();

    public DiscountPolicy(DiscountCondition ...conditions) {
        this.conditions = Arrays.asList(conditions);
    }

    public Money calculateDiscountAmount(Screening screening) {
        for (DiscountCondition condition : conditions) {
            if (condition.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}
