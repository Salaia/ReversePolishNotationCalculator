import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void threePlusSevenShouldBeTen(){
        assertEquals(10, calculator.calculatePolishNotation("3 7 +"));
    }

    @Test
    public void SevenMinusThreeShouldBeFour(){
        assertEquals(4, calculator.calculatePolishNotation("7 3 -"));
    }

    @Test
    public void twoMultiplySixShouldBeTwelve(){
        assertEquals(12, calculator.calculatePolishNotation("2 6 *"));
    }

    @Test
    public void anySpacesShouldBeFine() {
        assertEquals(4, calculator.calculatePolishNotation(" 2   2    + "));
    }

    @Test
    public void checkNegativeNumbers() {
        assertEquals(-12, calculator.calculatePolishNotation("-2 6 *"));
        assertEquals(4, calculator.calculatePolishNotation("-2 6 +"));
        assertEquals(8, calculator.calculatePolishNotation("2 -6 -"));

    }
}