package seedu.addressbook.data.person;

/**
 * Represents a Person's contact infomation in the address book.
 * Super class of Address, Phone, Email
 */
public class Contact {

    private final String value;
    private boolean isPrivate;

    public Contact(String value, Boolean isPrivate) {

        this.value = value;
        this.isPrivate = isPrivate;
    }

    public String toString() {
        return value;
    }

    public int hashCode() {
        return value.hashCode();
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public String getValue () { return value; }

    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

}