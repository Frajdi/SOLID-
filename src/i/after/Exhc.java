package i.after;

import java.time.LocalDateTime;

public interface Exhc {
    void checkIn();
    void checkOut(String borrower);
    LocalDateTime getDueDate();
}