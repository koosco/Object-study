package object.chapter02.movie.discount.condition;

import object.chapter02.movie.Screening;

public interface DiscountCondition {

    boolean isSatisfiedBy(Screening screening);
}
