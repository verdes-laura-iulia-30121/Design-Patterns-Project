import java.time.LocalDate;
import java.util.List;

public interface CustomerObserver {
    String getWantedTicket();

    String getName();

    void notifyCustomer(Tickets var1);

    List<String> getWantedDestinations();

    LocalDate getStartPeriod();

    LocalDate getEndPeriod();
}
