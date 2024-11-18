import java.time.LocalDate;

public interface Tickets {
    String getDestination();

    String getTicketType();

    int getPrice();

    String getDiscount();

    LocalDate getStartPeriod();

    LocalDate getEndPeriod();
}
