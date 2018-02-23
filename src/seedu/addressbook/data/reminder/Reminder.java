package seedu.addressbook.data.reminder;
/**
 * Represents a reminder in the address book.
 * Guarantees: immutable.
 */

public class Reminder {
    public String reminderMessage;

    public Reminder(String message) {
        this.reminderMessage = message;
    }


    @Override
    public String toString() {
        return reminderMessage;
    }
}

