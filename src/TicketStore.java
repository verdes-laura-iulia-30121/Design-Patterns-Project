import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TicketStore {
    List<CustomerObserver> c = new ArrayList<>();

    public void addCustomer(CustomerObserver customer) {
        String wantedTicket = customer.getWantedTicket();
        if (wantedTicket.equals("Beach") || wantedTicket.equals("Mountain")) {
            c.add(customer);
            System.out.println(customer + " has been added.");
        } else {
            throw new IllegalArgumentException("Unknown ticket type: " + wantedTicket);
        }
    }

    public void removeCustomer(CustomerObserver customer) {
        this.c.remove(customer);
        System.out.println(customer + " has been removed.");
    }

    public void addTicket(Tickets ticket) {
        System.out.println(ticket + " ticket has been added. ");
        this.notifyCustomers(ticket);
    }

    public void notifyCustomers(Tickets ticket) {
        for (CustomerObserver customer : c) {
            if (customer.getWantedTicket().equals(ticket.getTicketType()) && customer.getWantedDestinations().contains(ticket.getDestination())
                    &&
                    customer.getStartPeriod().isBefore(ticket.getEndPeriod()) &&
                    customer.getEndPeriod().isAfter(ticket.getStartPeriod())) {
                customer.notifyCustomer(ticket);
            }
        }
    }

    public void createOffer(String ticketType, String destination, int price, String discount, LocalDate startPeriod, LocalDate endPeriod) {
        Tickets ticket;
        if (ticketType.equals("Beach")) {
            ticket = new BeachTickets(ticketType, destination, price, discount, startPeriod, endPeriod);
        } else {
            if (ticketType.equals("Mountain")) {
                ticket = new MountainTickets(ticketType, destination, price, discount, startPeriod, endPeriod);
            } else {
                throw new IllegalArgumentException("Unknown ticket type: " + ticketType);
            }
        }
        addTicket(ticket);
    }
}
