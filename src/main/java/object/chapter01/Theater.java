package object.chapter01;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Theater {

    private TicketSeller ticketSeller;

    public void enter(Audience audience) {
        Ticket ticket;
        if (audience.isInvited()) {
            ticket = ticketSeller.getTicket();
        } else {
            ticket = ticketSeller.getTicket();
            audience.getBag().minusAmount(ticket.getFee());
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee());
        }
        audience.putTicket(ticket);
    }
}
