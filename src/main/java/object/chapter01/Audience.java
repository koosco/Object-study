package object.chapter01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Audience {

    private Bag bag;

    public boolean isInvited() {
        return bag.hasInvitation();
    }

    public void putTicket(Ticket ticket) {
        bag.setTicket(ticket);
    }
}
