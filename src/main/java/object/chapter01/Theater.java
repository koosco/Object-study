package object.chapter01;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Theater {

    private TicketSeller ticketSeller;

    public void enter(Audience audience) {
        Ticket ticket = ticketSeller.getTicket();
        if (!audience.isInvited()) {
            ticketSeller.sell(ticket.getFee());
            audience.pay(ticket.getFee());
        }
        audience.putTicket(ticket);
    }
}
