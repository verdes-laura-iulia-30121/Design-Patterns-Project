import java.time.LocalDate;

public class MountainTickets implements Tickets {
    private String ticketType;
    private String destination;
    private int price;
    private String discount;
    private LocalDate startPeriod;
    private LocalDate endPeriod;

    public MountainTickets(String ticketType, String destination, int price, String discount, LocalDate startPeriod, LocalDate endPeriod) {
        this.ticketType = ticketType;
        this.destination = destination;
        this.price = price;
        this.discount = discount;
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
    }

    public String getDestination() {
        return destination;
    }

    public int getPrice() {
        return price;
    }

    public String getDiscount() {
        return discount;
    }

    public LocalDate getStartPeriod() {
        return startPeriod;
    }

    public LocalDate getEndPeriod() {
        return endPeriod;
    }

    public String getTicketType() {
        return ticketType;
    }

    public String toString() {
        return "Ticket Type:" + ticketType + " Destination: " + destination + " Price: " + price + "$ Discount: " + discount + " Period: " + startPeriod + " to " + endPeriod;
    }
}
