import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.junit.jupiter.api.Assertions.*;

public class DateCheckerTest {
    DateChecker dateChecker = new DateChecker();

    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"JANUARY", "MARCH", "MAY", "JULY",
                                                            "AUGUST", "OCTOBER", "DECEMBER"})
    public void testHas31Days(DateChecker.Month month){
        assertTrue(dateChecker.has31Days(month), month + " does not have 31 days but it should");
    }

    //Note: February does not have 31 days, so it returns false
    @ParameterizedTest
    @EnumSource(value = DateChecker.Month.class, names = {"FEBRUARY", "APRIL", "JUNE", "SEPTEMBER", "NOVEMBER"})
    public void testDoesNotHave31Days(DateChecker.Month month){
        assertFalse(dateChecker.has31Days(month), month + " has 31 days but it should not");
    }

    @Test
    public void testNullMonthException() {
        assertThrows(IllegalArgumentException.class, () -> {
            dateChecker.has31Days(null);
        }, "Passing a null month should have thrown an exception, but it did not");
    }
}
