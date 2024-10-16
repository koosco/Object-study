package object.chapter02.movie.discount;

import object.chapter02.common.Money;
import object.chapter02.movie.Screening;

public interface DiscountPolicy {

    Money calculateDiscountAmount(Screening screening);

}
