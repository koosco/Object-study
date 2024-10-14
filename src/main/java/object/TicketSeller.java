package object;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TicketSeller {

    private TicketOffice ticketOffice;

    public void sellTo(Audience audience) {
        ticketOffice.sellTo(audience);
    }
}
