import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TicketStore ts = new TicketStore();
        CustomerObserver c1 = new Customer("Gabriela", "Beach", Arrays.asList("Mamaia", "Costinesti"), LocalDate.of(2025, 8, 20), LocalDate.of(2025, 8, 27));
        ts.addCustomer(c1);
        ts.createOffer("Beach", "Mamaia", 2200, "10%", LocalDate.of(2025, 8, 21), LocalDate.of(2025, 8, 28));
        CustomerObserver c2 = new Customer("Alex", "Mountain", Arrays.asList("Brasov", "Sinaia"), LocalDate.of(2025, 12, 22), LocalDate.of(2025, 12, 27));
        ts.addCustomer(c2);
        ts.createOffer("Mountain", "Brasov", 2200, "20%", LocalDate.of(2025, 12, 22), LocalDate.of(2025, 12, 27));
        new Customer("Ionut", "Altceva", Arrays.asList("Buscat", "Straja"), LocalDate.of(2025, 1, 15), LocalDate.of(2025, 1, 20));
        ts.createOffer("Altceva", "Alt", 2200, "20%", LocalDate.of(2025, 12, 22), LocalDate.of(2025, 12, 27));
        }
    }
