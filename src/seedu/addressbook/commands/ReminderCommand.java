package seedu.addressbook.commands;
/**
 * Users can add a reminder for themselves to see at the UI of the Addressbook
 */

public class ReminderCommand extends Command {

    public static final String COMMAND_WORD = "reminder";

    public static final String REMINDER_SUCCESS = "your reminder has been added!";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Add your reminder in the program\n"
            + "Example: " + COMMAND_WORD + " give Daphene 20 dollars on Feb 20";

    public String reminder;


    public ReminderCommand(String reminder) {
        this.reminder = reminder;
    }

    @Override
    public CommandResult execute() {
        addressBook.setReminderMessage(reminder);
        return new CommandResult(REMINDER_SUCCESS);
    }

}