package i.after;

import java.time.LocalDateTime;

public interface LibraryItem {
    LocalDateTime getBorrowDate();
    String getBorrower();
    int getCheckOutDurationInDays();
    String getLibraryId();
    String getTitle();
}