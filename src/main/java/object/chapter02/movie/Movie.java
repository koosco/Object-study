package object.chapter02.movie;

import java.time.Duration;
import lombok.Getter;
import object.chapter02.movie.discount.DefaultDiscountPolicy;
import object.chapter02.common.Money;

public class Movie {

    private String title;
    private Duration runningTime;
    @Getter
    private Money fee;
    private DefaultDiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DefaultDiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
