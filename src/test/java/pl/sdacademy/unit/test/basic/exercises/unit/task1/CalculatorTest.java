package pl.sdacademy.unit.test.basic.exercises.unit.task1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private static Calculator calculator;

    @BeforeAll
    static void init(){
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoValues() {
        //given
        int expected = 5;
        //when
        int result = calculator.add(2, 3);
        //then
        assertEquals(expected,result); //JUnit
        assertThat(result).isEqualTo(expected); //AssertJ
    }

    @Test
    void shouldSubtractTwoValues() {
        //given
        int expected = -1;
        //when
        int result = calculator.subtract(2,3);
        //then
        assertEquals(expected, result); //JUnit
        assertThat(result).isEqualTo(expected); //AssertJ
    }

}