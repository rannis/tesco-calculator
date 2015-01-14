package tesco.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by remyannis on 13/01/15.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void whenThereIsNoNumbersToAddThenTheResultShouldBeZero() {
        assertEquals(0, calculator.add(""));
    }

    @Test
    public void whenThereIsOneNumberToAddThenTheResultShouldBeThatNumber() {
        assertEquals(1, calculator.add("1"));
    }

    @Test
    public void whenThereAreTwoNumbersToAddWithACommaDelimiterThenTheResultShouldBeTheSumOfTheTwoNumbers() {
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    public void whenThereAreMoreThanTwoNumbersToAddWithACommaDelimitersThenTheResultShouldBeTheSumOfAllTheNumbers() {
        assertEquals(6, calculator.add("1,2,3"));
    }

    @Test
    public void whenThereAreMoreThanTwoNumbersToAddWithANewLineAndACommaDelimitersThenTheResultShouldBeTheSumOfAllTheNumbers() {
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    public void whenTheBeginningOfTheStringContainsASeparateLineIndicatingADefaultDelimiterAndTwoNumbersTheResultShouldBeTheSumOfTheTwoNumbers() {
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test(expected=NumberFormatException.class)
    public void whenThereIsANegativeNumber() {
        calculator.add("//;\n-1;-2");
    }

    @Test
    public void whenANumberIsBiggerThan1000ItShouldBeIgnored() {
        assertEquals(2, calculator.add("1001,2"));
    }
}
