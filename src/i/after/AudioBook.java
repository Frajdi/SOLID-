package i.after;

import java.time.LocalDateTime;

public class AudioBook implements AudioBookItem, LibraryItem, Exhc {
    String author;
    LocalDateTime borrowDate;
    String borrower;
    int checkOutDurationInDays;
    String libraryId;
    int pages;
    String title;
    int runtimeInMinutes;

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public int getRunTimeInMinutes() {
        return runtimeInMinutes;
    }

    @Override
    public int getPages() {
        return -1;
    }

    @Override
    public LocalDateTime getBorrowDate() {
        return borrowDate;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    @Override
    public int getCheckOutDurationInDays() {
        return checkOutDurationInDays;
    }

    @Override
    public String getLibraryId() {
        return libraryId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void checkIn() {
        borrower = "";
    }

    @Override
    public void checkOut(String borrower) {
        this.borrower = borrower;
        borrowDate = LocalDateTime.now();
    }

    @Override
    public LocalDateTime getDueDate() {
        return borrowDate.plusDays(checkOutDurationInDays);
    }
}