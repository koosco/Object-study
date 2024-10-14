package object.chapter01;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Theater {

    private TicketSeller ticketSeller;

    public void enter(Audience audience) {
        Ticket ticket = ticketSeller.getTicket();
        if (!audience.isInvited()) {
            audience.pay(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
        }
        audience.putTicket(ticket);
    }
}
