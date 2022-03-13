package pl.sdacademy.unit.test.basic.exercises.unit.task2;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilTest {
    @Test
    void shouldReturnTrueIfStringIsEmpty(){
        //given
        String input = "";
        //when
        boolean result = input.isBlank();
        //then
        assertTrue(result); //JUnit
        assertThat(result).isTrue(); //AsertJ
    }

    @Test
    void shouldReturnFalseIfStringContainsWord() {
        //given
        String input = "SDA";
        //when
        boolean result = StringUtil.isBlank(input);
        //then
        assertFalse(result); //JUnit
        assertThat(result).isFalse(); // AssertJ
    }

}