package main.java;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Event extends Task {
    protected LocalDate at;

    public Event(String description, String at) throws DateTimeParseException {
        super(description);
        this.at = LocalDate.parse(at);
    }

    public Event(String description, boolean isDone, String at) throws DateTimeParseException  {
        super(description, isDone);
        this.at = LocalDate.parse(at);
    }

    @Override
    public String getPlainText() {
        return super.getPlainText() + " | " + at;
    }

    @Override
    public String toString() {
        String formattedAt = at.format(DateTimeFormatter.ofPattern("MMM d yyyy"));

        return "[E]" + super.toString() + " (at: " + formattedAt + ")";
    }
}