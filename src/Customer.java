import java.time.LocalDate;
import java.util.List;

public class Customer implements CustomerObserver {
    private String name;
    private String wantedTicket;
    private List<String> wantedDestinations;
    private LocalDate startPeriod;
    private LocalDate endPeriod;

    public Customer(String name, String wantedTicket, List<String> wantedDestinations, LocalDate startPeriod, LocalDate endPeriod) {
        this.name = name;
        this.wantedTicket = wantedTicket;
        this.wantedDestinations = wantedDestinations;
        this.startPeriod = startPeriod;
        this.endPeriod = endPeriod;
    }

    public String getName() {
        return name;
    }

    public String getWantedTicket() {
        return wantedTicket;
    }

    public List<String> getWantedDestinations() {
        return wantedDestinations;
    }

    public LocalDate getStartPeriod() {
        return startPeriod;
    }

    public LocalDate getEndPeriod() {
        return endPeriod;
    }

    public void notifyCustomer(Tickets ticket) {
        System.out.println("Notification for " + name + ": New offer for " + ticket + " ticket.");
    }

    public String toString() {
        return "Customer " + name + " interested in " + wantedTicket + ", with destinations: " + wantedDestinations + " between " + startPeriod + " and " + endPeriod;
    }
}