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
}
