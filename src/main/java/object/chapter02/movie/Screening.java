package object.chapter02.movie;

import java.time.LocalDateTime;
import object.chapter02.common.Money;

public class Screening {

    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreened;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreened = whenScreened;
    }

    public boolean isSequence(int sequence) {
        return this.sequence == sequence;
    }

    public LocalDateTime getStartTime() {
        return whenScreened;
    }

    public Money getMovieFee() {
        return movie.getFee();
    }

    public Reservation reserve(Customer customer, int audienceCount) {
        return new Reservation(customer, this, calculaeFee(audienceCount), audienceCount);
    }

    private Money calculaeFee(int audienceCount) {
        return movie.calculateMovieFee(this).times(audienceCount);
    }
}
