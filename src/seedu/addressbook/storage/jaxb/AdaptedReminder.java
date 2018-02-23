package seedu.addressbook.storage.jaxb;

import seedu.addressbook.commands.ReminderCommand;
import seedu.addressbook.data.reminder.Reminder;
/**
 * JAXB-friendly adapted reminder data holder class.
 */

import javax.xml.bind.annotation.XmlValue;

public class AdaptedReminder {

    @XmlValue

    public String reminderMessage;

    public AdaptedReminder() {}

    public AdaptedReminder(String source) {
        reminderMessage = source;
    }

    public ReminderCommand toModelType() {
        return new ReminderCommand(reminderMessage);
    }

}