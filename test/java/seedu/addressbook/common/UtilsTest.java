package seedu.addressbook.common;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UtilsTest {


    @Test
    public void elementsAreUnique() throws Exception {
        // empty list
        assertAreUnique();

        // only one object
        assertAreUnique((Object) null);
        assertAreUnique(1);
        assertAreUnique("");
        assertAreUnique("abc");

        // all objects unique
        assertAreUnique("abc", "ab", "a");
        assertAreUnique(1, 2);

        // some identical objects
        assertNotUnique("abc", "abc");
        assertNotUnique("abc", "", "abc", "ABC");
        assertNotUnique("", "abc", "a", "abc");
        assertNotUnique(1, new Integer(1));
        assertNotUnique(null, 1, new Integer(1));
        assertNotUnique(null, null);
        assertNotUnique(null, "a", "b", null);
    }

    @Test
    public void elementsAreNull() {
        // empty list
        assertNotNull();

        //no null objects
        assertNotNull("r", "k", "n");
        assertNotNull(9, 14);
        assertNotNull(520);

        // some are null objects
        assertHasNull("r", null, "n");
        assertHasNull(null, null, "aaaa");
        assertHasNull(666, null, 123);
        assertHasNull("wow", 123, null, 456, null);

        //all null objects
        assertHasNull(null, null);
        assertHasNull(null, null, null);
    }

    private void assertAreUnique(Object... objects) {
        assertTrue(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertNotUnique(Object... objects) {
        assertFalse(Utils.elementsAreUnique(Arrays.asList(objects)));
    }

    private void assertHasNull(Object... objects) { assertTrue(Utils.isAnyNull(objects)); }

    private void assertNotNull(Object... objects) { assertFalse(Utils.isAnyNull(objects)); }
}
