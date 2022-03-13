package pl.sdacademy.unit.test.basic.exercises.unit.task3;

import org.assertj.core.internal.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    @Test
    void shouldReturnCorrectFormatDate() {
        //given
        DateFormatter formatter = new DateFormatter();
        LocalDate input = LocalDate.of(1900,1,15);
        String expected = "1900-15-01";
        //when
        String result = formatter.formatDate(input);
        //then
        assertEquals(expected,result); //JUnit
        assertThat(result).isEqualTo(expected); //AssertJ

    }

}