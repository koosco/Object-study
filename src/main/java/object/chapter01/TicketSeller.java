package object.chapter01;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class TicketSeller {
    private TicketOffice ticketOffice;

    public Ticket getTicket() {
        return ticketOffice.getTicket();
    }

    public void sell(Long fee) {
        ticketOffice.plusAmount(fee);
    }

    public void sellTo(Audience audience) {
        Ticket ticket = getTicket();
        if (!audience.isInvited()) {
            sell(ticket.getFee());
            audience.pay(ticket.getFee());
        }
        audience.putTicket(ticket);
    }
}
